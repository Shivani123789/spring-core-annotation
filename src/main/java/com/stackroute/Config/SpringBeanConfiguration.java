package com.stackroute.Config;

import com.stackroute.Config.AppConfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {
    @Bean(name = "Movie.class")
    @Scope("prototype")
    public Movie getName()
    {
        Actor actor=new Actor("sid","male",25);
        Movie object=new Movie(actor,2,"yes boss");
        return object;
    }
//    public Movie getName()
//    {
//        Actor actor=new Actor();
//        actor.setActorname("sid");
//        actor.setAge(34);
//        actor.setGender("M");
//        Movie object=new Movie();
//        object.setName("kalank");
//        object.setId(32);
//        object.setActor(actor);
//        return object;
//
//    }
//    @Bean(name = "Movie1.class")
//    public Movie getName1()
//    {
//        Actor actor=new Actor();
//        actor.setActorname("sid1");
//        actor.setAge(341);
//        actor.setGender("M");
//        Movie object=new Movie();
//        object.setName("kalank1");
//        object.setId(32);
//        object.setActor(actor);
//        return object;
//
//    }
}