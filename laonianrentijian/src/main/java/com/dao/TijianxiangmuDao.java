package com.dao;

import com.entity.TijianxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TijianxiangmuView;

/**
 * 体检项目 Dao 接口
 *
 * @author 
 */
public interface TijianxiangmuDao extends BaseMapper<TijianxiangmuEntity> {

   List<TijianxiangmuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
