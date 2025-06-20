package com.entity.vo;

import com.entity.JiangkangchangshiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健康常识
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiangkangchangshi")
public class JiangkangchangshiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 健康常识详情
     */

    @TableField(value = "jiangkangchangshi_content")
    private String jiangkangchangshiContent;


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
