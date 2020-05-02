package com.qianfeng.market.service.impl;

import com.qianfeng.market.dao.GoodsDao;
import com.qianfeng.market.dao.ShopCarDao;
import com.qianfeng.market.pojo.dto.ResponseDTO;
import com.qianfeng.market.pojo.entity.Goods;
import com.qianfeng.market.pojo.entity.ShopCar;
import com.qianfeng.market.pojo.vo.ShopCarVO;
import com.qianfeng.market.service.ShopCarService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.thymeleaf.util.ListUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author bingqiong.cbb
 * @date 2020-05-01 20:10
 **/
@Service
public class ShopCarServiceImpl implements ShopCarService {
    @Resource
    ShopCarDao shopCarDao;

    @Resource
    GoodsDao goodsDao;





    /**
     * @param shopCar
     * @return
     */
    @Override
    public ResponseDTO edit(ShopCar shopCar) {
        ShopCar dbCar = shopCarDao.findCarByUserIdAndGoodsId(shopCar);
        if(dbCar==null){//如果不存在则新增购物车，否则count++;
            shopCarDao.insert(shopCar);
        }else{
            int carCount = dbCar.getCount();
            dbCar.setCount(shopCar.getCount()+carCount);
            shopCarDao.updateByPrimaryKeySelective(dbCar);
        }
        //立刻获取session更新购物车
        HttpServletRequest httpServletRequest = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = httpServletRequest.getSession();
        int carcount = shopCarDao.selectCarCountByUserId((Integer) session.getAttribute("userId"));
        session.setAttribute("carCount",carcount);
        return ResponseDTO.ok("添加成功",carcount);
    }

    /**
     * 根据userId获得shopcar count
     *
     * @param userId
     * @return
     */
    @Override
    public Integer getCarCountByUserId(Integer userId) {

        return shopCarDao.selectCarCountByUserId(userId);
    }

    /**
     * 根据用户id查找购物车
     * @param
     * @return
     */
    @Override
    public List<ShopCarVO> findUserCar(Integer userId) {
        List<ShopCarVO> carVOS = shopCarDao.findUserCars(userId);
    //效率低做法
      //  for(ShopCarVO s:carVOS){
           // Goods goods = goodsDao.selectByPrimaryKey(s.getGoodsId());
//            s.setGoods();
      //  }
        if(ListUtils.isEmpty(carVOS)){
            return null;
        }
        List<Goods> goodsList = goodsDao.selectGoodsByIds(carVOS);

//        goodsList根据goodsId分组
        Map<Integer, List<Goods>> collect = goodsList.stream().collect(Collectors.groupingBy(Goods::getGoodsId));

        for(ShopCarVO s : carVOS){
            List<Goods> goodsList1 = collect.get(s.getGoodsId());
            if(!CollectionUtils.isEmpty(goodsList1)){
                s.setGoods(goodsList1.get(0));//取出商品并且设置这个购物车的商品属性

            }
        }

        return carVOS;
    }
}
