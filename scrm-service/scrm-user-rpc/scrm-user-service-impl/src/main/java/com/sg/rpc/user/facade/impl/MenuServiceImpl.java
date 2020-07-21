package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.MenuDomain;
import com.sg.rpc.user.facade.MenuFacade;
import com.sg.rpc.user.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuDomain> implements MenuFacade {

}
