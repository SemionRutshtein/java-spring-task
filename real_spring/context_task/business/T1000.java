package il.study.spring.real_spring.context_task.business;

import il.study.spring.real_spring.context_task.Film;

@Film
public class T1000 extends TerminatorQuoter {

    @Override
    public void sayQuote() {
        System.out.println("Where is John Connor?");
    }
}
