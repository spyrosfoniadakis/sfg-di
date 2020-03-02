package guru.springframework.sfgdi.apps;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.lifecycle.BeanNameAwareDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class BeanNameAwareDemoApp {
    public static void main(String[] args) {

        System.out.println(String.format("App %s starts.", BeanNameAwareDemoApp.class.getSimpleName()));
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        BeanNameAwareDemo bean = (BeanNameAwareDemo) context.getBean("dodo");
        System.out.println(String.format("App %s ends.", BeanNameAwareDemoApp.class.getSimpleName()));

    }
}
