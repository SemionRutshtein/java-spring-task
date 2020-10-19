package il.study.spring.heroes_game_task;


import lombok.Data;

@Data
public abstract class Hero {
    private int power;
    private int hp;

    public Hero() {
        hp = getInitialHp();
        power = getInitialPower();
    }

    protected abstract int getInitialHp();
    protected abstract int getInitialPower();

    public abstract void kick(Hero enemy);

    public boolean isAlive() {
        return hp > 0;
    }

    protected void die() {
        hp = 0;
    }

    protected void decreasePower(int delta) {
        power -= delta;
    }

    public void decreaseHp(int damage) {
        hp -= damage;
    };
}
