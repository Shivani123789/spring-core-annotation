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
        //using getter and setter method
//        System.out.println("Name of movie is = "+ movie.getId());
//        System.out.println("Movie name is = "+ movie.getName());
//        System.out.println("actor name is = "+ movie.getActor().getActorname());
//        System.out.println("Age of actor is = "+ movie.getActor().getAge());
//        System.out.println("Gender of actor name is = "+ movie.getActor().getGender());
//        Movie movie1 = (Movie) ctx.getBean("Movie1.class");
//        //using getter and setter method
//        System.out.println("Name of movie is = "+ movie1.getId());
//        System.out.println("Movie name is = "+ movie1.getName());
//        System.out.println("actor name is = "+ movie1.getActor().getActorname());
//        System.out.println("Age of actor is = "+ movie1.getActor().getAge());
//        System.out.println("Gender of actor name is = "+ movie1.getActor().getGender());

    }
}
