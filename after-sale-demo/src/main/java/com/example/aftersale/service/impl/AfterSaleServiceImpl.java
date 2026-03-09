package com.example.aftersale.service.impl;

import com.example.aftersale.dto.AfterSaleCreateRequest;
import com.example.aftersale.dto.AfterSaleQueryRequest;
import com.example.aftersale.dto.AfterSaleUpdateRequest;
import com.example.aftersale.entity.AfterSale;
import com.example.aftersale.mapper.AfterSaleMapper;
import com.example.aftersale.service.AfterSaleService;
import com.example.aftersale.vo.AfterSaleVO;
import com.example.aftersale.vo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 售后管理 Service 实现类
 */
@Service
public class AfterSaleServiceImpl implements AfterSaleService {

    @Autowired
    private AfterSaleMapper afterSaleMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Integer create(AfterSaleCreateRequest request) {
        AfterSale afterSale = new AfterSale();
        BeanUtils.copyProperties(request, afterSale);
        afterSale.setIsDelete(0);
        afterSale.setIsFinish(0);
        afterSale.setIsEdit(0);
        if (afterSale.getFlowStatus() == null) {
            afterSale.setFlowStatus(0);
        }
        afterSaleMapper.insert(afterSale);
        return afterSale.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(AfterSaleUpdateRequest request) {
        AfterSale existing = afterSaleMapper.selectById(request.getId());
        if (existing == null) {
            throw new IllegalArgumentException("售后记录不存在，ID：" + request.getId());
        }
        AfterSale afterSale = new AfterSale();
        BeanUtils.copyProperties(request, afterSale);
        afterSaleMapper.updateById(afterSale);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Integer id) {
        AfterSale existing = afterSaleMapper.selectById(id);
        if (existing == null) {
            throw new IllegalArgumentException("售后记录不存在，ID：" + id);
        }
        afterSaleMapper.deleteById(id);
    }

    @Override
    public AfterSaleVO getById(Integer id) {
        AfterSale afterSale = afterSaleMapper.selectById(id);
        if (afterSale == null) {
            return null;
        }
        AfterSaleVO vo = new AfterSaleVO();
        BeanUtils.copyProperties(afterSale, vo);
        return vo;
    }

    @Override
    public PageResult<AfterSaleVO> listPage(AfterSaleQueryRequest query) {
        PageHelper.startPage(query.getPageNum(), query.getPageSize());
        List<AfterSale> list = afterSaleMapper.selectList(query);
        PageInfo<AfterSale> pageInfo = new PageInfo<>(list);
        List<AfterSaleVO> voList = list.stream().map(item -> {
            AfterSaleVO vo = new AfterSaleVO();
            BeanUtils.copyProperties(item, vo);
            return vo;
        }).collect(Collectors.toList());
        return new PageResult<>(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getTotal(), voList);
    }
}
