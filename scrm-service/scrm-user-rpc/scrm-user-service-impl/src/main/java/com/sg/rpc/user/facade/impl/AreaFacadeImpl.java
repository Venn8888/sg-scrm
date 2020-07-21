package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.AreaDomain;
import com.sg.rpc.user.facade.AreaFacade;
import com.sg.rpc.user.mapper.AreaMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 区域管理表 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class AreaFacadeImpl extends ServiceImpl<AreaMapper, AreaDomain> implements AreaFacade {

}
