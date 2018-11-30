package com.alen.football.modules.config;

import com.alen.football.annotation.UserLoginToken;
import com.alen.football.modules.config.entity.SysConfigEntity;
import com.alen.football.modules.config.jpa.AppConfigJPA;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/app/config")
@Slf4j
@Api("App配置相关")
public class AppConfigController {

    @Autowired
    AppConfigJPA configJPA;


    @ApiOperation(value = "getConfig", notes = "获取应用配置")
    @RequestMapping(method = RequestMethod.GET)
    public List<SysConfigEntity> getConfig(){
        return configJPA.findAll();
    }

    @UserLoginToken
    @ApiOperation(value = "token 测试")
    @RequestMapping(method = RequestMethod.POST, value = "/test")
    public String testToken() {
        return "您正常传入了token";
    }
}
