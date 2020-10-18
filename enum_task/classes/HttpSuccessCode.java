package il.study.spring.enum_task.classes;

public class HttpSuccessCode implements HttpCodes {
    @Override
    public void logic() {
        System.out.println("200 - 299 Success Code");
    }
}
