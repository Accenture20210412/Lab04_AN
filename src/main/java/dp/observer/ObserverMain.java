package main.java.dp.observer;

public class ObserverMain {
    public static void main(String[] args) {

        Firewall firewall = new Firewall();
        LoggerUtil loggerUtil = new LoggerUtil(firewall);
        RiskManager riskManager = new RiskManager(firewall);

        firewall.attach(loggerUtil);
        firewall.attach(riskManager);

        firewall.startFirewall();

    }
}
