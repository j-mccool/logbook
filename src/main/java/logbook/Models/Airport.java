package logbook.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Airport {

    @Id
    private int id;

    @NotNull
    private int worldcode;

    @NotNull
    private String code;

    @NotNull
    private String location;

    @NotNull
    private String country;

    @OneToMany
    private List<Flight> flights = new ArrayList<>();

    public Airport() {}

    public Airport(@NotNull int worldcode, @NotNull String code, @NotNull String location, @NotNull String country) {
        this.worldcode = worldcode;
        this.code = code;
        this.location = location;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public int getWorldcode() {
        return worldcode;
    }

    public void setWorldCode(int worldAreaCode) {
        this.worldcode = worldcode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
