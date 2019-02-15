package com.springstudy.spring_web_stepa12;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{

    @PerfLogging
    @Override
    public void createEvent() {
        //long begin = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created Event");
        //System.out.println(System.currentTimeMillis()-begin);
    }

    @PerfLogging
    @Override
    public void publishEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published Event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("delete Event");
    }
}
