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
 * 用户拓展信息
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_ext_info")
public class UserExtInfoDomain extends Model<UserExtInfoDomain> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 来源系统
     */
    private String sourceSystem;

    /**
     * 所属部门
     */
    private String belongDepartment;

    /**
     * 姓名拼音
     */
    private String realnameSpell;

    /**
     * 英文名
     */
    private String englishName;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 所属市场名称
     */
    private String market;

    /**
     * 人员所属区域
     */
    private String location;

    /**
     * 人员所属区域类型
     */
    private String orgType;

    /**
     * 人员所属位置名称
     */
    private String orgLocation;

    /**
     * 入职日期
     */
    private LocalDateTime joinDate;

    /**
     * 等级
     */
    private String grade;

    /**
     * 职位状态；0：正常，1：离职
     */
    private Integer jobStatus;

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
