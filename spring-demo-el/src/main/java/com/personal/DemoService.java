package com.personal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by mac on 05/07/2017.
 */
@Service
public class DemoService {
    // 注入普通字符串
    @Value("zhiyong.feng")
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
