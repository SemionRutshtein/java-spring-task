package il.study.spring.real_spring.qualifiers_example;

import org.springframework.stereotype.Repository;

@DataAnnotation(DBType.MONGODB)
public class MongoDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("Save to mongoDB");
    }
}
