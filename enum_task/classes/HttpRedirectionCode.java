package il.study.spring.enum_task.classes;

public class HttpRedirectionCode implements HttpCodes {
    @Override
    public void logic() {
        System.out.println("300 - 399 Redirection Code");
    }
}
