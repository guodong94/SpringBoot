package com.example.scheduled.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/8/29.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat df= new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrenttime(){
        System.out.println("每隔5秒执行一次"+df.format(new Date()));
    }

    @Scheduled(cron = "0 7 18 ? * *")
    public void fixTimeExcution(){
        System.out.println("在指定时间"+df.format(new Date())+"执行");
    }
}
