package com.sg.rpc.user.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 区域总部表
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("region")
public class RegionDomain extends Model<RegionDomain> {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 区域编码
     */
    private String code;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 是否删除 1=已删除 0=未删除
     */
    private Integer deleted;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 最后更新时间,根据当前时间戳更新
     */
    private LocalDateTime updatedAt;

    /**
     * 创建人工号
     */
    private String createdBy;

    /**
     * 最后更新人工号
     */
    private String updatedBy;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
