package il.study.spring.real_spring.qualifiers_example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @DataAnnotation(DBType.MONGODB)
    private Dao dao;

    @DataAnnotation(DBType.ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay = 500)
    public void work() {
        dao.saveAll();
    }

    @Scheduled(fixedDelay = 3000)
    public void backUp() {
        backupDao.saveAll();
    }

}
