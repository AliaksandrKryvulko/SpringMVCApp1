package springCourse.core.ioc.bean;

import org.springframework.stereotype.Component;
import springCourse.core.ioc.Music;

import java.util.ArrayList;
import java.util.Arrays;

//@Component
public class RockMusic implements Music {
    ArrayList <String> listMusic=new ArrayList<>(Arrays.asList("bring me to floor",
            "Ups mme to heaven",
            "down me to dirt"));

    public void doMyInit (){
        System.out.println("doing my initialization");
    }
    public void doMyDestroy (){
        System.out.println("doing my destruction RockM-k");
    }

    @Override
    public ArrayList<String> getListSong() {
        return listMusic;
    }

}
