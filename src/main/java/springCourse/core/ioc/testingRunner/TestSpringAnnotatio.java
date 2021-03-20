package springCourse.core.ioc.testingRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springCourse.core.ioc.Music;
import springCourse.core.ioc.bean.Computer;
import springCourse.core.ioc.bean.MusicPlayer;
import springCourse.core.ioc.enums.Janre;
import springCourse.core.ioc.bean.MusicPlayer_2;
import springCourse.core.configuration.SpringConfig;

public class TestSpringAnnotatio {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "springCourse/core/garbage/applicationContext.xml");*/
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(
                SpringConfig.class);
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
        System.out.println(musicPlayer_2.getVolume()+musicPlayer_2.getName());
        MusicPlayer musicPlayer=context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    /*    System.out.println(musicPlayer_2.getName());
        System.out.println(musicPlayer_2.getVolume() );
        ClassicalMusic classicalMusic1=context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2=context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println("Do they equals? "+(classicalMusic1==classicalMusic2));*/
        context.close();
    }
}
