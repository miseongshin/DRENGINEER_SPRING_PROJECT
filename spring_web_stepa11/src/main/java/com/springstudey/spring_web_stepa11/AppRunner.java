package com.springstudey.spring_web_stepa11;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
//https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#expressions-language-ref
    @Value("#{1 + 1}")
    int value;

    @Value("#{'Hello' + 'World'}")
    String greeting;

    @Value("#{1 eq 1}")
    Boolean trueOrFalse;

    @Value("Value")  //#{} 는 표현식으로 인식해서 실행후 사용.
    String valueString;

    @Value("${my.value}")
    int myValue;

    @Value("#{${my.value} eq 100 }")
    boolean isMyValue100;

    @Value("#{sample.data}")
    int sampleData;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============================");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(trueOrFalse);
        System.out.println(valueString);
        System.out.println(myValue);
        System.out.println(isMyValue100);
        System.out.println(sampleData);

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("2+100");
        Integer sumValue = expression.getValue(Integer.class);
        System.out.println(sumValue);

    }
}
