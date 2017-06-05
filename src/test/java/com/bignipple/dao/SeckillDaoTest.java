package com.bignipple.dao;

import com.bignipple.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM4:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillDaoTest {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceNumber() throws Exception {
        Date killTime = new Date();
        int result = seckillDao.reduceNumber(1000L, killTime);
        System.out.println(result);
    }

    @Test
    public void queryById() throws Exception {
        long id = 1000L;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill);
    }

    @Test
    public void queryAll() {
        List<Seckill> list = seckillDao.queryAll(0, 5);
        for (Seckill seckill : list)
            System.out.println(seckill);
    }

}