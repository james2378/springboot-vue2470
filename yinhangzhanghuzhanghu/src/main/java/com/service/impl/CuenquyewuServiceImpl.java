package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.CuenquyewuDao;
import com.entity.CuenquyewuEntity;
import com.service.CuenquyewuService;
import com.entity.view.CuenquyewuView;

/**
 * 存取业务 服务实现类
 */
@Service("cuenquyewuService")
@Transactional
public class CuenquyewuServiceImpl extends ServiceImpl<CuenquyewuDao, CuenquyewuEntity> implements CuenquyewuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<CuenquyewuView> page =new Query<CuenquyewuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
