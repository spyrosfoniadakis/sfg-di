package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitializingBeanDemo implements InitializingBean {

    private DummyBean property;

    public InitializingBeanDemo(DummyBean dummyBean) {
        System.out.println(String.format("Class: %s - In method: constructor", InitializingBeanDemo.class.getSimpleName()));
        this.property = dummyBean;
    }

    public DummyBean getProperty() {
        System.out.println(String.format("Class: %s - In method: getProperty()", InitializingBeanDemo.class.getSimpleName()));
        return property;
    }

    //@Autowired
    public void setProperty(DummyBean property) {
        System.out.println(String.format("Class: %s - In method: setProperty()", InitializingBeanDemo.class.getSimpleName()));
        this.property = property;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.format("Class: %s - afterPropertiesSet()", InitializingBeanDemo.class.getSimpleName()));
    }
}
