package com.sg.rpc.user.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class UserDomain extends Model<UserDomain> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号（一般为工号）
     */
    private String account;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别；1：男， 0：女，-1：未知
     */
    private Integer gender;

    /**
     * 手机号码
     */
    private String mobileNumber;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 职位
     */
    private String position;

    /**
     * 部门
     */
    private String department;

    /**
     * 状态；1：有效， 0：禁用，2：锁定（密码连续错误6次）
     */
    private Integer status;

    /**
     * 头像url
     */
    private String headPortraitUrl;

    /**
     * 是否删除；0：否、 1：是
     */
    private Integer deleted;

    /**
     * 创建人工号
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 最后更新人工号
     */
    private String updatedBy;

    /**
     * 最后更新时间
     */
    private LocalDateTime updatedAt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
