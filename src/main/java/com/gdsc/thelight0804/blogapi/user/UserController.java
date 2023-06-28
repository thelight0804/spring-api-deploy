package com.gdsc.thelight0804.blogapi.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    @ResponseBody
    public String getLoginPage(){
        return "call getLoginPage";
    }
}
