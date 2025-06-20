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
 * 疾病预防
 *
 * @author 
 * @email
 */
@TableName("jibingyufang")
public class JibingyufangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JibingyufangEntity() {

	}

	public JibingyufangEntity(T t) {
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
     * 疾病预防疾病预防标题
     */
    @TableField(value = "jibingyufang_name")

    private String jibingyufangName;


    /**
     * 科普类型
     */
    @TableField(value = "jibingyufang_types")

    private Integer jibingyufangTypes;


    /**
     * 疾病预防图片
     */
    @TableField(value = "jibingyufang_photo")

    private String jibingyufangPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 疾病预防详情
     */
    @TableField(value = "jibingyufang_content")

    private String jibingyufangContent;


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
	 * 设置：疾病预防疾病预防标题
	 */
    public String getJibingyufangName() {
        return jibingyufangName;
    }


    /**
	 * 获取：疾病预防疾病预防标题
	 */

    public void setJibingyufangName(String jibingyufangName) {
        this.jibingyufangName = jibingyufangName;
    }
    /**
	 * 设置：科普类型
	 */
    public Integer getJibingyufangTypes() {
        return jibingyufangTypes;
    }


    /**
	 * 获取：科普类型
	 */

    public void setJibingyufangTypes(Integer jibingyufangTypes) {
        this.jibingyufangTypes = jibingyufangTypes;
    }
    /**
	 * 设置：疾病预防图片
	 */
    public String getJibingyufangPhoto() {
        return jibingyufangPhoto;
    }


    /**
	 * 获取：疾病预防图片
	 */

    public void setJibingyufangPhoto(String jibingyufangPhoto) {
        this.jibingyufangPhoto = jibingyufangPhoto;
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
	 * 设置：疾病预防详情
	 */
    public String getJibingyufangContent() {
        return jibingyufangContent;
    }


    /**
	 * 获取：疾病预防详情
	 */

    public void setJibingyufangContent(String jibingyufangContent) {
        this.jibingyufangContent = jibingyufangContent;
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
        return "Jibingyufang{" +
            "id=" + id +
            ", jibingyufangName=" + jibingyufangName +
            ", jibingyufangTypes=" + jibingyufangTypes +
            ", jibingyufangPhoto=" + jibingyufangPhoto +
            ", insertTime=" + insertTime +
            ", jibingyufangContent=" + jibingyufangContent +
            ", createTime=" + createTime +
        "}";
    }
}
