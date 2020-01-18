package ch3.impl;

import ch3.api.MessageProvider;
import ch3.api.MessageRenderer;
import org.springframework.stereotype.Service;

@Service
public class ConsoleMessageRenderer implements MessageRenderer {
    private MessageProvider provider;

    public ConsoleMessageRenderer(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }
}
