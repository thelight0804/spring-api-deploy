package com.gdsc.thelight0804.blogapi.user;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Tag(name="user", description = "User API endpoints") //API group
@RequestMapping("/user") //mapping /user
public class UserController {

    @GetMapping("/login") //mapping /login
    @ResponseBody
    @Operation(summary = "Login", description = "test login page") //API information
    public String getLoginPage(){
        return "call getLoginPage";
    }

    @PostMapping("/login") //mapping post /login
    @ResponseBody
    @Operation(summary = "Login", description = "post user login")
    public String login(
        @Parameter(name="name", description = "user id") String username,
        @Parameter(name="password", description = "user password") String password
    ){
        return "user/login";
    }
}
