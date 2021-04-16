package com.qingcheng.service.goods;

import com.qingcheng.entity.pageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.List;
import java.util.Map;

public interface BrandService {
    public List<Brand> findAll();//

    public pageResult<Brand> findPage(int page,int size);//品牌分页查询方法

    public List<Brand> findList(Map<String,Object> searchMap);//品牌条件查询方法

    public pageResult<Brand> findPage(Map<String,Object> searchMap,int page,int size);//分页条件查询
}
