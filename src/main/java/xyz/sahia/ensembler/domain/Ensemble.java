package xyz.sahia.ensembler.domain;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Ensemble {
    private final String name;
    private final ZonedDateTime startDateTime;
    private int numberRegistered = 0;

    public Ensemble(String name, ZonedDateTime startDateTime) {
        this.name = Objects.requireNonNull(name,"name cannot be null");
        this.startDateTime = startDateTime;
    }
    public String name(){
        return name;
    }
    public ZonedDateTime startDateTime(){
        return startDateTime;
    }

    public int numberRegistered(){
        return numberRegistered;
    }
}
