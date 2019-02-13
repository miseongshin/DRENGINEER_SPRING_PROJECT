package com.springstudy.spring_web_stepa10;


import org.springframework.core.convert.converter.Converter;

public class EventConvertor {

    //@Component   //스프링 부트기능 configuration부분 사용안함
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String source) {
            return new Event(Integer.parseInt(source));
        }
    }
    //@Component
    public static class EventToStringConverter implements Converter<Event,String>{
        @Override
        public String convert(Event source) {
            return source.getId().toString();
        }
    }
}
