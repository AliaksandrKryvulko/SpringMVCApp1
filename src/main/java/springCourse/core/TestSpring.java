package springCourse.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean=context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        System.out.println();
        context.close();
    }
}
