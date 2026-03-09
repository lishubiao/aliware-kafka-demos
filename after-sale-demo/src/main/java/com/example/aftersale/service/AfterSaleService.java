package com.example.aftersale.service;

import com.example.aftersale.dto.AfterSaleCreateRequest;
import com.example.aftersale.dto.AfterSaleQueryRequest;
import com.example.aftersale.dto.AfterSaleUpdateRequest;
import com.example.aftersale.vo.AfterSaleVO;
import com.example.aftersale.vo.PageResult;

/**
 * 售后管理 Service 接口
 */
public interface AfterSaleService {

    /**
     * 创建售后记录
     *
     * @param request 创建请求
     * @return 新记录的ID
     */
    Integer create(AfterSaleCreateRequest request);

    /**
     * 更新售后记录
     *
     * @param request 更新请求
     */
    void update(AfterSaleUpdateRequest request);

    /**
     * 逻辑删除售后记录
     *
     * @param id 售后记录ID
     */
    void delete(Integer id);

    /**
     * 根据 ID 查询售后记录详情
     *
     * @param id 售后记录ID
     * @return 售后记录VO
     */
    AfterSaleVO getById(Integer id);

    /**
     * 分页查询售后记录列表
     *
     * @param query 查询条件（含分页参数）
     * @return 分页结果
     */
    PageResult<AfterSaleVO> listPage(AfterSaleQueryRequest query);
}
