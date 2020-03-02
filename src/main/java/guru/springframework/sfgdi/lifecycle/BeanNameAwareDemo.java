package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dodo")
public class BeanNameAwareDemo implements BeanNameAware {

    private DummyBean property;

    public BeanNameAwareDemo(DummyBean dummyBean) {
        System.out.println(String.format("Class: %s - In method: constructor", BeanNameAwareDemo.class.getSimpleName()));
        this.property = dummyBean;
    }

    public DummyBean getProperty() {
        System.out.println(String.format("Class: %s - In method: getProperty()", BeanNameAwareDemo.class.getSimpleName()));
        return property;
    }

    @Autowired
    public void setProperty(DummyBean property) {
        System.out.println(String.format("Class: %s - In method: setProperty()", BeanNameAwareDemo.class.getSimpleName()));
        this.property = property;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(String.format("Class: %s - in method: setBeanName - name paremeter: %s", BeanNameAwareDemo.class.getSimpleName(), name));
    }
}
