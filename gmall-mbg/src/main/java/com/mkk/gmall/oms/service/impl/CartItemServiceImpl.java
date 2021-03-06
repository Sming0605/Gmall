package com.mkk.gmall.oms.service.impl;

import com.mkk.gmall.oms.entity.CartItem;
import com.mkk.gmall.oms.mapper.CartItemMapper;
import com.mkk.gmall.oms.service.CartItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车表 服务实现类
 * </p>
 *
 * @author Smallming
 * @since 2020-07-13
 */
@Service
public class CartItemServiceImpl extends ServiceImpl<CartItemMapper, CartItem> implements CartItemService {

}
