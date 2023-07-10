package guru.springframework.udemydi.services;

import org.springframework.stereotype.Component;


@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println(">>>>>>>>>>>>>>>>>>>> Creating Singleton Bean!");
    }

    public String getMyScope() {
        return "I'm a Singleton!";
    }
}
