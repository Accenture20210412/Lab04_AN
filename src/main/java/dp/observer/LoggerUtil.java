package main.java.dp.observer;


public class LoggerUtil implements Observer {

    private final Firewall firewall;
    private FirewallIncident newestIncident;

    public LoggerUtil(Firewall firewall) {
        this.firewall = firewall;
    }

    @Override
    public void update() {
        newestIncident = firewall.getFirewallIncident();
        System.out.println(newestIncident.toString());
    }
}
