package com.chava96;

import org.quartz.*;

import java.text.SimpleDateFormat;

/**
 *
 * Created by root on 7/24/17.
 */
public class TestTask {

    private Scheduler scheduler;

    // 设值注入，通过setter方法传入被调用者的实例scheduler
    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public int a = 0;

    public synchronized void doSomething() {
        //TODO
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(System.currentTimeMillis()));
        a++;
        if (a == 2) {
            try {
                reset();
            } catch (SchedulerException e) {
                e.printStackTrace();
            }
        }
        if(a == 5) {
            try {
                scheduler.shutdown();
            } catch (SchedulerException e) {
                e.printStackTrace();
            }
        }
    }

    public void  reset() throws SchedulerException {

        TriggerKey triggerKey = TriggerKey.triggerKey("testTrigger");

        //获取trigger，即在spring配置文件中定义的 bean id="myTrigger"
        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

        //表达式调度构建器
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("0/10 * * * * ?");

        //按新的cronExpression表达式重新构建trigger
        trigger = trigger.getTriggerBuilder().withIdentity(triggerKey)
                .withSchedule(scheduleBuilder).build();

        //按新的trigger重新设置job执行
        scheduler.rescheduleJob(triggerKey, trigger);
    }
}
