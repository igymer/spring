package ch4.mixedconfig.impl;

import ch4.mixedconfig.api.MessageProvider;
import ch4.mixedconfig.api.MessageRenderer;

public class ConsoleMessageRenderer implements MessageRenderer {
    private MessageProvider provider;

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }
}
