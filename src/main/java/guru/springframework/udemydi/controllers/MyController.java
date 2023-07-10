package guru.springframework.udemydi.controllers;


import guru.springframework.udemydi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String helloWorld() {
        return greetingService.sayGreeting();
    }
}
