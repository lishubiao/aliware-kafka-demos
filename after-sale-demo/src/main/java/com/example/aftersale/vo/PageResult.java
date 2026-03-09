package com.example.aftersale.vo;

import lombok.Data;

import java.util.List;

/**
 * 分页结果封装
 *
 * @param <T> 列表数据类型
 */
@Data
public class PageResult<T> {

    /** 当前页码 */
    private Integer pageNum;

    /** 每页大小 */
    private Integer pageSize;

    /** 总记录数 */
    private Long total;

    /** 总页数 */
    private Integer pages;

    /** 数据列表 */
    private List<T> list;

    public PageResult() {
    }

    public PageResult(Integer pageNum, Integer pageSize, Long total, List<T> list) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.list = list;
        this.pages = (total == null || pageSize == null || pageSize <= 0)
                ? 0
                : (int) Math.ceil((double) total / pageSize);
    }
}
