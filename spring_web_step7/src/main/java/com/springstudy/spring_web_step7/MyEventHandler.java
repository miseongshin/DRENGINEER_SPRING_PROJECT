package com.springstudy.spring_web_step7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
//public class MyEventHandler implements ApplicationListener<MyEvent> {
public class MyEventHandler  {
//    @Override
//    public void onApplicationEvent(MyEvent myEvent) {
//        System.out.println("이벤트 받았다 데이터는"+myEvent.getData());
//    }
    @EventListener
    //@Order(Ordered.HIGHEST_PRECEDENCE)
    @Async
    public void handle(MyEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았다 데이터는"+event.getData());
    }

    @EventListener
    @Async
    public void handle(ContextRefreshedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }
    @EventListener
    @Async
    public void handle(ContextClosedEvent event){
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }
}
