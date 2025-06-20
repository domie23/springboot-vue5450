package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 体检提醒
 *
 * @author 
 * @email
 */
@TableName("tijiantixing")
public class TijiantixingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TijiantixingEntity() {

	}

	public TijiantixingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 体检项目
     */
    @TableField(value = "tijianxiangmu_id")

    private Integer tijianxiangmuId;


    /**
     * 体检日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "tijiantixing_date_time")

    private Date tijiantixingDateTime;


    /**
     * 体检时间
     */
    @TableField(value = "tijiantixing_shijian")

    private String tijiantixingShijian;


    /**
     * 预计花费
     */
    @TableField(value = "tijiantixing_number")

    private Double tijiantixingNumber;


    /**
     * 体检地点
     */
    @TableField(value = "tijiantixing_address")

    private String tijiantixingAddress;


    /**
     * 联系电话
     */
    @TableField(value = "tijiantixing_phone")

    private String tijiantixingPhone;


    /**
     * 体检报告
     */
    @TableField(value = "tijiantixing_file")

    private String tijiantixingFile;


    /**
     * 体检状态
     */
    @TableField(value = "tijiantixing_types")

    private Integer tijiantixingTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：体检项目
	 */
    public Integer getTijianxiangmuId() {
        return tijianxiangmuId;
    }


    /**
	 * 获取：体检项目
	 */

    public void setTijianxiangmuId(Integer tijianxiangmuId) {
        this.tijianxiangmuId = tijianxiangmuId;
    }
    /**
	 * 设置：体检日期
	 */
    public Date getTijiantixingDateTime() {
        return tijiantixingDateTime;
    }


    /**
	 * 获取：体检日期
	 */

    public void setTijiantixingDateTime(Date tijiantixingDateTime) {
        this.tijiantixingDateTime = tijiantixingDateTime;
    }
    /**
	 * 设置：体检时间
	 */
    public String getTijiantixingShijian() {
        return tijiantixingShijian;
    }


    /**
	 * 获取：体检时间
	 */

    public void setTijiantixingShijian(String tijiantixingShijian) {
        this.tijiantixingShijian = tijiantixingShijian;
    }
    /**
	 * 设置：预计花费
	 */
    public Double getTijiantixingNumber() {
        return tijiantixingNumber;
    }


    /**
	 * 获取：预计花费
	 */

    public void setTijiantixingNumber(Double tijiantixingNumber) {
        this.tijiantixingNumber = tijiantixingNumber;
    }
    /**
	 * 设置：体检地点
	 */
    public String getTijiantixingAddress() {
        return tijiantixingAddress;
    }


    /**
	 * 获取：体检地点
	 */

    public void setTijiantixingAddress(String tijiantixingAddress) {
        this.tijiantixingAddress = tijiantixingAddress;
    }
    /**
	 * 设置：联系电话
	 */
    public String getTijiantixingPhone() {
        return tijiantixingPhone;
    }


    /**
	 * 获取：联系电话
	 */

    public void setTijiantixingPhone(String tijiantixingPhone) {
        this.tijiantixingPhone = tijiantixingPhone;
    }
    /**
	 * 设置：体检报告
	 */
    public String getTijiantixingFile() {
        return tijiantixingFile;
    }


    /**
	 * 获取：体检报告
	 */

    public void setTijiantixingFile(String tijiantixingFile) {
        this.tijiantixingFile = tijiantixingFile;
    }
    /**
	 * 设置：体检状态
	 */
    public Integer getTijiantixingTypes() {
        return tijiantixingTypes;
    }


    /**
	 * 获取：体检状态
	 */

    public void setTijiantixingTypes(Integer tijiantixingTypes) {
        this.tijiantixingTypes = tijiantixingTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Tijiantixing{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", tijianxiangmuId=" + tijianxiangmuId +
            ", tijiantixingDateTime=" + tijiantixingDateTime +
            ", tijiantixingShijian=" + tijiantixingShijian +
            ", tijiantixingNumber=" + tijiantixingNumber +
            ", tijiantixingAddress=" + tijiantixingAddress +
            ", tijiantixingPhone=" + tijiantixingPhone +
            ", tijiantixingFile=" + tijiantixingFile +
            ", tijiantixingTypes=" + tijiantixingTypes +
            ", createTime=" + createTime +
        "}";
    }
}
