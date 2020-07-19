package com.xdclass.mybatis.dao;

import com.xdclass.mybatis.domain.User;
import com.xdclass.mybatis.domain.VideoOrder;

import java.util.List;

/**
 * @author wll
 * @Description: ${todo}
 * @date 2020/7/19 14:23
 */
public interface VideoOrderMapper {

    /**
     * @Description: 查询全部订单，关联用户信息
     * @return java.util.List<com.xdclass.mybatis.domain.VideoOrder>
    */
    List<VideoOrder> queryVideoOrderList();

    /**
     * @Description: 查询全部用户的全部订单
     * @return java.util.List<com.xdclass.mybatis.domain.User>
    */
    List<User> queryUserOrder();

}
