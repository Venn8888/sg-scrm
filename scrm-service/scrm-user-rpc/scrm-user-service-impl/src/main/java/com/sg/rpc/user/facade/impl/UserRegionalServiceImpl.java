package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.UserRegionalDomain;
import com.sg.rpc.user.facade.UserRegionalFacade;
import com.sg.rpc.user.mapper.UserRegionalMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户区域 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class UserRegionalServiceImpl extends ServiceImpl<UserRegionalMapper, UserRegionalDomain> implements UserRegionalFacade {

}
