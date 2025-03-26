package com.dao;

import com.entity.CuenquyewuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CuenquyewuView;

/**
 * 存取业务 Dao 接口
 *
 * @author 
 */
public interface CuenquyewuDao extends BaseMapper<CuenquyewuEntity> {

   List<CuenquyewuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
