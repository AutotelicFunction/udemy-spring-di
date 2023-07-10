package guru.springframework.udemydi;

import guru.springframework.udemydi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"guru.springframework.udemydi", "com.springframework.pets"})
@SpringBootApplication
public class UdemyDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext appCTX = SpringApplication.run(UdemyDependencyInjectionApplication.class, args);


		System.out.println("------------- Pets");
		PetController petController = (PetController) appCTX.getBean("petController");
		System.out.println(petController.whichPetIsTheBest());


		System.out.println("------------- Profile");
		I18nController i18nController = (I18nController) appCTX.getBean("i18nController");
		System.out.println(i18nController.helloWorld());


		System.out.println("------------- Primary");
		MyController myController = (MyController) appCTX.getBean("myController");
		System.out.println(myController.helloWorld());


		System.out.println("------------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appCTX.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("------------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) appCTX.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("------------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appCTX.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
