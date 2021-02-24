package ru.bachar.piwebapi.Measure;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Measure {
    private @Id @GeneratedValue Long id;
    private String date;
    private double temperature;
    private double humidity;

    Measure() {}

    Measure(String date, double temperature, double humidity) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Long getId() {
        return this.id;
    }

    public String getDate() {
        return this.date;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getHumidity() {
        return this.humidity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Measure)) {
            return false;
        }
        Measure m = (Measure) o;
        return this.equals(m);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.date, this.temperature, this.humidity);
    }

    @Override
    public String toString() {
        return "Measure number " + this.id.toString() + " (" + this.date + ")\n" +
        "temperature: " + this.temperature + ", humidity: " + this.humidity + "\n"; 
    }
}
