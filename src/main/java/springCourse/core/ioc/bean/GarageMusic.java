package springCourse.core.ioc.bean;

import springCourse.core.ioc.Music;

import java.util.ArrayList;
import java.util.Arrays;

//@Component
public class GarageMusic implements Music {
    ArrayList<String> listMusic=new ArrayList<>(Arrays.asList("gARAGE GARAGE", "voyage voyage"));

    @Override
    public ArrayList<String> getListSong() {
        return listMusic;
    }

}
