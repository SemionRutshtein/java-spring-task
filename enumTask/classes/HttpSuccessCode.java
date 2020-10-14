package il.study.spring.enumTask.classes;

public class HttpSuccessCode implements HttpCodes {
    @Override
    public void logic() {
        System.out.println("200 - 299 Success Code");
    }
}
