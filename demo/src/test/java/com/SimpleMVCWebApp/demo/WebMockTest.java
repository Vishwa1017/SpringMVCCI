package com.SimpleMVCWebApp.demo;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(NumberController.class)
class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NumberController controller;

    @Test
    void greetingShouldReturnMessageFromService() throws Exception {
        when(controller.doubleNumber(20)).thenReturn(40.0);
        this.mockMvc.perform(get("/double?number=20")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("40.0")));
        //testing Simpley YAML Update1xs
    }
}