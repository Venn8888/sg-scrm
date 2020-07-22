package com.sg.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 缴费类型表
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "so_charge_type")
public class ChargeType extends Model<ChargeType> {

    private static final long serialVersionUID=1L;

    /**
     * 主键自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 门店id
     */
    private String storeId;

    /**
     * 父类id（默认-1为一级类别）
     */
    private Integer parentId;

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
