package main.java.dp.observer;


public class LoggerUtil implements Observer {

    public void log(String firewallIncident) {
        System.out.println(firewallIncident);
    }

    @Override
    public void update() {

    }
}
