package logbook.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Aircraft {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String type;

    @NotNull
    private int engines;

    @NotNull
    private String tailId;

    @OneToMany
    private List<Flight> flights = new ArrayList<>();

    public Aircraft() {}

    public Aircraft(String name, String type, int engines, String tailId) {
        name = this.name;
        type = this.type;
        engines = this.engines;
        tailId = this.tailId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEngines() {
        return engines;
    }

    public void setEngines(int engines) {
        this.engines = engines;
    }

    public String getTailId() {
        return tailId;
    }

    public void setTailId(String tailId) {
        this.tailId = tailId;
    }
}
