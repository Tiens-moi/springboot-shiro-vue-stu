package com.qxf.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.qxf.pojo.SysDict;

import java.util.List;

/**
 * @Auther: qiuxinfa
 * @Date: 2019/11/23
 * @Description: com.qxf.service
 */
public interface DictService extends IService<SysDict>{
    List<SysDict> findDictByPage(Page<SysDict> page, String dictValue);

    List<SysDict> findListByDictTypeCode(String dictTypeCode);
}
