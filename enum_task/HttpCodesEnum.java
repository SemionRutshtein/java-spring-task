package il.study.spring.enum_task;

import il.study.spring.enum_task.classes.*;

public enum HttpCodesEnum {
    HTTP_INFORMATION(100, 199, new HttpInformationCode()),
    HTTP_SUCCESS(200, 299, new HttpSuccessCode()),
    HTTP_REDIRECTION(300, 399, new HttpRedirectionCode()),
    HTTP_CLIENT_ERROR(400, 499, new HttpClientErrorCode()),
    HTTP_SERVER_ERROR(500, 599 , new HttpServerErrorCode());


    private final int min;
    private final int max;
    private final HttpCodes httpCode;

    public void httpCode() {
        httpCode.logic();
    }

    HttpCodesEnum(int min, int max, HttpCodes httpCode) {
        this.min = min;
        this.max = max;
        this.httpCode = httpCode;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public HttpCodes getHttpCode() {
        return httpCode;
    }

    public static HttpCodesEnum findByCode(int code) throws Exception {
        HttpCodesEnum[] enums = values();
        for (HttpCodesEnum codesEnum: enums) {
            if (codesEnum.min <= code && code <= codesEnum.max) {
                return codesEnum;
            }
        }
        throw new Exception(code + "have not this HttpCode");
    }
}
