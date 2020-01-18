package ch3.impl;

import ch3.api.MessageProvider;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
