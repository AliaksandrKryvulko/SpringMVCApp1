package springCourse.core.configuration;

import org.springframework.context.annotation.*;
import springCourse.core.ioc.Music;
import springCourse.core.ioc.bean.MusicPlayer;
import springCourse.core.ioc.bean.MusicPlayer_2;
import springCourse.core.ioc.bean.ClassicalMusic;
import springCourse.core.ioc.bean.Computer;
import springCourse.core.ioc.bean.GarageMusic;
import springCourse.core.ioc.bean.RockMusic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("springCourse.core")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public GarageMusic garageMusic() {
        return new GarageMusic();
    }

    @Bean
    List<Music> musicJanre() {
        return Arrays.asList(garageMusic(), rockMusic(), classicalMusic());
    }

    @Bean
    public MusicPlayer_2 musicPlayer_2() {
        return new MusicPlayer_2(rockMusic(), classicalMusic());
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer(musicJanre());
    }

    @Bean
    Computer computer() {
        return new Computer(musicPlayer_2());
    }
}
