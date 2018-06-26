package logbook.Controllers;


import logbook.Models.Aircraft;
import logbook.Models.Flight;
import logbook.Models.data.AircraftDao;
import logbook.Models.data.AirportDao;
import logbook.Models.data.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("flights")
public class FlightController {

    @Autowired
    private FlightDao flightDao;

    @Autowired
    private AirportDao airportDao;

    @Autowired
    private AircraftDao aircraftDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Flight Log");
        model.addAttribute("flights", flightDao.findAll());
        return "flights/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddFlight(Model model) {
        model.addAttribute("title", "Add a Flight Record");
        model.addAttribute(new Flight());
        model.addAttribute("aircraft", aircraftDao.findAll());
        model.addAttribute("airports", airportDao.findAll());

        return "flights/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddFlight(@RequestParam int aircraftId, Model model, @ModelAttribute @Valid Flight newFlight, Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add a Flight Record");
            model.addAttribute("aircraft", aircraftDao.findAll());
            model.addAttribute("airports", airportDao.findAll());
        }
        Aircraft plane = aircraftDao.findById(aircraftId).orElse(null);

        newFlight.setAircraft(plane);
        flightDao.save(newFlight);
        return "flights/index";
    }
}
