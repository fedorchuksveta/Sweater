package com.example.sweater;

import com.example.sweater.entity.Remind;
import com.example.sweater.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class GreetingController {
@Autowired
private RemindRepository remindRepository;



    @GetMapping("/greeting")
    public Remind greeting() {
        List<Remind> list = remindRepository.findAll();
        return createMockRemind();
    }

    private Remind createMockRemind() {
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
        return "Hello Sweater";
    }
}