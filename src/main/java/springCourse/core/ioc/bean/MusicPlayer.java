package springCourse.core.ioc.bean;

import org.springframework.beans.factory.annotation.Value;
import springCourse.core.ioc.Music;
import springCourse.core.ioc.enums.Janre;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> musicJanre;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicJanre) {
        this.musicJanre = musicJanre;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        playRandomMusic();
       /* System.out.println("Now playing " + "classical music: " +
                classicalMusic.getSong() + "\nrock Music: " + rockMusic.getSong());*/
    }

    private void playRandomMusic() {
        Random random = new Random();
        List<Music> janre = musicJanre;
        Music genre = janre.get(random.nextInt(janre.size()));
        System.out.println(genre.getListSong().
                get(random.nextInt(
                        genre.getListSong().size())));
    }

/*    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }

    public void playMusicList() {
        for (Music song:musicList){
            System.out.println(song.getSong());;
        }
    }*/

}
