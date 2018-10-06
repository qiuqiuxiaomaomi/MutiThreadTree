package com.bonaparte.service;

import com.bonaparte.bean.ChildrenExchagerRunnable;
import com.bonaparte.bean.FatherExchangerRunnable;
import org.springframework.stereotype.Service;

import java.util.concurrent.Exchanger;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatExchangerService {
    Exchanger<String> exchanger = new Exchanger();

    public void exchangerCheck(){
        FatherExchangerRunnable fatherExchangerRunnable = new FatherExchangerRunnable(exchanger);
        ChildrenExchagerRunnable childrenExchagerRunnable = new ChildrenExchagerRunnable(exchanger);
        fatherExchangerRunnable.run();
        childrenExchagerRunnable.run();
    }
}
