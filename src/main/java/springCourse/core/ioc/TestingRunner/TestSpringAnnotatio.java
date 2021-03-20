package springCourse.core.ioc.TestingRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springCourse.core.ioc.Bean.ClassicalMusic;
import springCourse.core.ioc.Bean.Computer;
import springCourse.core.ioc.Enums.Janre;
import springCourse.core.ioc.MusicPlayer_2;

public class TestSpringAnnotatio {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        /*Music music=context.getBean("garageMusic", Music.class);
        MusicPlayer musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusic();
        Music classicMusic=context.getBean("classicalMusic", Music.class);
        MusicPlayer musicPlayer2=new MusicPlayer(classicMusic);
        musicPlayer2.playMusic();
        */
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        MusicPlayer_2 musicPlayer_2 = context.getBean("musicPlayer_2", MusicPlayer_2.class);
        musicPlayer_2.playMusic(Janre.CLASSICAL);
    /*    System.out.println(musicPlayer_2.getName());
        System.out.println(musicPlayer_2.getVolume() );
        ClassicalMusic classicalMusic1=context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2=context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println("Do they equals? "+(classicalMusic1==classicalMusic2));*/
        context.close();
    }
}
