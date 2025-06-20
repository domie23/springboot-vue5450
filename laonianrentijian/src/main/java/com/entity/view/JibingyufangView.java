package com.entity.view;

import com.entity.JibingyufangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 疾病预防
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jibingyufang")
public class JibingyufangView extends JibingyufangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 科普类型的值
		*/
		private String jibingyufangValue;



	public JibingyufangView() {

	}

	public JibingyufangView(JibingyufangEntity jibingyufangEntity) {
		try {
			BeanUtils.copyProperties(this, jibingyufangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 科普类型的值
			*/
			public String getJibingyufangValue() {
				return jibingyufangValue;
			}
			/**
			* 设置： 科普类型的值
			*/
			public void setJibingyufangValue(String jibingyufangValue) {
				this.jibingyufangValue = jibingyufangValue;
			}













}
