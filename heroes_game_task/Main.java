package il.study.spring.heroes_game_task;

public class Main {
    public static void main(String[] args) {
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();

        gameManager.fight(heroFactory.getRandomHero(), heroFactory.getRandomHero());
    }
}
