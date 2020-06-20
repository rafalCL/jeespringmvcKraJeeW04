package pl.coderslab.jeespringmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {
    @GetMapping("/free")
    @ResponseBody()
    public String free(){
        LocalDateTime ldt = LocalDateTime.now();

        DayOfWeek dayOfWeek = ldt.getDayOfWeek();
        if(dayOfWeek.toString().equals("SATURDAY") ||
           dayOfWeek.toString().equals("SUNDAY")){
            return "Wolne";
        } else if(ldt.getHour() > 8 && ldt.getHour() < 17){
            return "Pracuje, nie dzwoń.";
        }

        return "Po Pracy";
    }
}
