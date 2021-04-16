package com.qingcheng.pojo.business;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/*
* Acticity的实体类
* */
@Table(name="tb_activity")
public class Activity implements Serializable {
    @Id
    private Integer id;//ID
    private String title;//活动标题
    private java.util.Date startTime;//活动开始时间
    private java.util.Date endTime;//活动结束时间
    private String status;//活动状态
    private String Content;//活动内容

    public Activity(Integer id, String title, Date startTime, Date endTime, String status, String content) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        Content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

}
