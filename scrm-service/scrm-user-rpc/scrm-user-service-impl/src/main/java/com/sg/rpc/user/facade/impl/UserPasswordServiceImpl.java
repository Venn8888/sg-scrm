package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.UserPasswordDomain;
import com.sg.rpc.user.facade.UserPasswordFacade;
import com.sg.rpc.user.mapper.UserPasswordMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户密码 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class UserPasswordServiceImpl extends ServiceImpl<UserPasswordMapper, UserPasswordDomain> implements UserPasswordFacade {

}
