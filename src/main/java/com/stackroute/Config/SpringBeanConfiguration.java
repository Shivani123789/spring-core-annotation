package com.stackroute.Config;

import com.stackroute.Config.AppConfig;
import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {
    @Bean(name = "Movie.class")
    public Movie getName()
    {
        Movie movie=new Movie(2,"yes boss");
//        Actor actor = new Actor();
//        actor.setActorname("sid");
//        actor.setAge(34);
//        actor.setGender("M");
//        Movie object=new Movie(actor);
//        object.setName("kalank");
//        object.setId(32);
//       // object.setActor(actor);
        return movie;
    }
    @Bean(name = "Actor.class")
    public Actor getActorName()
    {
        Actor actor=new Actor("sid","male",30);
        return actor;
    }

    @Bean(name = "BeanLifecycleDemoBean.class")
            public BeanLifecycleDemoBean getMessage()
    {
        BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
        return beanLifecycleDemoBean;
    }
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