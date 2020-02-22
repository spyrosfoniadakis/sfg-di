package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Constructor injected greeting: Hello world!";
    }
}
