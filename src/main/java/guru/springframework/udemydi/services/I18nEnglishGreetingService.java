package guru.springframework.udemydi.services;

import guru.springframework.udemydi.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    public String sayGreeting() {
        return this.englishGreetingRepository.sayGreeting();
    }
}
