package il.study.spring.enum_task.classes;

public class HttpServerErrorCode implements HttpCodes {
    @Override
    public void logic() {
        System.out.println("500 - 599 Server Error Code");
    }
}
