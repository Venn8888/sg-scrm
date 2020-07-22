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
 * 缴费订单表
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName(value = "so_charge_doc")
public class ChargeDoc extends Model<ChargeDoc> {

    private static final long serialVersionUID=1L;

    /**
     * 主键自增id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 类目id
     */
    private String categoryId;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 店铺id
     */
    private String storeId;

    /**
     * 店铺名称
     */
    private String storeName;

    /**
     * 状态(1:有效 2:待付款 3：退款 4：结束)
     */
    private String status;

    /**
     * 描述
     */
    private String description;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 总金额
     */
    private BigDecimal amount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 是否可用
     */
    private String isActive;

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
