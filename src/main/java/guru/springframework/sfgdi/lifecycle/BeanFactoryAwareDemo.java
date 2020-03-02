package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryAwareDemo implements BeanFactoryAware {

    private DummyBean property;

    public BeanFactoryAwareDemo(DummyBean dummyBean) {
        System.out.println(String.format("Class: %s - In method: constructor", BeanFactoryAwareDemo.class.getSimpleName()));
        this.property = dummyBean;
    }

    public DummyBean getProperty() {
        System.out.println(String.format("Class: %s - In method: getProperty()", BeanFactoryAwareDemo.class.getSimpleName()));
        return property;
    }

    @Autowired
    public void setProperty(DummyBean property) {
        System.out.println(String.format("Class: %s - In method: setProperty()", BeanFactoryAwareDemo.class.getSimpleName()));
        this.property = property;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(String.format("Class: %s - In method: setBeanFactory() - parameter: %s", BeanFactoryAwareDemo.class.getSimpleName(), beanFactory.toString()));
    }
}
