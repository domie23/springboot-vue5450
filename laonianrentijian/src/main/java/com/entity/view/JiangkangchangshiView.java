package com.entity.view;

import com.entity.JiangkangchangshiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 健康常识
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiangkangchangshi")
public class JiangkangchangshiView extends JiangkangchangshiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 健康常识类型的值
		*/
		private String jiangkangchangshiValue;



	public JiangkangchangshiView() {

	}

	public JiangkangchangshiView(JiangkangchangshiEntity jiangkangchangshiEntity) {
		try {
			BeanUtils.copyProperties(this, jiangkangchangshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 健康常识类型的值
			*/
			public String getJiangkangchangshiValue() {
				return jiangkangchangshiValue;
			}
			/**
			* 设置： 健康常识类型的值
			*/
			public void setJiangkangchangshiValue(String jiangkangchangshiValue) {
				this.jiangkangchangshiValue = jiangkangchangshiValue;
			}













}
