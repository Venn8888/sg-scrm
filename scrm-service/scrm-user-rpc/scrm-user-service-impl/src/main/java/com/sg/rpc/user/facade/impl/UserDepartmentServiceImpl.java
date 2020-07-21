package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.UserDepartmentDomain;
import com.sg.rpc.user.facade.UserDepartmentFacade;
import com.sg.rpc.user.mapper.UserDepartmentMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户部门表 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class UserDepartmentServiceImpl extends ServiceImpl<UserDepartmentMapper, UserDepartmentDomain> implements UserDepartmentFacade {

}
