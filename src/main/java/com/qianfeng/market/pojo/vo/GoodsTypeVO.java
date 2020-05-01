package com.qianfeng.market.pojo.vo;

import com.qianfeng.market.pojo.entity.GoodsType;
import lombok.Data;

import java.util.List;

/**
 * @author bingqiong.cbb
 * @date 2020-04-29 12:21
 **/
@Data
public class GoodsTypeVO extends GoodsType {
    /**
     * 子商品集合
     */
    private List<GoodsTypeVO> childrenTypes;
}
