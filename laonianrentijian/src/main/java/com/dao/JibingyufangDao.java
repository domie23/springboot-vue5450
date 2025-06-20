package com.dao;

import com.entity.JibingyufangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JibingyufangView;

/**
 * 疾病预防 Dao 接口
 *
 * @author 
 */
public interface JibingyufangDao extends BaseMapper<JibingyufangEntity> {

   List<JibingyufangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
