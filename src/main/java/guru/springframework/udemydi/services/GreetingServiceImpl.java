package guru.springframework.udemydi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Guten Tag!";
    }
}
