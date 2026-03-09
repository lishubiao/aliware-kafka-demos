package com.example.aftersale.controller;

import com.example.aftersale.common.Result;
import com.example.aftersale.dto.AfterSaleCreateRequest;
import com.example.aftersale.dto.AfterSaleQueryRequest;
import com.example.aftersale.dto.AfterSaleUpdateRequest;
import com.example.aftersale.service.AfterSaleService;
import com.example.aftersale.vo.AfterSaleVO;
import com.example.aftersale.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 售后管理控制层
 */
@RestController
@RequestMapping("/api/after-sale")
public class AfterSaleController {

    @Autowired
    private AfterSaleService afterSaleService;

    /**
     * 创建售后记录
     *
     * @param request 创建请求体
     * @return 新记录ID
     */
    @PostMapping
    public Result<Integer> create(@Valid @RequestBody AfterSaleCreateRequest request) {
        Integer id = afterSaleService.create(request);
        return Result.success(id);
    }

    /**
     * 更新售后记录
     *
     * @param request 更新请求体（需包含id）
     * @return 操作结果
     */
    @PutMapping
    public Result<Void> update(@Valid @RequestBody AfterSaleUpdateRequest request) {
        afterSaleService.update(request);
        return Result.success();
    }

    /**
     * 逻辑删除售后记录
     *
     * @param id 售后记录ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<Void> delete(@PathVariable @NotNull Integer id) {
        afterSaleService.delete(id);
        return Result.success();
    }

    /**
     * 根据 ID 查询售后记录详情
     *
     * @param id 售后记录ID
     * @return 售后记录详情
     */
    @GetMapping("/{id}")
    public Result<AfterSaleVO> getById(@PathVariable @NotNull Integer id) {
        AfterSaleVO vo = afterSaleService.getById(id);
        if (vo == null) {
            return Result.error(404, "售后记录不存在");
        }
        return Result.success(vo);
    }

    /**
     * 分页查询售后记录列表
     *
     * @param query 查询条件（含分页参数）
     * @return 分页结果
     */
    @GetMapping("/list")
    public Result<PageResult<AfterSaleVO>> listPage(AfterSaleQueryRequest query) {
        PageResult<AfterSaleVO> pageResult = afterSaleService.listPage(query);
        return Result.success(pageResult);
    }
}
