package springCourse.core.ioc.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springCourse.core.ioc.MusicPlayer_2;

@Component
public class Computer {
    private int id;
    private MusicPlayer_2 musicPlayer;

    @Autowired
    public Computer(MusicPlayer_2 musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

  /*  @Override
    public String toString() {
        return "Computer " + id +
                " " + musicPlayer.playMusic();}*/
}
