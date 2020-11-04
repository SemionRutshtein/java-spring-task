package il.study.spring.real_spring.post_processor_task;

import il.study.spring.my_spring.object_factory.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InjectRandomAnnotationBeanPostProcessor implements BeanPostProcessor {

    private InjectRandomIntAnnotationObjectConfigurator injectConfig = new InjectRandomIntAnnotationObjectConfigurator();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        injectConfig.configure(bean);
        return bean;
    }
}
