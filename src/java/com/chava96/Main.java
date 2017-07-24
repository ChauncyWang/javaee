package com.chava96;

import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by 13969 on 2017/7/12.
 */
public class Main {
    public static void main(String[] args) throws SchedulerException {
        ApplicationContext context = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");

    }
}
