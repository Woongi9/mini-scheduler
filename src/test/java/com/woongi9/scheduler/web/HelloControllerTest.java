package com.woongi9.scheduler.web;

import com.woongi9.scheduler.config.auth.SecurityConfig;
import com.woongi9.scheduler.web.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@WebMvcTest(controllers = HelloController.class,
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
//                        classes = SecurityConfig.class)
//        })
class HelloControllerTest {

//    @Autowired
//    private MockMvc mvc;
//
//    @WithMockUser(roles = "USER")
//    @Test
//    public void ReturnHello() throws Exception {
//        String hello = "hello";
//
//        mvc.perform(get("/hello"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(hello));
//    }
}