package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.UserExtInfoDomain;
import com.sg.rpc.user.facade.UserExtInfoFacade;
import com.sg.rpc.user.mapper.UserExtInfoMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户拓展信息 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class UserExtInfoServiceImpl extends ServiceImpl<UserExtInfoMapper, UserExtInfoDomain> implements UserExtInfoFacade {

}
