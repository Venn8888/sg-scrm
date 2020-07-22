package com.sg.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 缴费类目表
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "so_charge_category")
public class ChargeCategory extends Model<ChargeCategory> {

    private static final long serialVersionUID=1L;

    /**
     * 主键自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 状态（0:正常 1：锁定）
     */
    private String status;

    /**
     * 缴费类型id
     */
    private Integer paymentTypeId;

    /**
     * 有效开始时间
     */
    private Date useBeginTime;

    /**
     * 有效结束时间
     */
    private Date useEndTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否可用 Y/N
     */
    private String isActive;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 创建日期
     */
    private Date createdDate;

    /**
     * 修改日期
     */
    private Date updatedDate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
