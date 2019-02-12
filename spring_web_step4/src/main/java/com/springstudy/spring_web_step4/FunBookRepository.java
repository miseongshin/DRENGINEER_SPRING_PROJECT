package com.springstudy.spring_web_step4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository @Qualifier("bookRepositories") //@Primary
public class FunBookRepository extends BookRepository{


}
