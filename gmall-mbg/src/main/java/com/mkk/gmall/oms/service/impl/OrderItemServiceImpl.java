package com.mkk.gmall.oms.service.impl;

import com.mkk.gmall.oms.entity.OrderItem;
import com.mkk.gmall.oms.mapper.OrderItemMapper;
import com.mkk.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Smallming
 * @since 2020-07-13
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
