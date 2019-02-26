package com.platform.dao;

import com.platform.entity.ActivityGoodsVo;
import com.platform.entity.CouponGoodsVo;
import com.platform.entity.GoodsVo;

import java.util.List;
import java.util.Map;

/**
 * @author lipengjun
 * @email 939961241@qq.com
 * @date 2017-08-11 09:16:45
 */
public interface ApiGoodsMapper extends BaseDao<GoodsVo> {

    List<GoodsVo> queryHotGoodsList(Map<String, Object> params);

    List<GoodsVo> queryCatalogProductList(Map<String, Object> params);
    List<GoodsVo> queryTimeGoodsList(Map<String, Object> params);
    public List<ActivityGoodsVo> queryActivityGoodsList();
    public List<CouponGoodsVo> queryCouponGoodsList(Map params);
    public List<CouponGoodsVo> queryCouponGoodsListById(Integer userCouconId);
    public int queryCouponoodsTotal(Map<String,Object> params);
    
    
}
