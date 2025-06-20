package com.entity.model;

import com.entity.JiangkangchangshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康常识
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiangkangchangshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 健康常识标题
     */
    private String jiangkangchangshiName;


    /**
     * 健康常识类型
     */
    private Integer jiangkangchangshiTypes;


    /**
     * 健康常识图片
     */
    private String jiangkangchangshiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 健康常识详情
     */
    private String jiangkangchangshiContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：健康常识标题
	 */
    public String getJiangkangchangshiName() {
        return jiangkangchangshiName;
    }


    /**
	 * 设置：健康常识标题
	 */
    public void setJiangkangchangshiName(String jiangkangchangshiName) {
        this.jiangkangchangshiName = jiangkangchangshiName;
    }
    /**
	 * 获取：健康常识类型
	 */
    public Integer getJiangkangchangshiTypes() {
        return jiangkangchangshiTypes;
    }


    /**
	 * 设置：健康常识类型
	 */
    public void setJiangkangchangshiTypes(Integer jiangkangchangshiTypes) {
        this.jiangkangchangshiTypes = jiangkangchangshiTypes;
    }
    /**
	 * 获取：健康常识图片
	 */
    public String getJiangkangchangshiPhoto() {
        return jiangkangchangshiPhoto;
    }


    /**
	 * 设置：健康常识图片
	 */
    public void setJiangkangchangshiPhoto(String jiangkangchangshiPhoto) {
        this.jiangkangchangshiPhoto = jiangkangchangshiPhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：健康常识详情
	 */
    public String getJiangkangchangshiContent() {
        return jiangkangchangshiContent;
    }


    /**
	 * 设置：健康常识详情
	 */
    public void setJiangkangchangshiContent(String jiangkangchangshiContent) {
        this.jiangkangchangshiContent = jiangkangchangshiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
