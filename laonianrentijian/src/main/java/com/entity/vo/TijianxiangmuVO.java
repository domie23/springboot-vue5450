package com.entity.vo;

import com.entity.TijianxiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 体检项目
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tijianxiangmu")
public class TijianxiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
