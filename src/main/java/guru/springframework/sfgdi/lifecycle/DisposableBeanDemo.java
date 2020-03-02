package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DisposableBeanDemo implements DisposableBean {

    private DummyBean property;

    public DisposableBeanDemo(DummyBean dummyBean) {
        System.out.println(String.format("Class: %s - In method: constructor", DisposableBeanDemo.class.getSimpleName()));
        this.property = dummyBean;
    }

    public DummyBean getProperty() {
        System.out.println(String.format("Class: %s - In method: getProperty()", DisposableBeanDemo.class.getSimpleName()));
        return property;
    }

    @Autowired
    public void setProperty(DummyBean property) {
        System.out.println(String.format("Class: %s - In method: setProperty()", DisposableBeanDemo.class.getSimpleName()));
        this.property = property;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(String.format("Class: %s - In method: destroy()", DisposableBeanDemo.class.getSimpleName()));
    }
}
