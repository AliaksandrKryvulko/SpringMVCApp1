package springCourse.core.ioc;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    //Ioc
    public MusicPlayer(Music music) {
        this.music = music;
    }

    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

/*    public void playMusic() {
        System.out.println("Playing " + music.getSong());
    }

    public void playMusicList() {
        for (Music song:musicList){
            System.out.println(song.getSong());;
        }
    }*/

    public void setMusic(Music music) {
        this.music = music;
    }
}
