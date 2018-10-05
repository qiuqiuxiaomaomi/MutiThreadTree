package com.bonaparte.service;

import com.bonaparte.bean.TimerTaskExcutor;
import org.springframework.stereotype.Service;

import java.time.chrono.ChronoZonedDateTime;
import java.util.Date;
import java.util.Timer;

/**
 * Created by yangmingquan on 2018/10/4.
 */
@Service
public class CommunicatTimerTaskService {

    public void timerTaskExutorCheck(){
        Timer timer = new Timer();
        timer.schedule(new TimerTaskExcutor(), 16);
        timer.schedule(new TimerTaskExcutor(), 16, 2000);
        Date date = new Date();
        date.setMonth(date.getMonth() + 1);
        timer.schedule(new TimerTaskExcutor(), date);
    }
}
