package il.study.spring.enumTask.classes;

public class HttpClientErrorCode implements HttpCodes{
    @Override
    public void logic() {
        System.out.println("400 - 499 Client Error Code");
    }
}
