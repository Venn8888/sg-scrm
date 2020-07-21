package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.RoleMenuDomain;
import com.sg.rpc.user.facade.RoleMenuFacade;
import com.sg.rpc.user.mapper.RoleMenuMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色菜单 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuDomain> implements RoleMenuFacade {

}
