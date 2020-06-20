package pl.coderslab.jeespringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model m){
        String color = "black";
        String backgroundColor = "white";

        final int hour = LocalTime.now().getHour();

        if(hour > 20 || hour < 8){
            color = "white";
            backgroundColor = "black";
        }

        m.addAttribute("color", color);
        m.addAttribute("backgroundColor", backgroundColor);

        return "home";
    }
}
