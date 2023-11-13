package com.lm.job;


import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
/**
 * @author ming.li
 * @date 2023/11/13 19:40
 */
public class QuartzTest {

    public static void main(String[] args) {
        try {
            // 获取默认的调度器实例
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            // 打开调度器
            scheduler.start();

            // 定义一个简单的任务
            JobDetail job = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("job11", "group1")
                    .usingJobData("name","张三")
                    .build();

            // 定义一个简单的触发器: 每隔 1 秒执行 1 次，任务永不停止
            SimpleTrigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    .withSchedule(SimpleScheduleBuilder
                            .simpleSchedule()
                            .withIntervalInSeconds(1)
                            .repeatForever()
                    ).build();

            // 开始调度任务
            scheduler.scheduleJob(job, trigger);

            // 等待任务执行一些时间
            Thread.sleep(3000);

            // 关闭调度器
            scheduler.shutdown();
        } catch (Exception se) {
            se.printStackTrace();
        }
    }
}

