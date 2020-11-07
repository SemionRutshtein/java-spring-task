package il.study.spring.real_spring.refresh_singleton_prototype;

import il.study.spring.heroes_game_task.utills.RandomUtil;
import lombok.SneakyThrows;
import org.springframework.context.annotation.*;
import java.awt.*;

import static il.study.spring.heroes_game_task.utills.RandomUtil.getRandomInRange;

@Configuration
@ComponentScan
//@ImportResource("classpath:color_context.xml")
public class MainConf {

    @Bean
    @Scope("prototype")
    public Color color() {
        return new Color(getRandomInRange(0, 255),getRandomInRange(0, 255),getRandomInRange(0, 255));
    }


    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);

        while (true) {
            context.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(550);
        }
    }
}
