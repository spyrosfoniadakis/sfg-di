package guru.springframework.sfgdi.apps;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.lifecycle.InitializingBeanDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class InitializingBeanDemoApp {

    public static void main(String[] args) {

        System.out.println(String.format("App %s starts.", InitializingBeanDemoApp.class.getSimpleName()));
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        InitializingBeanDemo bean = (InitializingBeanDemo) context.getBean("initializingBeanDemo");
        System.out.println(String.format("App %s ends.", InitializingBeanDemoApp.class.getSimpleName()));

    }
}
