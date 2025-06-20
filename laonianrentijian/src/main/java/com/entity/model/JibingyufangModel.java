package com.entity.model;

import com.entity.JibingyufangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疾病预防
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JibingyufangModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 疾病预防疾病预防标题
     */
    private String jibingyufangName;


    /**
     * 科普类型
     */
    private Integer jibingyufangTypes;


    /**
     * 疾病预防图片
     */
    private String jibingyufangPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 疾病预防详情
     */
    private String jibingyufangContent;


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
	 * 获取：疾病预防疾病预防标题
	 */
    public String getJibingyufangName() {
        return jibingyufangName;
    }


    /**
	 * 设置：疾病预防疾病预防标题
	 */
    public void setJibingyufangName(String jibingyufangName) {
        this.jibingyufangName = jibingyufangName;
    }
    /**
	 * 获取：科普类型
	 */
    public Integer getJibingyufangTypes() {
        return jibingyufangTypes;
    }


    /**
	 * 设置：科普类型
	 */
    public void setJibingyufangTypes(Integer jibingyufangTypes) {
        this.jibingyufangTypes = jibingyufangTypes;
    }
    /**
	 * 获取：疾病预防图片
	 */
    public String getJibingyufangPhoto() {
        return jibingyufangPhoto;
    }


    /**
	 * 设置：疾病预防图片
	 */
    public void setJibingyufangPhoto(String jibingyufangPhoto) {
        this.jibingyufangPhoto = jibingyufangPhoto;
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
	 * 获取：疾病预防详情
	 */
    public String getJibingyufangContent() {
        return jibingyufangContent;
    }


    /**
	 * 设置：疾病预防详情
	 */
    public void setJibingyufangContent(String jibingyufangContent) {
        this.jibingyufangContent = jibingyufangContent;
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
