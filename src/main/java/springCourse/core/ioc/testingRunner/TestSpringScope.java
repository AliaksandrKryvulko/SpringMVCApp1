package springCourse.core.ioc.testingRunner;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springCourse.core.ioc.bean.MusicPlayer;

public class TestSpringScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "springCourse/core/garbage/applicationContextIoc.xml");
        MusicPlayer firstMusicPlayer=context.getBean("MusicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer=context.getBean("MusicPlayer", MusicPlayer.class);
        boolean comparison= firstMusicPlayer== secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        System.out.println(firstMusicPlayer.getName());
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
    }
}
