package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.GoodsTypeDao;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.GoodsType;
import com.qianfeng.market.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
    public ResponseDTO add(GoodsType goodsType) {

        if(goodsTypeDao.insertSelective(goodsType) == 1){
            return ResponseDTO.ok("增加商品类型成功");
        }else {
            return ResponseDTO.fail("增加商品类型失败");
        }
    }

    /**
     * 查看所有一级商品类型
     *
     * @return
     */
    @Override
    public List<GoodsType> selectTypesByParentId(int i) {

        return goodsTypeDao.selectTypesByParentId(i);
    }
}
