package guru.springframework.udemydi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String sayGreeting() {
        return "The EN Repository says hello!";
    }
}
