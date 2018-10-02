package com.bonaparte.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by yangmingquan on 2018/10/2.
 */
public interface MyMapper <T>  extends Mapper<T>, MySqlMapper<T> {
}
