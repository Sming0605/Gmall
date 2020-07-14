package com.mkk.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mkk.gmall.pms.entity.AlbumPic;
import com.mkk.gmall.pms.mapper.AlbumPicMapper;
import com.mkk.gmall.pms.service.AlbumPicService;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author Smallming
 * @since 2020-07-13
 */
@Service
@Component
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
