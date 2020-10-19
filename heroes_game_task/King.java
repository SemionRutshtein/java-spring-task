package il.study.spring.heroes_game_task;

import il.study.spring.heroes_game_task.utills.RandomUtil;
import lombok.Setter;

public class King extends Hero {

    @Setter
    private Weapon weapon = new Sword();

    @Override
    protected int getInitialHp() {
        return RandomUtil.getRandomInRange(5,15);
    }

    @Override
    protected int getInitialPower() {
        return RandomUtil.getRandomInRange(5,15);
    }

    @Override
    public void kick(Hero enemy) {
        weapon.kick(this, enemy);
    }
}
