package guru.springframework.udemydi.services;

public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Guten Tag! - Constructor";
    }
}
