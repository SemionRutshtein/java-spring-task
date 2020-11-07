package il.study.spring.real_spring.qualifiers_example;

import lombok.SneakyThrows;

@DataAnnotation(DBType.ORACLE)
public class OracleDao implements Dao {

    @Override
    @SneakyThrows
    public void saveAll() {
        Thread.sleep(5);
        System.out.println("save to oracle");
    }
}
