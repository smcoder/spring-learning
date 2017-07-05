package com.personal;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by mac on 05/07/2017.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int i) {
        System.out.println("异步任务1：" + i + "; 线程名称：" + Thread.currentThread().getName());
    }


    @Async
    public void executeAsyncTask2(int i) {
        System.out.println("异步任务2：" + i + "; 线程名称：" + Thread.currentThread().getName());
    }
}
