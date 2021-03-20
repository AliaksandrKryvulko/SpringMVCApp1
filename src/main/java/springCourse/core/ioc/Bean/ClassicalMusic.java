package springCourse.core.ioc.Bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springCourse.core.ioc.Music;

import java.util.ArrayList;
import java.util.Arrays;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {

@PostConstruct
    public void doMyInit() {
        System.out.println("doing initialization Classical Music");
    }

    private ArrayList<String> listMusic = new ArrayList(Arrays.asList("Bohemian rapsody",
            "Time of seasons",
            "Awakening Nature"));

    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
@PreDestroy
    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }

    @Override
    public ArrayList<String> getListSong() {
        return listMusic;
    }
}
