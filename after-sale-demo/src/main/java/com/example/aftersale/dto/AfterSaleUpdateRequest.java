package com.example.aftersale.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 更新售后记录请求对象
 */
@Data
public class AfterSaleUpdateRequest {

    /** ID（必填） */
    @NotNull(message = "售后记录ID不能为空")
    private Integer id;

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

    /** 当前流程状态 */
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
