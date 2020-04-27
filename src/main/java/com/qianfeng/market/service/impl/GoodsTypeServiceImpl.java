package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.GoodsTypeDao;
import com.qianfeng.market.pojo.entity.GoodsType;
import com.qianfeng.market.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bingqiong.cbb
 * @date 2020-04-28 00:27
 **/
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    GoodsTypeDao goodsTypeDao;
    @Override
    public Map<String, Object> add(GoodsType goodsType) {
        Map<String, Object> resMap = new HashMap<>();
        int i = goodsTypeDao.insertSelective(goodsType);
        if(i == 1){
            resMap.put("res", true);//增加成功
            resMap.put("msg","增加成功");
        }else {
            resMap.put("res", false);//增加成功
            resMap.put("msg","增加失败");
        }
        return resMap;
    }
}
