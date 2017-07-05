package com.personal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mac on 05/07/2017.
 */
@Controller
@RequestMapping("/index1")
public class HelloController {
    @RequestMapping("/index2")
    public String hello(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "index";
    }
}
