package com.bonaparte.dao.mapper;

import com.bonaparte.entity.Charge;
import com.bonaparte.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yangmingquan on 2018/10/2.
 */
public interface ChargeMapper extends MyMapper<Charge> {

    @Select("select * from p_charge where uid = #{uid}")
    public List<Charge> getAllChargesByUid(@Param("uid") Integer uid);
}
