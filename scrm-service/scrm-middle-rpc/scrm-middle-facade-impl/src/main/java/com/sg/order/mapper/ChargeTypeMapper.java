package com.sg.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sg.order.entity.ChargeType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 缴费类型表 Mapper 接口
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Mapper
public interface ChargeTypeMapper extends BaseMapper<ChargeType> {

    /**
     * 条件查询所有
     * @param chargeType 入参
     * @return list
     */
    List<ChargeType> selectListAll(ChargeType chargeType);

    /**
     * 批量保存
     * @param list 入参
     * @return 成功的条数
     */
    int saveForeach(List<ChargeType> list);
}
