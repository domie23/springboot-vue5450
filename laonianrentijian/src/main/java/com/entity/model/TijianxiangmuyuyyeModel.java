package com.entity.model;

import com.entity.TijianxiangmuyuyyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 体检项目预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TijianxiangmuyuyyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 体检项目
     */
    private Integer tijianxiangmuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 审核状态
     */
    private Integer tijianxiangmuyuyyeYesnoTypes;


    /**
     * 审核结果
     */
    private String tijianxiangmuyuyyeYesnoText;


    /**
     * 创建时间
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
	 * 获取：体检项目
	 */
    public Integer getTijianxiangmuId() {
        return tijianxiangmuId;
    }


    /**
	 * 设置：体检项目
	 */
    public void setTijianxiangmuId(Integer tijianxiangmuId) {
        this.tijianxiangmuId = tijianxiangmuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getTijianxiangmuyuyyeYesnoTypes() {
        return tijianxiangmuyuyyeYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setTijianxiangmuyuyyeYesnoTypes(Integer tijianxiangmuyuyyeYesnoTypes) {
        this.tijianxiangmuyuyyeYesnoTypes = tijianxiangmuyuyyeYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getTijianxiangmuyuyyeYesnoText() {
        return tijianxiangmuyuyyeYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setTijianxiangmuyuyyeYesnoText(String tijianxiangmuyuyyeYesnoText) {
        this.tijianxiangmuyuyyeYesnoText = tijianxiangmuyuyyeYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
