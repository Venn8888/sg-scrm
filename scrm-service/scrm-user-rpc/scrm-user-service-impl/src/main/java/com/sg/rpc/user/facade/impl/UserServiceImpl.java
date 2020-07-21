package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.UserDomain;
import com.sg.rpc.user.facade.UserFacade;
import com.sg.rpc.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDomain> implements UserFacade {

}
