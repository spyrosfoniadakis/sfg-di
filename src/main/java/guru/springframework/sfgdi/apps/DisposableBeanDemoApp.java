package guru.springframework.sfgdi.apps;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.lifecycle.DisposableBeanDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DisposableBeanDemoApp {

    public static void main(String[] args) {

        System.out.println(String.format("App %s starts.", DisposableBeanDemoApp.class.getSimpleName()));
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        DisposableBeanDemo bean = (DisposableBeanDemo) context.getBean("disposableBeanDemo");
        System.out.println(String.format("App %s ends.", DisposableBeanDemoApp.class.getSimpleName()));

    }
}
