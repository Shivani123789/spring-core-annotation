package com.stackroute.domain;

public class Actor {
    public Actor() {
    }
    private String actorname;
    private String gender;
    private int age;

    public Actor(String actorname, String gender, int age) {
        this.actorname = actorname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorname='" + actorname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
//    public String getActorname() {
//        return actorname;
//    }
//
//    public void setActorname(String actorname) {
//        this.actorname = actorname;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
