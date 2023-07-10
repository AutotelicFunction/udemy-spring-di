package guru.springframework.udemydi.services;

public class I18nGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Profile: DE\nHallo Welt";
    }
}
