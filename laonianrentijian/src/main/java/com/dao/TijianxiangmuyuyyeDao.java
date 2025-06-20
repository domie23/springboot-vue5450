package com.dao;

import com.entity.TijianxiangmuyuyyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianxiangmuyuyyeView;

/**
 * 体检项目预约 Dao 接口
 *
 * @author 
 */
public interface TijianxiangmuyuyyeDao extends BaseMapper<TijianxiangmuyuyyeEntity> {

   List<TijianxiangmuyuyyeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
