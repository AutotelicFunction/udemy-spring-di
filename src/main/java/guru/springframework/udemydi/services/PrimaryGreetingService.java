package guru.springframework.udemydi.services;


public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey guys - Primary";
    }
}
