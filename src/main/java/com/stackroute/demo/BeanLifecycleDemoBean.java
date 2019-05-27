package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    private String message ="hi we have message";;

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("my message is " +message);
    }
}
