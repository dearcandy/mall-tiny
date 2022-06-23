package com.trae.mall.tiny.modules.ums.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author trae
 * @since 2022-06-23
 */
@RestController
@RequestMapping("/ums/umsAdmin")
public class UmsAdminController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }
}

