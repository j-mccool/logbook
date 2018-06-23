package logbook.Controllers;


import logbook.Models.data.AirportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("log")
public class LogController {

    @Autowired
    private AirportDao airportDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Welcome to a new Logbook App!");

        return "logbook/index";
    }

    @RequestMapping(value = "airports")
    public String showAirports(Model model) {

        model.addAttribute("title", "Airports");
        model.addAttribute("airports", airportDao.findAll());

        return "logbook/airports";
    }
}
