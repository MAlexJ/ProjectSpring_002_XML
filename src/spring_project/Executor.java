package spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ION on 19.11.2015.
 */
public class Executor {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Print print = (Print) context.getBean("print");
        print.showSquare();
        print.showPerimeter();

    }
}
