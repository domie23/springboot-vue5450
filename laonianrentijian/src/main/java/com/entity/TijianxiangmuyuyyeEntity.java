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
 * 体检项目预约
 *
 * @author 
 * @email
 */
@TableName("tijianxiangmuyuyye")
public class TijianxiangmuyuyyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TijianxiangmuyuyyeEntity() {

	}

	public TijianxiangmuyuyyeEntity(T t) {
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
     * 体检项目
     */
    @TableField(value = "tijianxiangmu_id")

    private Integer tijianxiangmuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 审核状态
     */
    @TableField(value = "tijianxiangmuyuyye_yesno_types")

    private Integer tijianxiangmuyuyyeYesnoTypes;


    /**
     * 审核结果
     */
    @TableField(value = "tijianxiangmuyuyye_yesno_text")

    private String tijianxiangmuyuyyeYesnoText;


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
	 * 设置：审核状态
	 */
    public Integer getTijianxiangmuyuyyeYesnoTypes() {
        return tijianxiangmuyuyyeYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setTijianxiangmuyuyyeYesnoTypes(Integer tijianxiangmuyuyyeYesnoTypes) {
        this.tijianxiangmuyuyyeYesnoTypes = tijianxiangmuyuyyeYesnoTypes;
    }
    /**
	 * 设置：审核结果
	 */
    public String getTijianxiangmuyuyyeYesnoText() {
        return tijianxiangmuyuyyeYesnoText;
    }


    /**
	 * 获取：审核结果
	 */

    public void setTijianxiangmuyuyyeYesnoText(String tijianxiangmuyuyyeYesnoText) {
        this.tijianxiangmuyuyyeYesnoText = tijianxiangmuyuyyeYesnoText;
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
        return "Tijianxiangmuyuyye{" +
            "id=" + id +
            ", tijianxiangmuId=" + tijianxiangmuId +
            ", yonghuId=" + yonghuId +
            ", tijianxiangmuyuyyeYesnoTypes=" + tijianxiangmuyuyyeYesnoTypes +
            ", tijianxiangmuyuyyeYesnoText=" + tijianxiangmuyuyyeYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
