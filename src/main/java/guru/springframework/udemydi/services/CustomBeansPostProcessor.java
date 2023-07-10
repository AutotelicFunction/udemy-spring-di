package guru.springframework.udemydi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeansPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof LifecycleDemoBean)
            ((LifecycleDemoBean) bean).beforeInit();

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof LifecycleDemoBean)
            ((LifecycleDemoBean) bean).afterInit();

        return bean;
    }
}
