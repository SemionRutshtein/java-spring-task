package il.study.spring.real_spring.more_aop.business;

public class DBException extends RuntimeException {

    public DBException(String message) {
        super(message);
    }

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }
}
