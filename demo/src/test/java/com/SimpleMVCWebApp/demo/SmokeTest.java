package com.SimpleMVCWebApp.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

public class SmokeTest {

    @Autowired
    private NumberController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}
