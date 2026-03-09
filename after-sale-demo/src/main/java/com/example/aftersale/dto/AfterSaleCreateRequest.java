package com.example.aftersale.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 创建售后记录请求对象
 */
@Data
public class AfterSaleCreateRequest {

    /** 参考号（必填） */
    @NotBlank(message = "参考号不能为空")
    private String referenceNo;

    /** 运单号 */
    private String trackNo;

    /** 平台名称（必填） */
    @NotBlank(message = "平台名称不能为空")
    private String platform;

    /** 平台账号名称（必填） */
    @NotBlank(message = "平台账号名称不能为空")
    private String platformAccount;

    /** 站点 */
    private String site;

    /** 买家名称 */
    private String buyerName;

    /** 买家邮箱 */
    private String buyerEmail;

    /** 买家电话 */
    private String phone;

    /** 售后来源（必填） */
    @NotNull(message = "售后来源不能为空")
    private Integer source;

    /** 登记类型id */
    private Integer ty;

    /** 登记类型名称 */
    private String tyName;

    /** 登记类型全称（包括父名称） */
    private String tyFullName;

    /** 客户反馈内容 */
    private String description;

    /** 跟进情况（必填） */
    @NotBlank(message = "跟进情况不能为空")
    private String info;

    /** 备注 */
    private String note;

    /** 登记人uid */
    private Integer createdUid;

    /** 登记人id（必填） */
    @NotNull(message = "登记人id不能为空")
    private Integer createdUserId;

    /** 登记人名称（必填） */
    @NotBlank(message = "登记人名称不能为空")
    private String createdUserName;

    /** 代办人uid */
    private Integer todoUid;

    /** 代办人id */
    private Integer todoUserId;

    /** 代办人名称 */
    private String todoUserName;

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
}
