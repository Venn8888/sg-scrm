package com.sg.order.service.impl;

import com.sg.order.entity.ChargeCategory;
import com.sg.order.mapper.ChargeCategoryMapper;
import com.sg.order.service.ChargeCategoryFacade;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 缴费类目表 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Service
@Component
public class ChargeCategoryFacadeImpl extends ServiceImpl<ChargeCategoryMapper, ChargeCategory> implements ChargeCategoryFacade {

}
