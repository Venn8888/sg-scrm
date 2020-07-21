package com.sg.middle.service;

import com.sg.common.utils.SgResponse;
import com.sg.middle.vo.req.UserLoginReqVO;

/**
 * @author venn
 * @version 1.0.0
 * @date 2020/7/17
 */
public interface UserService {

    SgResponse create(UserLoginReqVO reqVO);
}
