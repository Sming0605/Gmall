package com.mkk.gmall.ums.service.impl;

import com.mkk.gmall.ums.entity.Member;
import com.mkk.gmall.ums.mapper.MemberMapper;
import com.mkk.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author Smallming
 * @since 2020-07-13
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
