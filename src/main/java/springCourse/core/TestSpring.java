package springCourse.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springCourse.core.configuration.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(
                SpringConfig.class);
        TestBean testBean=context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        System.out.println();
        context.close();
    }
}
