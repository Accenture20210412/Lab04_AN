package main.java.dp.observer;

public class RiskManager implements Observer {

    private final Firewall firewall;
    private FirewallIncident newestIncident;

    public RiskManager(Firewall firewall) {
        this.firewall = firewall;
    }

    @Override
    public void update() {
        newestIncident = firewall.getFirewallIncident();
        switch(newestIncident) {
            case LOW_SEVERITY:
                System.out.println("Niskie zagrożenie, nie robię nic");
                break;
            case MEDIUM_SEVERITY:
                System.out.println("Srednie zagrożenie, powiadamiam administratora");
                break;
            case HIGH_SEVERITY:
                System.out.println("Wysokie zagrożenie, blokuję większość funkcji");
                break;
            case EXTREME_SEVERITY:
                System.out.println("Ekstremalne zagrożenie, wyłączam program");
                break;
            default:
                System.out.println("Coś dziwnego się dzieje, ale nie znam zagrożenia");
        }
    }
}
