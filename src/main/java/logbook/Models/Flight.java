package logbook.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private Date date;

    @NotNull
    private double duration;

    @NotNull
    private String remarks;

    @NotNull
    private String coPilot;

    @NotNull
    private String instructor;

    @ManyToOne
    private Aircraft aircraft;

    @ManyToOne
    private Airport origin;

    @ManyToOne
    private Airport destination;

    public Flight() {}

    public Flight(Date date, double duration, String remarks, String coPilot, String instructor) {
        this.date = date;
        this.duration = duration;
        this.remarks = remarks;
        this.coPilot = coPilot;
        this.instructor = instructor;
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
