package com.stackroute;

import com.stackroute.Config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Movie movie = (Movie) ctx.getBean("Movie.class");
        System.out.println("all movie details here " + movie.toString());
        AnnotationConfigApplicationContext c=(AnnotationConfigApplicationContext) ctx;
        c.destroy();
//        Movie movie4 = (Movie) ctx.getBean("Movie2.class");
//        System.out.println("all movie details here " + movie4.toString());
// check singleten ,scope
//        Movie movie3 = (Movie) context1.getBean("movie");
//        Movie movie3 = (Movie) context1.getBean("movie");


    }
}
