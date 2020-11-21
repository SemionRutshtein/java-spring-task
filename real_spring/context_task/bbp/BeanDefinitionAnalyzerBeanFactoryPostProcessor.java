package il.study.spring.real_spring.context_task.bbp;

import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import javax.annotation.PreDestroy;
import java.util.Arrays;


//@Component
public class BeanDefinitionAnalyzerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    @SneakyThrows
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String[] names = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String name : names) {
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
            String beanClassName = beanDefinition.getBeanClassName();
            Class<?> beanClass = Class.forName(beanClassName);
            boolean isPredatoryMethodDefined = Arrays.stream(beanClass.getMethods()).anyMatch(method -> method.isAnnotationPresent(PreDestroy.class));
            if(beanDefinition.isPrototype() && (isPredatoryMethodDefined || beanDefinition.getDestroyMethodName()!=null))
                throw new IllegalStateException("Your text for error message");
        }
    }
}
