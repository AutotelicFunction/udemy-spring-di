package guru.springframework.udemydi.services;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Guten Tag! - Property";
    }
}
