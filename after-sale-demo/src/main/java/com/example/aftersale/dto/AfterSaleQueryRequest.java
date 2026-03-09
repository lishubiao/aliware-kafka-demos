package com.example.aftersale.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 查询售后记录请求对象（支持分页和多条件查询）
 */
@Data
public class AfterSaleQueryRequest {

    /** 当前页码，默认第1页 */
    private Integer pageNum = 1;

    /** 每页大小，默认10条 */
    private Integer pageSize = 10;

    /** 参考号（模糊查询） */
    private String referenceNo;

    /** 运单号（模糊查询） */
    private String trackNo;

    /** 平台名称 */
    private String platform;

    /** 平台账号名称 */
    private String platformAccount;

    /** 站点 */
    private String site;

    /** 买家名称（模糊查询） */
    private String buyerName;

    /** 买家邮箱（模糊查询） */
    private String buyerEmail;

    /** 买家电话 */
    private String phone;

    /** 售后来源 */
    private Integer source;

    /** 登记类型id */
    private Integer ty;

    /** 登记人id */
    private Integer createdUserId;

    /** 代办人id */
    private Integer todoUserId;

    /** 是否完成售后（0 否 1 是） */
    private Integer isFinish;

    /** 当前流程状态 */
    private Integer flowStatus;

    /** 流程状态阶段（apply：申请后 process：处理后） */
    private String flowStatusStage;

    /** 国家二字码 */
    private String countryCode;

    /** 标记内容 */
    private String sign;

    /** 创建时间 - 开始 */
    private LocalDateTime createdTimeStart;

    /** 创建时间 - 结束 */
    private LocalDateTime createdTimeEnd;

    /** 平台创建时间（下单日期）- 开始 */
    private LocalDateTime platformCreateDateStart;

    /** 平台创建时间（下单日期）- 结束 */
    private LocalDateTime platformCreateDateEnd;

    /** 是否重新开启编辑（0 否 1 是） */
    private Integer isEdit;
}
