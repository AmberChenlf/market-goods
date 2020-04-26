package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.GoodsDao;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.service.GoodsServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-27 01:41
 **/
@Service
public class GoodsServiceImpl implements GoodsServices {
    @Resource
    GoodsDao goodsDao;
    /**
     * 增加商品
     *
     * @param goods
     */
    @Override
    public Map<String, Object> add(Goods goods) {
        Map<String,Object> resMap = new HashMap<>();

        int i = goodsDao.insertSelective(goods);
        if(i == 1){
            resMap.put("res", true);//增加成功
            resMap.put("msg","增加 成功");
        }else {
            resMap.put("res", false);//增加成功
            resMap.put("msg","增加 失败");
        }
        return null;
    }
}
