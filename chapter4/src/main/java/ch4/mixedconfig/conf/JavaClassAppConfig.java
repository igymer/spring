package ch4.mixedconfig.conf;

import ch4.mixedconfig.api.MessageProvider;
import ch4.mixedconfig.api.MessageRenderer;
import ch4.mixedconfig.impl.ConsoleMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:conf/xml-app-config.xml")
public class JavaClassAppConfig {
    @Autowired
    private MessageProvider provider;
    @Bean
    public MessageRenderer renderer() {
        MessageRenderer renderer = new ConsoleMessageRenderer();
        renderer.setMessageProvider(provider);
        return renderer;
    }
}
