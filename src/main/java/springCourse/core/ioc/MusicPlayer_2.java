package springCourse.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springCourse.core.ioc.Bean.ClassicalMusic;
import springCourse.core.ioc.Bean.RockMusic;
import springCourse.core.ioc.Enums.Janre;

import javax.print.DocFlavor;
import java.awt.image.VolatileImage;
import java.util.ArrayList;
import java.util.Random;

@Component
public class MusicPlayer_2 {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer_2(@Qualifier("classicalMusic") Music music1,
                         @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic(Janre janre) {
        if (janre == Janre.CLASSICAL)
            playRandomMusic(music1);
        else playRandomMusic(music2);
       /* System.out.println("Now playing " + "classical music: " +
                classicalMusic.getSong() + "\nrock Music: " + rockMusic.getSong());*/
    }

    private void playRandomMusic(Music music) {
        Random random = new Random();
        ArrayList<String> songs = music.getListSong();
        String song = songs.get(random.nextInt(songs.size()));
        System.out.println(song);
    }
}
