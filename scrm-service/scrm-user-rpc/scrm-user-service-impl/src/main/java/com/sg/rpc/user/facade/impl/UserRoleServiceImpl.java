package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.UserRoleDomain;
import com.sg.rpc.user.facade.UserRoleFacade;
import com.sg.rpc.user.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关系 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleDomain> implements UserRoleFacade {

}
