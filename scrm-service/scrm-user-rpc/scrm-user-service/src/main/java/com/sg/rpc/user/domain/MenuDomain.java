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
 * 菜单
 * </p>
 *
 * @author venn
 * @since 2020-07-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("menu")
public class MenuDomain extends Model<MenuDomain> {

    private static final long serialVersionUID=1L;

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单key
     */
    private String menuKey;

    /**
     * 父菜单key
     */
    private String parentKey;

    /**
     * 应用编码
     */
    private String applicationCode;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 子菜单名称
     */
    private String subName;

    /**
     * 图标
     */
    private String icon;

    /**
     * 地址
     */
    private String url;

    /**
     * 显示策略 1：所有用户可见、2：指定权限点、3、指定角色
     */
    private Integer showStrategy;

    /**
     * 权限点顺序
     */
    private Integer orderNum;

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
