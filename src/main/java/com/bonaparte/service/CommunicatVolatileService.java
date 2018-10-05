package com.bonaparte.service;

import com.bonaparte.dao.mapper.ChargeMapper;
import com.bonaparte.entity.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatVolatileService {
    @Autowired
    ChargeMapper chargeMapper;

    public void updateChargeExt(){
        Charge charge = chargeMapper.selectByPrimaryKey(1);
        charge.setMoney(1.9);
        chargeMapper.updateByPrimaryKey(charge);

        Charge charge1 = chargeMapper.selectByPrimaryKey(2);
    }
}
