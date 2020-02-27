package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) context.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println("Greeting: " + greeting);

		System.out.println("---- PropertyInjectedController:");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println("Greeting: " + propertyInjectedController.getGreeting());

		System.out.println("---- SetterInjectingController:");
		SetterInjectingController setterInjectingController = (SetterInjectingController) context.getBean("setterInjectingController");
		System.out.println("Greeting: " + setterInjectingController.getGreeting());

		System.out.println("---- ConstructorInjectedController:");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println("Greeting: " + constructorInjectedController.getGreeting());


		I18nController i18nController = (I18nController)context.getBean("i18nController");
		System.out.println(i18nController.greet());
	}

}
