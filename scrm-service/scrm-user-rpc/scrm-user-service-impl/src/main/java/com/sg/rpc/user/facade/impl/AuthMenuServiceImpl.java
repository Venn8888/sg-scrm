package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.AuthMenuDomain;
import com.sg.rpc.user.facade.AuthMenuFacade;
import com.sg.rpc.user.mapper.AuthMenuMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限点菜单 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class AuthMenuServiceImpl extends ServiceImpl<AuthMenuMapper, AuthMenuDomain> implements AuthMenuFacade {

}
