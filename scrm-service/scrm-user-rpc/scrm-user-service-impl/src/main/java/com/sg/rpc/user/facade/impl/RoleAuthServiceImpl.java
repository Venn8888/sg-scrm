package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.RoleAuthDomain;
import com.sg.rpc.user.facade.RoleAuthFacade;
import com.sg.rpc.user.mapper.RoleAuthMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色权限关系 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class RoleAuthServiceImpl extends ServiceImpl<RoleAuthMapper, RoleAuthDomain> implements RoleAuthFacade {

}
