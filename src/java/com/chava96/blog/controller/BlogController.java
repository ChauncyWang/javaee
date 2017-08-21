package com.chava96.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by hy on 17-8-15.
 */
@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @ResponseBody
    @RequestMapping(value="/hello")
    public String hello(){
        return "hello";
    }
}
