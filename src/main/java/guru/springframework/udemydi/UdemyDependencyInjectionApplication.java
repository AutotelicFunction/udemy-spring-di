package guru.springframework.udemydi;

import guru.springframework.udemydi.config.UdemyConfiguration;
import guru.springframework.udemydi.config.UdemyConstructorConfig;
import guru.springframework.udemydi.controllers.*;
import guru.springframework.udemydi.datasource.FakeDataSource;
import guru.springframework.udemydi.services.PrototypeBean;
import guru.springframework.udemydi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"guru.springframework.1udemydi", "com.springframework.pets"})
@SpringBootApplication
public class UdemyDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext appCTX = SpringApplication.run(UdemyDependencyInjectionApplication.class, args);


		System.out.println("------------- Pets");
		PetController petController = appCTX.getBean("petController", PetController.class);
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


		System.out.println("------------- Scopes");
		SingletonBean singletonBean1 = appCTX.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());

		SingletonBean singletonBean2 = appCTX.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = appCTX.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = appCTX.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		System.out.println("------------- FakeDataSource");
		FakeDataSource fakeDataSource = appCTX.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());


		System.out.println("------------- Configuration Properties Bean");
		UdemyConfiguration udemyConfiguration = appCTX.getBean(UdemyConfiguration.class);
		System.out.println(udemyConfiguration.getJdbcurl());
		System.out.println(udemyConfiguration.getUsername());
		System.out.println(udemyConfiguration.getPassword());

		System.out.println("------------- Configuration Constructor Properties Bean");
		UdemyConstructorConfig udemyConstructorConfig = appCTX.getBean(UdemyConstructorConfig.class);
		System.out.println(udemyConstructorConfig.getJdbcurl());
		System.out.println(udemyConstructorConfig.getUsername());
		System.out.println(udemyConstructorConfig.getPassword());

	}

}
