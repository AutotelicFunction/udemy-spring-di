package guru.springframework.udemydi;

import guru.springframework.udemydi.controllers.ConstructorInjectedController;
import guru.springframework.udemydi.controllers.MyController;
import guru.springframework.udemydi.controllers.PropertyInjectedController;
import guru.springframework.udemydi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemyDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext appCTX = SpringApplication.run(UdemyDependencyInjectionApplication.class, args);

		MyController myController = (MyController) appCTX.getBean("myController");

		System.out.println("------------- Primary ----------------");
		System.out.println(myController.helloWorld());


		System.out.println("------------- Property ----------------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) appCTX.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("------------- Setter ----------------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) appCTX.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("------------- Constructor ----------------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appCTX.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
