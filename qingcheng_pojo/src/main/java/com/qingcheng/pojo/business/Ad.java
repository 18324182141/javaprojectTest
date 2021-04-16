package com.qingcheng.pojo.business;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name="tb_ad")
public class Ad implements Serializable {
    private Integer id;//ID
    private String name;//广告名称
    private String position;//广告位置
    private java.util.Date startTime;//广告开始时间
    private java.util.Date endTime;//广告的结束时间
    private String status;//状态
    private String image;//图片地址
    private String url;//URL
    private String remarks;//备注
    //设置get和set方法

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
