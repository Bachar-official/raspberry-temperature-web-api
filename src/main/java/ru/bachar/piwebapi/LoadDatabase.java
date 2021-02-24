package ru.bachar.piwebapi;

import ru.bachar.piwebapi.DHT.*;
import ru.bachar.piwebapi.Measure.*;

import java.util.Date;

import com.pi4j.io.gpio.RaspiPin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(MeasureRepository repository) {
        return args -> {
            log.info("Initializing DHT22 sensor...");
            DHTxx dht22 = new DHT22(RaspiPin.GPIO_07);
            try {
                dht22.init();
                log.info("Sensor initialized. Getting data every 5 minutes.");
                try {
                    DhtData data = dht22.getData();
                    while(true)
                    {
                        log.info(new Measure(new Date().toString(), data.getTemperature(), data.getHumidity()).toString());
                        repository.save(new Measure(new Date().toString(), data.getTemperature(), data.getHumidity()));
                        Thread.sleep(300000);
                    }
                    
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }
}