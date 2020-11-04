package il.study.spring.real_spring.bbp;

import il.study.spring.my_spring.object_factory.Benchmark;
import il.study.spring.my_spring.object_factory.BenchmarkProxyConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.HashMap;
import java.util.Map;

public class BenchmarkBPP implements BeanPostProcessor {

    private Map<String, Class> map = new HashMap<>();
    private BenchmarkProxyConfigurator benchmarkProxyConfigurator = new BenchmarkProxyConfigurator();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Benchmark.class)) {
            map.put(beanName, bean.getClass());
        }
        return map;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type =map.get(beanName);
        if (type != null) {
            Object proxy = benchmarkProxyConfigurator.wrapWithProxy(bean, type);
            return proxy;
        }
        return bean;

    }
}
