package logbookproject.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("log")
public class LogController {

    @RequestMapping(value = "log")
    public String index(Model model) {

        model.addAttribute("title", "Welcome to a new Logbook App!");

        return "index";
    }
}
