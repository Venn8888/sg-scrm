package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.RoleDomain;
import com.sg.rpc.user.facade.RoleFacade;
import com.sg.rpc.user.mapper.RoleMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class RoleFacadeImpl extends ServiceImpl<RoleMapper, RoleDomain> implements RoleFacade {

}
