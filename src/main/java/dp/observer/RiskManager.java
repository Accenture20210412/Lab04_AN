package main.java.dp.observer;

public class RiskManager implements Observer {

    private final Firewall firewall;
    private FirewallIncident newestIncident;

    public RiskManager(Firewall firewall) {
        this.firewall = firewall;
        newestIncident = firewall.getFirewallIncident();
    }

    @Override
    public void update() {
        newestIncident = firewall.getFirewallIncident();
        switch(newestIncident) {
            case LOW_SEVERITY:
                System.out.println("Niskie zagrożenie, nie robię nic");
            case MEDIUM_SEVERITY:
                System.out.println("Srednie zagrożenie, powiadamiam administratora");
            case HIGH_SEVERITY:
                System.out.println("Wysokie zagrożenie, blokuję większość funkcji");
            case EXTREME_SEVERITY:
                System.out.println("Ekstremalne zagrożenie, wyłączam program");
        }
    }
}
