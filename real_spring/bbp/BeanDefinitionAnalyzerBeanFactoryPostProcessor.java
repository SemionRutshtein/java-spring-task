package il.study.spring.real_spring.bbp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;


@Component
public class BeanDefinitionAnalyzerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    @SneakyThrows
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            Class<?> aClass = Class.forName(beanClassName);
            boolean annotationPresent = Arrays.stream(aClass.getMethods()).anyMatch(method -> method.isAnnotationPresent(PreDestroy.class));
            String destroyMethodName = beanDefinition.getDestroyMethodName();
            boolean isPrototype = beanDefinition.isPrototype();
            if(isPrototype&(destroyMethodName!=null||annotationPresent))
                throw new IllegalStateException("Your text for error message");
        }
    }
}
