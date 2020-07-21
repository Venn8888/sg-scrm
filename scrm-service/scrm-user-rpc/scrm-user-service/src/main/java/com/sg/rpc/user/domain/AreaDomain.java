package com.sg.rpc.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 区域管理表
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AreaDomain extends Model<AreaDomain> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 父级地区主键
     */
    private Integer parentId;

    /**
     * 地区名称
     */
    private String name;

    /**
     * 地区名称首字母
     */
    private String initials;

    /**
     * 地区层级
     */
    private Integer level;

    /**
     * 区域类别(省，市，区，县，社区)通过枚举(0:国家;1:省;2:市;3;区县;4:街道;5:社区)
     */
    private Integer type;

    /**
     * 排序，越小越靠前
     */
    private Integer sort;

    /**
     * 是否启用 0：否，1：是初始化默认为1
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    /**
     * 是否删除 1=已删除 0=未删除
     */
    private Integer deleted;

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
