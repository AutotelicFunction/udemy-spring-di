package guru.springframework.udemydi;

import guru.springframework.udemydi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UdemyDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext appCTX = SpringApplication.run(UdemyDependencyInjectionApplication.class, args);

		MyController myController = (MyController) appCTX.getBean("myController");

		String retVal = myController.helloWorld();

		System.out.println(retVal);
	}

}
