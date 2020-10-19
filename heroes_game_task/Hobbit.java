package il.study.spring.heroes_game_task;

public class Hobbit extends Hero {
    @Override
    protected int getInitialHp() {
        return 3;
    }

    @Override
    protected int getInitialPower() {
        return 0;
    }

    @Override
    public void kick(Hero enemy) {
        //Пишу метод плакать, но стоит переписать его способность на удивлять.
        cry();
    }

    private void cry() {
        System.out.println("I cry when see this dark world!");
    }

}
