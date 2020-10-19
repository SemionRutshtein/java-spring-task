package il.study.spring.heroes_game_task.utills;

import java.util.Random;

public class RandomUtil {
    private static Random random = new Random();

    public static int getRandomInRange( int min, int max) {
       return random.ints(min, max).findAny().getAsInt();
    }
}
