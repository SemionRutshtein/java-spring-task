package il.study.spring.enumTask;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpCodesEnum enumCode = HttpCodesEnum.findByCode(500);
        enumCode.getHttpCode().logic();
    }
}
