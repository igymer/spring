package ch4.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanWithLifeCycleMethods implements InitializingBean, DisposableBean {
    @PostConstruct
    private void postConstructMethod() {
        System.out.println("1: post construct method");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("2: afterPropertiesSet() call");
    }


    @PreDestroy
    private void preDestroyMethod() {
        System.out.println("3: pre destroy method");
    }

    @Override
    public void destroy() {
        System.out.println("4: destroy() call");
    }
}
