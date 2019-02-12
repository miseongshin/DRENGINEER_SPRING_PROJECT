package com.springstudy.spring_web_step7;

import org.springframework.context.ApplicationEvent;

//public class MyEvent extends ApplicationEvent {
public class MyEvent  {

    private int data;
    private Object source;

    public MyEvent(Object source, int data) {

        this.source = source;
        this.data = data;
    }

    public Object getSource() {
        return source;
    }

    public int getData() {
        return data;
    }
}
