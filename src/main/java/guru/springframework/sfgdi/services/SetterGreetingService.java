package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Setter injected greeting: Hello world!";
    }
}
