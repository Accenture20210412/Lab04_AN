package main.java.dp.observer;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Firewall implements Observable {

    private FirewallIncident[] posibbleIncidents = EnumSet.allOf(FirewallIncident.class).toArray(new FirewallIncident[0]);
    private Set<Observer> observers = new HashSet<>();
    private FirewallIncident firewallIncident;

    private Random fate =  new Random();


    // Logger został usunięty, daje informacje obserwatorom zgodnie z poniższym

    public void startFirewall() {

            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                FirewallIncident firewallIncident = posibbleIncidents[fate.nextInt(200)% posibbleIncidents.length];
                publishIncident(firewallIncident);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void publishIncident(FirewallIncident incident) {
        firewallIncident = incident;
        notifyObservers();
    }

    public FirewallIncident getFirewallIncident() {
        return firewallIncident;
    }

    public void setFirewallIncident(FirewallIncident firewallIncident) {
        this.firewallIncident = firewallIncident;
    }
}
