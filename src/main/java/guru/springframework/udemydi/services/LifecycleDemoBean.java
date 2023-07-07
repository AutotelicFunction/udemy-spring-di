package guru.springframework.udemydi.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifecycleDemoBean() {
        System.out.println("##########################################\n### I am a Bean Lifecycle Constructor! ###\n##########################################");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("##### Bean was created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("##### Bean will be destroyed");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("###########################################\n### The Bean Lifecycle has factory set! ###\n###########################################");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("########################################\n### The Bean Lifecycle has name set! ###\n########################################");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("##############################################\n### The Bean Lifecycle has been destroyed! ###\n##############################################");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("##############################################\n### The Bean Lifecycle has properties set! ###\n##############################################");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#######################################################\n### The Bean Lifecycle has application context set! ###\n#######################################################");
    }

    public void beforeInit() {
        System.out.println(">>>>>> BEFORE INIT");
    }

    public void afterInit() {
        System.out.println(">>>>>> AFTER INIT");
    }
}
