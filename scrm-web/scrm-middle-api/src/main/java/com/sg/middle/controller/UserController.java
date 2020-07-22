package com.sg.middle.controller;

import com.sg.common.utils.SgResponse;
import com.sg.middle.service.UserService;
import com.sg.middle.vo.req.UserLoginReqVO;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author venn
 * @version 1.0.0
 * @date 2020/7/17
 */
@RestController
@Api(tags = "用户管理")
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/creat")
    public SgResponse creat(UserLoginReqVO reqVO) throws Exception {

        return SgResponse.ok(userService.create(reqVO));

    }

}
