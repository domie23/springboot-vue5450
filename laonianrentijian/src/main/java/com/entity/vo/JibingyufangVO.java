package com.entity.vo;

import com.entity.JibingyufangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 疾病预防
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jibingyufang")
public class JibingyufangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 疾病预防详情
     */

    @TableField(value = "jibingyufang_content")
    private String jibingyufangContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
