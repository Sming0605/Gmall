package com.mkk.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mkk.gmall.pms.entity.ProductLadder;
import com.mkk.gmall.pms.mapper.ProductLadderMapper;
import com.mkk.gmall.pms.service.ProductLadderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Smallming
 * @since 2020-07-13
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}
