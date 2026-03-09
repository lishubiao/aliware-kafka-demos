package com.example.aftersale.mapper;

import com.example.aftersale.dto.AfterSaleQueryRequest;
import com.example.aftersale.entity.AfterSale;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 售后表 Mapper 接口
 */
@Mapper
public interface AfterSaleMapper {

    /**
     * 新增售后记录
     *
     * @param afterSale 售后实体
     * @return 影响行数
     */
    int insert(AfterSale afterSale);

    /**
     * 根据 ID 更新售后记录（选择性更新非空字段）
     *
     * @param afterSale 售后实体（必须包含id）
     * @return 影响行数
     */
    int updateById(AfterSale afterSale);

    /**
     * 根据 ID 逻辑删除（is_delete = 1）
     *
     * @param id 售后记录ID
     * @return 影响行数
     */
    int deleteById(@Param("id") Integer id);

    /**
     * 根据 ID 查询售后记录（排除已删除）
     *
     * @param id 售后记录ID
     * @return 售后实体
     */
    AfterSale selectById(@Param("id") Integer id);

    /**
     * 根据参考号查询售后记录列表（排除已删除）
     *
     * @param referenceNo 参考号
     * @return 售后记录列表
     */
    List<AfterSale> selectByReferenceNo(@Param("referenceNo") String referenceNo);

    /**
     * 多条件查询售后记录列表（排除已删除），配合 PageHelper 使用
     *
     * @param query 查询条件
     * @return 售后记录列表
     */
    List<AfterSale> selectList(AfterSaleQueryRequest query);
}
