package il.study.spring.real_spring.profiles_example;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile(ProfilesConst.PROD)
public class RepoImpl implements Repo {
    @Override
    public void crud() {
        System.out.println("save to prod");
    }
}
