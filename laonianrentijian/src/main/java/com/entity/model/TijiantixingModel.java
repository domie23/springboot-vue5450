package com.entity.model;

import com.entity.TijiantixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 体检提醒
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TijiantixingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 体检项目
     */
    private Integer tijianxiangmuId;


    /**
     * 体检日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date tijiantixingDateTime;


    /**
     * 体检时间
     */
    private String tijiantixingShijian;


    /**
     * 预计花费
     */
    private Double tijiantixingNumber;


    /**
     * 体检地点
     */
    private String tijiantixingAddress;


    /**
     * 联系电话
     */
    private String tijiantixingPhone;


    /**
     * 体检报告
     */
    private String tijiantixingFile;


    /**
     * 体检状态
     */
    private Integer tijiantixingTypes;


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
	 * 获取：体检日期
	 */
    public Date getTijiantixingDateTime() {
        return tijiantixingDateTime;
    }


    /**
	 * 设置：体检日期
	 */
    public void setTijiantixingDateTime(Date tijiantixingDateTime) {
        this.tijiantixingDateTime = tijiantixingDateTime;
    }
    /**
	 * 获取：体检时间
	 */
    public String getTijiantixingShijian() {
        return tijiantixingShijian;
    }


    /**
	 * 设置：体检时间
	 */
    public void setTijiantixingShijian(String tijiantixingShijian) {
        this.tijiantixingShijian = tijiantixingShijian;
    }
    /**
	 * 获取：预计花费
	 */
    public Double getTijiantixingNumber() {
        return tijiantixingNumber;
    }


    /**
	 * 设置：预计花费
	 */
    public void setTijiantixingNumber(Double tijiantixingNumber) {
        this.tijiantixingNumber = tijiantixingNumber;
    }
    /**
	 * 获取：体检地点
	 */
    public String getTijiantixingAddress() {
        return tijiantixingAddress;
    }


    /**
	 * 设置：体检地点
	 */
    public void setTijiantixingAddress(String tijiantixingAddress) {
        this.tijiantixingAddress = tijiantixingAddress;
    }
    /**
	 * 获取：联系电话
	 */
    public String getTijiantixingPhone() {
        return tijiantixingPhone;
    }


    /**
	 * 设置：联系电话
	 */
    public void setTijiantixingPhone(String tijiantixingPhone) {
        this.tijiantixingPhone = tijiantixingPhone;
    }
    /**
	 * 获取：体检报告
	 */
    public String getTijiantixingFile() {
        return tijiantixingFile;
    }


    /**
	 * 设置：体检报告
	 */
    public void setTijiantixingFile(String tijiantixingFile) {
        this.tijiantixingFile = tijiantixingFile;
    }
    /**
	 * 获取：体检状态
	 */
    public Integer getTijiantixingTypes() {
        return tijiantixingTypes;
    }


    /**
	 * 设置：体检状态
	 */
    public void setTijiantixingTypes(Integer tijiantixingTypes) {
        this.tijiantixingTypes = tijiantixingTypes;
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
