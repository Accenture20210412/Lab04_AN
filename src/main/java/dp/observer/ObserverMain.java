package main.java.dp.observer;

public class ObserverMain {
    public static void main(String[] args) {

        // tworzymy nasze instancje firewalla, loggerutila i riskmanagera
        Firewall firewall = new Firewall();
        LoggerUtil loggerUtil = new LoggerUtil(firewall);
        RiskManager riskManager = new RiskManager(firewall);

        // do firewalla dodajemy subskrybentów
        firewall.attach(loggerUtil);
        firewall.attach(riskManager);

        //uruchamiamy firewalla tj uruchamiamy losowe zdarzenie i informujemy o nim "subskrybentów"
        firewall.startFirewall();


    }
}
