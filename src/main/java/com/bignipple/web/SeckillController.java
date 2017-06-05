package com.bignipple.web;

import com.bignipple.entity.Seckill;
import com.bignipple.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM5:26
 */
@RestController
public class SeckillController {

    @Autowired
    private SeckillService seckillService;

    @GetMapping(value = "/seckill/list")
    public List<Seckill> listSeckill() {
        return seckillService.getSeckillList();
    }

}
