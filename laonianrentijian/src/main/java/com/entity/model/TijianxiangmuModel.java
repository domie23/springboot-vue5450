package com.entity.model;

import com.entity.TijianxiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 体检项目
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TijianxiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String tijianxiangmuName;


    /**
     * 体检项目类型
     */
    private Integer tijianxiangmuTypes;


    /**
     * 项目封面
     */
    private String tijianxiangmuPhoto;


    /**
     * 体检项目详情
     */
    private String tijianxiangmuContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：标题
	 */
    public String getTijianxiangmuName() {
        return tijianxiangmuName;
    }


    /**
	 * 设置：标题
	 */
    public void setTijianxiangmuName(String tijianxiangmuName) {
        this.tijianxiangmuName = tijianxiangmuName;
    }
    /**
	 * 获取：体检项目类型
	 */
    public Integer getTijianxiangmuTypes() {
        return tijianxiangmuTypes;
    }


    /**
	 * 设置：体检项目类型
	 */
    public void setTijianxiangmuTypes(Integer tijianxiangmuTypes) {
        this.tijianxiangmuTypes = tijianxiangmuTypes;
    }
    /**
	 * 获取：项目封面
	 */
    public String getTijianxiangmuPhoto() {
        return tijianxiangmuPhoto;
    }


    /**
	 * 设置：项目封面
	 */
    public void setTijianxiangmuPhoto(String tijianxiangmuPhoto) {
        this.tijianxiangmuPhoto = tijianxiangmuPhoto;
    }
    /**
	 * 获取：体检项目详情
	 */
    public String getTijianxiangmuContent() {
        return tijianxiangmuContent;
    }


    /**
	 * 设置：体检项目详情
	 */
    public void setTijianxiangmuContent(String tijianxiangmuContent) {
        this.tijianxiangmuContent = tijianxiangmuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
