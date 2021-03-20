package springCourse.core.ioc.bean;

//@Component
public class Computer {
    private int id;
    private MusicPlayer_2 musicPlayer;

    //@Autowired
    public Computer(MusicPlayer_2 musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

  /*  @Override
    public String toString() {
        return "Computer " + id +
                " " + musicPlayer.playMusic();}*/
}
