package com.personal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mac on 05/07/2017.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            taskService.executeAsyncTask(i);
            taskService.executeAsyncTask2(i);
        }
        context.close();
    }
}
