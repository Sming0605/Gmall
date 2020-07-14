package com.mkk.gmall.oms.service.impl;

import com.mkk.gmall.oms.entity.Order;
import com.mkk.gmall.oms.mapper.OrderMapper;
import com.mkk.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Smallming
 * @since 2020-07-13
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
