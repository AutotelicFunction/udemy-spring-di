package guru.springframework.udemydi.controllers;

import guru.springframework.udemydi.services.GreetingService;

public class ConstructerInjectedController {

    public GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
