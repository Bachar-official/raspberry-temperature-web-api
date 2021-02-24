package ru.bachar.piwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PiWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiWebApiApplication.class, args);
	}

}

/*
* From main java application
private static final int DHT_WAIT_INTERVAL = 2000;
DHTxx dht22 = new DHT22(RaspiPin.GPIO_07);
        System.out.println(dht22);

        try {
            dht22.init();
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println(dht22.getData());
                    Thread.sleep(DHT_WAIT_INTERVAL);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
*/