package com.alen.football.modules.user;

import com.alen.football.annotation.PassToken;
import com.alen.football.annotation.UserLoginToken;
import com.alen.football.api.LogicException;
import com.alen.football.modules.user.entity.UserEntity;
import com.alen.football.modules.user.jpa.UserJPA;
import com.alen.football.modules.user.service.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
@Slf4j
@Api("用户信息")
public class UserController {
    @Autowired
    UserJPA userJPA;
    @Autowired
    TokenService tokenService;

    @PassToken
    @ApiOperation(value = "用户登录")
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String login(@RequestParam String userName, @RequestParam String password){
        String token = "";
        UserEntity userEntity = userJPA.findByUserName(userName);
        if(userEntity == null){
            throw new LogicException("登录失败，用户不存在");
        } else {
            if(!password.equals(userEntity.getPassword())){
                throw new LogicException("密码不正确");
            } else {
                token = tokenService.getToken(userEntity);
            }
        }

        return token;
    }


}
