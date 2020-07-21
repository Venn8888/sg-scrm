package com.sg.rpc.user.facade.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sg.rpc.user.domain.RegionDomain;
import com.sg.rpc.user.facade.RegionFacade;
import com.sg.rpc.user.mapper.RegionMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 区域总部表 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Service
public class RegionServiceImpl extends ServiceImpl<RegionMapper, RegionDomain> implements RegionFacade {

}
