package logbook.Controllers;

import logbook.Models.Aircraft;
import logbook.Models.data.AircraftDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;



@Controller
@RequestMapping("aircraft")
public class AircraftController {

    @Autowired
    private AircraftDao aircraftDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Hangar");
        model.addAttribute("aircraft", aircraftDao.findAll());

        return "aircraft/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddAircraftForm(Model model) {
        model.addAttribute("title", "Add an Aircraft");
        model.addAttribute(new Aircraft());
        return "aircraft/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddAircraftForm(Model model, @ModelAttribute @Valid Aircraft newAircraft, Errors errors) {

        if(errors.hasErrors()) {
            model.addAttribute("title", "Add an Aircraft");
            return "aircraft/add";
        }

        aircraftDao.save(newAircraft);
        return "aircraft/index";
    }
}
