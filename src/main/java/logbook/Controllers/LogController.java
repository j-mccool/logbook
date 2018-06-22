package logbook.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("log")
public class LogController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Welcome to a new Logbook App!");

        return "logbook/index";
    }
}
