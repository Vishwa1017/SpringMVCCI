package com.SimpleMVCWebApp.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class WebMock {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnDoubleNumber() throws Exception {
        this.mockMvc.perform(get("http://localhost:8080/double?number=5")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("10.0")));

    }
}
