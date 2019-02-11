package com.example.sweater;

import com.example.sweater.entity.Remind;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Remind greeting(
            ) {
       
        return createMockremind();
    }

    private Remind createMockremind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindDate(new Date());
        remind.setTitle("My first remind");
        return remind;
    }

    @GetMapping
    public String main(
        @RequestParam(name = "name", required = false, defaultValue="World") String name,Model model){
        model.addAttribute("name", "SWEATER");
        return "main";
    }
}