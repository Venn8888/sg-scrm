package com.sg.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sg.order.entity.ChargeDoc;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 缴费订单表 Mapper 接口
 * </p>
 *
 * @author venn
 * @since 2020-07-21
 */
@Mapper
public interface ChargeDocMapper extends BaseMapper<ChargeDoc> {
    /**
     * 条件查询所有
     * @param chargeDoc 入参
     * @return list
     */
    List<ChargeDoc> selectListAll(ChargeDoc chargeDoc);

    /**
     * 批量保存
     * @param list 入参
     * @return 成功的条数
     */
    int saveForeach(List<ChargeDoc> list);
}
