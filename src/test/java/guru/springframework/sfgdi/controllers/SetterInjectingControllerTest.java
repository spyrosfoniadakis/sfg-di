package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Example of setter-based DI without Spring - it is not an actual Unit Test
 */
class SetterInjectingControllerTest {

    SetterInjectingController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectingController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}