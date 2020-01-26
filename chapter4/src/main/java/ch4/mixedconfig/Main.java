package ch4.mixedconfig;

import ch4.mixedconfig.api.MessageRenderer;
import ch4.mixedconfig.conf.JavaClassAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaClassAppConfig.class);
        MessageRenderer renderer = context.getBean(MessageRenderer.class);
        renderer.render();
    }
}
