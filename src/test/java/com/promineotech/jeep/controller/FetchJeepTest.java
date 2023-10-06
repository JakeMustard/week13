package com.promineotech.jeep.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class FetchJeepTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied() throws Exception {
        // Your test code here using mockMvc to perform HTTP requests and assertions
    }
}
