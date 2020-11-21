package il.study.spring.intrview;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Component
public class ValidatorAnnotationBeanPostProcessor implements BeanPostProcessor {

   @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class type = bean.getClass();
        Method [] methods = type.getMethods();
        for (Method method : methods) {
           if(method.isAnnotationPresent(InjectList.class)) {

           }
       }

        return null;
    }
}
