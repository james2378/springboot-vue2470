package com.dao;

import com.entity.GuashiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GuashiView;

/**
 * 挂失信息 Dao 接口
 *
 * @author 
 */
public interface GuashiDao extends BaseMapper<GuashiEntity> {

   List<GuashiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
