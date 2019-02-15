package com.springstudy.spring_web_stepa12;

import java.lang.annotation.*;

/**
 * 이 어노테이션을 사용하면 로깅을 해줍니다.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {

}
