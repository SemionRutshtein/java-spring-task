package il.study.spring.real_spring.profiles_example;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {

    private final Repo repo;

    @Scheduled(fixedDelay = 10000)
    public void work() {
        repo.crud();
    }

}
