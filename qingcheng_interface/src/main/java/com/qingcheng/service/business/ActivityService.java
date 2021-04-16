package com.qingcheng.service.business;

import com.qingcheng.pojo.business.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    public List<Activity> findAll();
    public PageResult<Activity> findPage(int page,int szie);
    public List<Activity> findList(Map<String,Object> searchMap);
    public PageResult<Activity> findPage(Map<String,Object> searchMap,int page, int size);


    public Activity findById(Integer id);

    public void add(Activity activity);


    public void update(Activity activity);


    public void delete(Integer id);

}
