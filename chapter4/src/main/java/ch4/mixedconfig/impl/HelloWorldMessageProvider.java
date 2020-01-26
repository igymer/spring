package ch4.mixedconfig.impl;

import ch4.mixedconfig.api.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world!";
    }
}
