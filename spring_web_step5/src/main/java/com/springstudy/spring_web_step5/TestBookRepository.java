package com.springstudy.spring_web_step5;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!prod")
public class TestBookRepository extends BookRepository {
}
