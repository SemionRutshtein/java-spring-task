package il.study.spring.real_spring.bbp;

import il.study.spring.heroes_game_task.utills.RandomUtil;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

public class IntegerFactory implements FactoryBean<Integer> {


    @Override
    public Integer getObject() throws Exception {
        return RandomUtil.getRandomInRange(0, 100);
    }

    @Override
    public Class<?> getObjectType() {
        return Integer.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
