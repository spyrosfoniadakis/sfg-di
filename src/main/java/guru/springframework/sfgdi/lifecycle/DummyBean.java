package guru.springframework.sfgdi.lifecycle;

import org.springframework.stereotype.Component;


@Component
public class DummyBean {

    private final int number;
    private final String name;

    public DummyBean(){
        this.number = 1;
        this.name = "dummy";
    }

}
