package guru.springframework.sfgdi.apps;

import guru.springframework.sfgdi.SfgDiApplication;
import guru.springframework.sfgdi.lifecycle.BeanFactoryAwareDemo;
import guru.springframework.sfgdi.lifecycle.BeanNameAwareDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class BeanFactoryAwareDemoApp {
    public static void main(String[] args) {

        System.out.println(String.format("App %s starts.", BeanFactoryAwareDemoApp.class.getSimpleName()));
        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        BeanFactoryAwareDemo bean = (BeanFactoryAwareDemo) context.getBean("beanFactoryAwareDemo");
        System.out.println(String.format("App %s ends.", BeanFactoryAwareDemoApp.class.getSimpleName()));

    }
}
