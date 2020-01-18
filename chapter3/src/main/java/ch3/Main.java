package ch3;

import ch3.api.MessageRenderer;
import conf.HelloWorldConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        MessageRenderer consoleMessageRenderer =
                context.getBean("consoleMessageRenderer", MessageRenderer.class);
        consoleMessageRenderer.render();
    }
}
