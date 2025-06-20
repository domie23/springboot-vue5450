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
 * 健康常识
 *
 * @author 
 * @email
 */
@TableName("jiangkangchangshi")
public class JiangkangchangshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiangkangchangshiEntity() {

	}

	public JiangkangchangshiEntity(T t) {
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
     * 健康常识标题
     */
    @TableField(value = "jiangkangchangshi_name")

    private String jiangkangchangshiName;


    /**
     * 健康常识类型
     */
    @TableField(value = "jiangkangchangshi_types")

    private Integer jiangkangchangshiTypes;


    /**
     * 健康常识图片
     */
    @TableField(value = "jiangkangchangshi_photo")

    private String jiangkangchangshiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 健康常识详情
     */
    @TableField(value = "jiangkangchangshi_content")

    private String jiangkangchangshiContent;


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
	 * 设置：健康常识标题
	 */
    public String getJiangkangchangshiName() {
        return jiangkangchangshiName;
    }


    /**
	 * 获取：健康常识标题
	 */

    public void setJiangkangchangshiName(String jiangkangchangshiName) {
        this.jiangkangchangshiName = jiangkangchangshiName;
    }
    /**
	 * 设置：健康常识类型
	 */
    public Integer getJiangkangchangshiTypes() {
        return jiangkangchangshiTypes;
    }


    /**
	 * 获取：健康常识类型
	 */

    public void setJiangkangchangshiTypes(Integer jiangkangchangshiTypes) {
        this.jiangkangchangshiTypes = jiangkangchangshiTypes;
    }
    /**
	 * 设置：健康常识图片
	 */
    public String getJiangkangchangshiPhoto() {
        return jiangkangchangshiPhoto;
    }


    /**
	 * 获取：健康常识图片
	 */

    public void setJiangkangchangshiPhoto(String jiangkangchangshiPhoto) {
        this.jiangkangchangshiPhoto = jiangkangchangshiPhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：健康常识详情
	 */
    public String getJiangkangchangshiContent() {
        return jiangkangchangshiContent;
    }


    /**
	 * 获取：健康常识详情
	 */

    public void setJiangkangchangshiContent(String jiangkangchangshiContent) {
        this.jiangkangchangshiContent = jiangkangchangshiContent;
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
        return "Jiangkangchangshi{" +
            "id=" + id +
            ", jiangkangchangshiName=" + jiangkangchangshiName +
            ", jiangkangchangshiTypes=" + jiangkangchangshiTypes +
            ", jiangkangchangshiPhoto=" + jiangkangchangshiPhoto +
            ", insertTime=" + insertTime +
            ", jiangkangchangshiContent=" + jiangkangchangshiContent +
            ", createTime=" + createTime +
        "}";
    }
}
