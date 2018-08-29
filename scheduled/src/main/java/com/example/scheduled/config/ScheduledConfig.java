package com.example.scheduled.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Administrator on 2018/8/29.
 */
@Configuration
@EnableScheduling
@ComponentScan("com.example.scheduled.*")
public class ScheduledConfig {

}
