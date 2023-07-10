package guru.springframework.udemydi.services;


public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Guten Tag! - Setter";
    }
}
