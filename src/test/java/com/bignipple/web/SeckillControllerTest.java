package com.bignipple.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM5:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SeckillControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void listSeckill() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/seckill/list"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}