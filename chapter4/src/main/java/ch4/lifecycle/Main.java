package ch4.lifecycle;

import ch4.lifecycle.conf.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        new AnnotationConfigApplicationContext(Config.class);
    }
}
