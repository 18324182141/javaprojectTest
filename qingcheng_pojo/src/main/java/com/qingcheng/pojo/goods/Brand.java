package com.qingcheng.pojo.goods;

import javax.persistence.Id;
import javax.persistence.Table;
//由于项目部署在dubbo上，发布到网上，所以数据传输前需要被序列化
import java.io.Serializable;
//加table注解将数据库实体类对应数据库中的表
@Table(name = "tb_brand")
public class Brand implements Serializable {
    //将主键用注解标明
    @Id
    private Integer id;//品牌id

    private  String name;//品牌名称

    private  String image;//品牌图片的地址

    private String letter;//品牌是的首字母

    private Integer sqq;//排序

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public Integer getSqq() {
        return sqq;
    }

    public void setSqq(Integer sqq) {
        this.sqq = sqq;
    }
}
