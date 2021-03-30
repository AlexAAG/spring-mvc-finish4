package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("AUDI");
        messages.add("BMW");
        messages.add("ВАЗ");
        model.addAttribute("messages", messages);
        return "index";
    }

}