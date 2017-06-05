package com.bignipple.dao;

import com.bignipple.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * User: huangken
 * Date: 5/6/17
 * Time: PM4:00
 */
public interface SeckillDao {
    /**
     * 减库存
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 查询seckill
     */
    Seckill queryById(long seckillId);

    /**
     * 分页查询
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
