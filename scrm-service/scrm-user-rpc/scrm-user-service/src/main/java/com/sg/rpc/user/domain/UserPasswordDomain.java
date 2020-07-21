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
 * 用户密码
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_password")
public class UserPasswordDomain extends Model<UserPasswordDomain> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Long userId;

    /**
     * 密码，MD5加密存储
     */
    private String password;

    /**
     * 密码盐
     */
    private String passwordSalt;

    /**
     * 状态；1：有效，0：失效，2：初始化密码， 修改密码后生产新密码，历史密码失效
     */
    private Integer status;

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
