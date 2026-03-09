package com.example.aftersale.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 售后记录返回对象
 */
@Data
public class AfterSaleVO {

    /** ID */
    private Integer id;

    /** 创建时间 */
    private LocalDateTime createdTime;

    /** 更新时间 */
    private LocalDateTime updatedTime;

    /** 参考号 */
    private String referenceNo;

    /** 运单号 */
    private String trackNo;

    /** 平台名称 */
    private String platform;

    /** 平台账号名称 */
    private String platformAccount;

    /** 站点 */
    private String site;

    /** 买家名称 */
    private String buyerName;

    /** 买家邮箱 */
    private String buyerEmail;

    /** 买家电话 */
    private String phone;

    /** 售后来源 */
    private Integer source;

    /** 登记类型id */
    private Integer ty;

    /** 登记类型名称 */
    private String tyName;

    /** 登记类型全称（包括父名称） */
    private String tyFullName;

    /** 客户反馈内容 */
    private String description;

    /** 跟进情况 */
    private String info;

    /** 备注 */
    private String note;

    /** 登记人uid */
    private Integer createdUid;

    /** 登记人id */
    private Integer createdUserId;

    /** 登记人名称 */
    private String createdUserName;

    /** 代办人uid */
    private Integer todoUid;

    /** 代办人id */
    private Integer todoUserId;

    /** 代办人名称 */
    private String todoUserName;

    /** 完成处理时间 */
    private LocalDateTime processTime;

    /** 完成售后时间 */
    private LocalDateTime afterSaleTime;

    /** 是否完成售后（0 否 1 是） */
    private Integer isFinish;

    /**
     * 当前流程状态
     * 0 未开始 1 修改订单 2 暂停/延迟发货 3 发货 4 取消订单
     * 5 退款 6 Label 7 补发 8 退货产品分类 9 理赔 10 完成售后
     */
    private Integer flowStatus;

    /** 流程状态阶段（apply：申请后 process：处理后） */
    private String flowStatusStage;

    /** 国家二字码 */
    private String countryCode;

    /** 是否需要检测，英文逗号分隔 */
    private String detection;

    /** 仓库SKU（多个，用逗号分隔） */
    private String productSkuList;

    /** 币种 */
    private String currency;

    /** 平台创建时间（下单日期） */
    private LocalDateTime platformCreateDate;

    /** 标记内容 */
    private String sign;

    /** 是否重新开启编辑（0 否 1 是） */
    private Integer isEdit;
}
