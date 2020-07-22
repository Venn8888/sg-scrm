package com.sg.order.service.impl;

import com.sg.order.entity.ChargeDoc;
import com.sg.order.mapper.ChargeDocMapper;
import com.sg.order.service.ChargeDocFacade;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 缴费订单表 服务实现类
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Service
@Component
public class ChargeDocFacadeImpl extends ServiceImpl<ChargeDocMapper, ChargeDoc> implements ChargeDocFacade {

}
