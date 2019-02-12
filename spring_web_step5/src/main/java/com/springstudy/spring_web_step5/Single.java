package com.springstudy.spring_web_step5;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    //private ObjectProvider<Proto> proto;
    private Proto proto;

    int value =0; // 멀티쓰레드환경 값변경 주의

    public Proto getProto() {
        //return proto.getIfAvailable();
        return proto;
    }
}
