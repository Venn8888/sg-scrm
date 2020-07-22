package com.sg.order.service.impl;

import com.sg.order.entity.ChargeType;
import com.sg.order.mapper.ChargeTypeMapper;
import com.sg.order.service.ChargeTypeFacade;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 缴费类型表 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Service
@Component
public class ChargeTypeFacadeImpl extends ServiceImpl<ChargeTypeMapper, ChargeType> implements ChargeTypeFacade {

}
