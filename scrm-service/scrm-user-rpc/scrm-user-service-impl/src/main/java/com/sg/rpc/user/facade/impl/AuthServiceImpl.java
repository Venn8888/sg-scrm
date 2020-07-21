package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.AuthDomain;
import com.sg.rpc.user.facade.AuthFacade;
import com.sg.rpc.user.mapper.AuthMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class AuthServiceImpl extends ServiceImpl<AuthMapper, AuthDomain> implements AuthFacade {

}
