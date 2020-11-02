package il.study.spring.real_spring.context_task;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@EnableAspectJAutoProxy
public class QuoterAspect {

    @Before("@annotation(Deprecated)")
    public void a() {
        System.out.println("Before Generation");
    }
    @After("@annotation(Deprecated)")
    public void b() {
        System.out.println("After Generation");
    }
    @Around("@annotation(Deprecated)")
    @SneakyThrows
    public void c(ProceedingJoinPoint pjp) {
        System.out.println("Around Generation");
        pjp.proceed();
        System.out.println("Around Generation");

    }
}
