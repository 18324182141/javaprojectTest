package com.qingcheng.controller;
//控制类控制品牌brand库的对象
import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.entity.pageResult;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brand")
public class BrandController {
    @Reference //这个注解是用于注入远程的接口
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @RequestMapping("/findPage")
    public pageResult<Brand> findPage(int page,int size){
        return brandService.findPage(page,size);
    }

    @PostMapping("/findList")
    public List<Brand> findList(@RequestBody Map searchMap){
        return  brandService.findList(searchMap);
    }

    @PostMapping("/findPage")
    public pageResult<Brand> findPage(
            @RequestBody Map searchMap,int page,int size){
        return brandService.findPage(searchMap,page,size);
    }
}
