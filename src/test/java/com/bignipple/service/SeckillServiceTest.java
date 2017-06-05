package com.bignipple.service;

import com.bignipple.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM5:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillServiceTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SeckillService seckillService;

    @Test
    public void getSeckillList() throws Exception {
        List<Seckill> seckills = seckillService.getSeckillList();
        System.out.println(seckills);
    }

}