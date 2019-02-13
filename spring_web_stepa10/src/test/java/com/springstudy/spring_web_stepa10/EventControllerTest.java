package com.springstudy.spring_web_stepa10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({EventFomatter.class,EventController.class})
// 웹과관련- controller 상태 테스트 bean으로 등록된것만. .
public class EventControllerTest {

    @Autowired
    MockMvc mocMvc;

    @Test
    public void getTest() throws Exception {
       mocMvc.perform(get("/event/1"))
               .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }
}