package il.study.spring.real_spring.context_task.aop;

import il.study.spring.heroes_game_task.utills.RandomUtil;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class QuoterAspect {

    @Pointcut("execution(*  il.study.spring.real_spring.context_task.business.*.say*(..))")
    public void allSayMethods(){}

    @SneakyThrows
    @Around("@annotation(il.study.spring.real_spring.context_task.business.Secured)")
    public Object doSecured(ProceedingJoinPoint joinPoint) {
        int randomInRange = RandomUtil.getRandomInRange(0, 5);
        if (randomInRange < 2) {
            return joinPoint.proceed();
        } else  {
            throw new SecurityException("not allowed here, try again later");
        }

    }


    @Before("allSayMethods()")
    public void handleSayMethods(JoinPoint jp) {
        String name = jp.getTarget().getClass().getSimpleName();
        System.out.println("And now (c) -> Continue study JAVA" + name + " : ");
    }
}
