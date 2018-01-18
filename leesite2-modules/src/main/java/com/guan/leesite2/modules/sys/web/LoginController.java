package com.guan.leesite2.modules.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author guan
 * @version V1.0
 * @Title: ${file_name}
 * @Package ${package_name}
 * @date ${date} ${time}
 */
@Controller
public class LoginController {

    /**
     * 跳转登录页
     * @return
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "modules/sys/login";
    }
}
