package ru.bachar.piwebapi.Measure;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Measure {
    private @Id @GeneratedValue Long id;
}
