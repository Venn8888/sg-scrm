package com.sg.middle.service.impl;
import com.sg.common.utils.SgResponse;
import com.sg.middle.service.UserService;
import com.sg.middle.vo.req.UserLoginReqVO;
import com.sg.order.entity.ChargeType;
import com.sg.order.service.ChargeTypeFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author venn
 * @version 1.0.0
 * @date 2020/7/17
 */
@Service
public class UserServiceImpl implements UserService {

    @Reference
    private ChargeTypeFacade chargeTypeFacade;

    @Override
    public SgResponse create(UserLoginReqVO reqVO) {
        ChargeType chargeType = new ChargeType();
        chargeType.setTypeName("123");
        chargeType.setStoreId("12");
        chargeType.setParentId(0);
        chargeType.setDescription("12");
        chargeType.setRemark("12");
        chargeType.setIsActive("Y");
        chargeType.setCreatedBy("venn");
        chargeType.setUpdatedBy("venn");
        chargeType.setCreatedDate(new Date());
        chargeType.setUpdatedDate(new Date());

        boolean save = chargeTypeFacade.save(chargeType);
        return SgResponse.ok(save);
    }
}
