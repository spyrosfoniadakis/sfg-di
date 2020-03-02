package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private DummyBean property;

    public LifeCycleDemoBean(DummyBean dummyBean) {
        System.out.println(String.format("Class: %s - In method: constructor", LifeCycleDemoBean.class.getSimpleName()));
        this.property = dummyBean;
    }

    public DummyBean getProperty() {
        System.out.println(String.format("Class: %s - In method: getProperty()", LifeCycleDemoBean.class.getSimpleName()));
        return property;
    }

    @Autowired
    public void setProperty(DummyBean property) {
        System.out.println(String.format("Class: %s - In method: setProperty() - param { type: DummyBean, value: %s } ", LifeCycleDemoBean.class.getSimpleName(), property));
        this.property = property;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Class: LifeCycleDemoBean | method: setBeanFactory | Param { type: BeanFactory, value: " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Class: LifeCycleDemoBean | method: setBeanName | Param { type: String, value: " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Class: LifeCycleDemoBean | method: destroy | Param { } ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Class: LifeCycleDemoBean | method: afterPropertiesSet | Param { } ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Class: LifeCycleDemoBean | method: setApplicationContext | Param { type: ApplicationContext, value: " + applicationContext);
    }
}
