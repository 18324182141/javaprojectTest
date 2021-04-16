package com.qingcheng.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.container.page.PageHandler;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingcheng.dao.BrandMapper;
import com.qingcheng.entity.pageResult;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired// @Autowired 是一个注释,它可以对类成员变量、方法及构造函数进行标注,让 spring 完成 bean 自动装配的工作
    private BrandMapper brandMapper;
    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();
    }

    //分页服务的实现，实现公共接口的 分页方法接口
    @Override
    public pageResult<Brand> findPage(int page, int size) {
        PageHelper.startPage(page,size);
        Page<Brand> pageResult=(Page<Brand>) brandMapper.selectAll();
        return new pageResult<>(pageResult.getTotal(),pageResult.getResult());
    }
    //实现品牌 条件查询 方法接口，Example类封装了Mybatis的方法，Criteria方法负责条件查询
    @Override
    public List<Brand> findList(Map<String, Object> searchMap) {
        Example example=createExample(searchMap);
        return brandMapper.selectByExample(example);
    }

    //为了使代码可以复用，将操作数据库的代码语句抽离出来
    private Example createExample(Map<String, Object> searchMap){
        Example example=new Example(Brand.class);
        Example.Criteria criteria=example.createCriteria();
        //操作数据库语句时先进行一下判断
        if(searchMap!=null){
            if(searchMap.get("name")!=null&&"".equals(searchMap.get("name")))   {
                criteria.andLike("name","%"+(String) searchMap.get("name")+"%");//执行模糊查询语句
            }
            if(searchMap.get("letter")!=null&&"".equals(searchMap.get("letter"))){
                //criteria.andLike("letter","%"+(String)searchMap.get("letter")+"%");执行模糊查询语句
                criteria.andEqualTo("letter","(String)searchMap.get(\"letter\")");//采用精确匹配查询语句
            }
        }
        return example;
    }

    //实现项目接口中的条件分页查询方法接口
    @Override
    public pageResult<Brand> findPage(Map<String, Object> searchMap, int page, int size) {
        PageHelper.startPage(page,size);
        Example example=createExample(searchMap);
        Page<Brand> pageResult=(Page<Brand>) brandMapper.selectByExample(example);
        return new pageResult<>(pageResult.getTotal(),pageResult.getResult());

    }
}
