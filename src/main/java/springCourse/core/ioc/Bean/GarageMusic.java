package springCourse.core.ioc.Bean;

import org.springframework.stereotype.Component;
import springCourse.core.ioc.Music;

import java.util.ArrayList;
import java.util.Arrays;

//@Component
public class GarageMusic implements Music {
    ArrayList<String> listMusic=new ArrayList<>(Arrays.asList("gARAGE GARAGE"));

    @Override
    public ArrayList<String> getListSong() {
        return null;
    }

}
