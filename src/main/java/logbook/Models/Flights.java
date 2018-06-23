package logbook.Models;

import logbook.Models.Aircraft;
import logbook.Models.Airport;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Flights {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private Date date;

    @NotNull
    private double duration;

    @NotNull
    private Airport origin;

    @NotNull
    private Airport destination;

    @NotNull
    private String remarks;

    private String coPilot;

    private String instructor;

    private Aircraft aircraft;

    public Flights() {}

    public Flights(Date date, double duration, Airport origin, Airport destination, String remarks, String coPilot, String instructor, Aircraft aircraft) {
        this.date = date;
        this.duration = duration;
        this.origin = origin;
        this.destination = destination;
        this.remarks = remarks;
        this.coPilot = coPilot;
        this.instructor = instructor;
        this.aircraft = aircraft;
    }

    public int getId() {
        return id;
    }

    public logbook.Models.Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(logbook.Models.Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public logbook.Models.Airport getOrigin() {
        return origin;
    }

    public void setOrigin(logbook.Models.Airport origin) {
        this.origin = origin;
    }

    public logbook.Models.Airport getDestination() {
        return destination;
    }

    public void setDestination(logbook.Models.Airport destination) {
        this.destination = destination;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(String coPilot) {
        this.coPilot = coPilot;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
