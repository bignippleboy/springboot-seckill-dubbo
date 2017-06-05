package com.bignipple.service.impl;

import com.bignipple.dao.SeckillDao;
import com.bignipple.entity.Seckill;
import com.bignipple.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM5:18
 */
@Service
public class SeckillServiceImpl implements SeckillService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private SeckillDao seckillDao;

    @Override
    public List<Seckill> getSeckillList() {
        return seckillDao.queryAll(0, 5);
    }
}
