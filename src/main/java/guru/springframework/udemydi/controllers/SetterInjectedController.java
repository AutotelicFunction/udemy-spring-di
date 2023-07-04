package guru.springframework.udemydi.controllers;

import guru.springframework.udemydi.services.GreetingService;

public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
