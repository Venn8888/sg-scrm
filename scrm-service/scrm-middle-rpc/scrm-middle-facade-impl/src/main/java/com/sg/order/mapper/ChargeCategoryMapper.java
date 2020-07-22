package com.sg.order.mapper;

import com.sg.order.entity.ChargeCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 缴费类目表 Mapper 接口
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Mapper
public interface ChargeCategoryMapper extends BaseMapper<ChargeCategory> {

    /**
     * 条件查询所有
     * @param category 入参
     * @return list
     */
    List<ChargeCategory> selectListAll(ChargeCategory category);

    /**
     * 批量保存
     * @param list 入参
     * @return 成功的条数
     */
    int saveForeach(List<ChargeCategory> list);
}
