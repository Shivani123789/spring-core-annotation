package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    public Movie() {
    }
    @Autowired
    private Actor actor;
    private int id;
    private String name;
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("beanFactory " +beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
        System.out.println(applicationContext.getBean("Actor.class"));
        System.out.println(applicationContext.getBean("Movie.class"));

    }
    // removed constuctor to use @autowired on setter
//    @Autowired
//    public Movie(Actor actor) {
//        System.out.println(actor);
//        this.actor = actor;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Actor getActor() {
//        return actor;
//    }
//
//    public void setActor(Actor actor) {
//        this.actor = actor;
//
//    }
}
