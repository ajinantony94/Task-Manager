package com.task_manager.task_manager.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/home")
    public String home(){
        return "hai hello this is home page!!!";
    }
}
