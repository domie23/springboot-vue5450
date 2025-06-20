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
 * 体检项目
 *
 * @author 
 * @email
 */
@TableName("tijianxiangmu")
public class TijianxiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TijianxiangmuEntity() {

	}

	public TijianxiangmuEntity(T t) {
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
     * 标题
     */
    @TableField(value = "tijianxiangmu_name")

    private String tijianxiangmuName;


    /**
     * 体检项目类型
     */
    @TableField(value = "tijianxiangmu_types")

    private Integer tijianxiangmuTypes;


    /**
     * 项目封面
     */
    @TableField(value = "tijianxiangmu_photo")

    private String tijianxiangmuPhoto;


    /**
     * 体检项目详情
     */
    @TableField(value = "tijianxiangmu_content")

    private String tijianxiangmuContent;


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
	 * 设置：标题
	 */
    public String getTijianxiangmuName() {
        return tijianxiangmuName;
    }


    /**
	 * 获取：标题
	 */

    public void setTijianxiangmuName(String tijianxiangmuName) {
        this.tijianxiangmuName = tijianxiangmuName;
    }
    /**
	 * 设置：体检项目类型
	 */
    public Integer getTijianxiangmuTypes() {
        return tijianxiangmuTypes;
    }


    /**
	 * 获取：体检项目类型
	 */

    public void setTijianxiangmuTypes(Integer tijianxiangmuTypes) {
        this.tijianxiangmuTypes = tijianxiangmuTypes;
    }
    /**
	 * 设置：项目封面
	 */
    public String getTijianxiangmuPhoto() {
        return tijianxiangmuPhoto;
    }


    /**
	 * 获取：项目封面
	 */

    public void setTijianxiangmuPhoto(String tijianxiangmuPhoto) {
        this.tijianxiangmuPhoto = tijianxiangmuPhoto;
    }
    /**
	 * 设置：体检项目详情
	 */
    public String getTijianxiangmuContent() {
        return tijianxiangmuContent;
    }


    /**
	 * 获取：体检项目详情
	 */

    public void setTijianxiangmuContent(String tijianxiangmuContent) {
        this.tijianxiangmuContent = tijianxiangmuContent;
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
        return "Tijianxiangmu{" +
            "id=" + id +
            ", tijianxiangmuName=" + tijianxiangmuName +
            ", tijianxiangmuTypes=" + tijianxiangmuTypes +
            ", tijianxiangmuPhoto=" + tijianxiangmuPhoto +
            ", tijianxiangmuContent=" + tijianxiangmuContent +
            ", createTime=" + createTime +
        "}";
    }
}
