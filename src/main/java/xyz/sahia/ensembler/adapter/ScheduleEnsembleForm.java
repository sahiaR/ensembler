package xyz.sahia.ensembler.adapter;

import java.util.Objects;

public  final class ScheduleEnsembleForm {
    private String name;
    private String date;
    private String time;

    public ScheduleEnsembleForm() {

    }

    public ScheduleEnsembleForm(String name, String date, String time) {
        this.name = Objects.requireNonNull(name);
        this.date = Objects.requireNonNull(date);
        this.time = Objects.requireNonNull(time);
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
    //TODO business mind peut on creer des null ou mettre default a mediter
    public void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
