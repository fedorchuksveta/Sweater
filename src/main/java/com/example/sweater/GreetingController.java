package com.example.sweater;

import com.example.sweater.entity.Remind;
import com.example.sweater.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {
    @Autowired
    private ReminderService service;


    @GetMapping("/greeting")
    public List<Remind> getReminders() {
        return service.All();

    }

    @GetMapping("/greeting/{id}")
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID) {
        return service.One(remindID);
    }

    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind) {
        return service.save(remind);
    }

    @RequestMapping(value = "/greeting/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id) {
        service.remove(id);
    }


    @GetMapping
    public String main(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", "SWEATER");
        return "Hello Sweater";
    }
}