package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.GoodsTypeDao;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.GoodsType;
import com.qianfeng.market.pojo.vo.GoodsTypeVO;
import com.qianfeng.market.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public List<GoodsTypeVO> selectTypesByParentId(int i) {

        List<GoodsTypeVO> parentTypes = goodsTypeDao.selectTypesByParentId(i);
//        for (GoodsTypeVO g:parentTypes){//for循环里调用查询语句影响性能
//            List<GoodsTypeVO> childrenTypes = goodsTypeDao.selectTypesByParentId(g.getParentTypeId());
//            g.setChildrenTypes(childrenTypes);
//        }

        List<GoodsTypeVO> childrenTypes = goodsTypeDao.selectTypesByParentIds(parentTypes);
        Map<Integer,List<GoodsTypeVO>> collect = childrenTypes.stream().collect(Collectors.groupingBy(GoodsTypeVO::getParentTypeId));
        for(GoodsTypeVO g:parentTypes){
            List<GoodsTypeVO> childTypes = collect.get(g.getGoodsTypeId());
            g.setChildrenTypes(childTypes);
        }
        return parentTypes;
    }
}
