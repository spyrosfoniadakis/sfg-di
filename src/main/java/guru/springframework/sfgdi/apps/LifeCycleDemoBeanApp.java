package guru.springframework.sfgdi.apps;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.lifecycle.LifeCycleDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LifeCycleDemoBeanApp {
    public static void main(String[] args) {

        System.out.println(String.format("App %s starts.", LifeCycleDemoBeanApp.class.getSimpleName()));
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        LifeCycleDemoBean bean = (LifeCycleDemoBean) context.getBean("lifeCycleDemoBean");
        System.out.println(String.format("App %s ends.", LifeCycleDemoBeanApp.class.getSimpleName()));

    }
}
