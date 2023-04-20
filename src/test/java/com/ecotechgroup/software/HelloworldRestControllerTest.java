package com.ecotechgroup.software;

import com.ecotechgroup.software.restcontroller.HelloworldRestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.web.annotation.WebEndpoint;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloworldRestController.class)
public class HelloworldRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloRestPage() throws Exception{
        mockMvc.perform(get("/test-rest"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World Rest Controller Here"));
    }
}
