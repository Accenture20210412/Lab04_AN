package main.java.dp.observer;

import java.util.EnumSet;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Firewall {
    private FirewallIncident[] posibbleIncidents = EnumSet.allOf(FirewallIncident.class).toArray(new FirewallIncident[0]);

    private Random fate =  new Random();

    // do zmiany bo wg wz. Obserwator Subject (Firewall) nie może wiedzieć nic więcej o Obserwatorze
    // niż to że są obserwatorami (implementują interfejs)
    private Logger logger = new Logger();

    public void startFirewall() {

        for (;;) {
            try {
                Thread.sleep(TimeUnit.SECONDS.toMillis(2));
                FirewallIncident justNow = posibbleIncidents[fate.nextInt(200)% posibbleIncidents.length];
                logger.log(justNow);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
