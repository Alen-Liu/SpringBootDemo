package com.alen.football.api;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author liulun
 */
@ControllerAdvice(annotations = RestController.class)
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public Object runtimeExceptionHandler(Exception e) {
        ApiResult apiResult = ApiResult.newInstance();
        apiResult.setResult(e.getMessage());
        apiResult.setMsg(ErrorMessage.SYSTEM_EXCEPTION);
        apiResult.setStatus(-1);
        if(e instanceof LogicException){
            apiResult.setMsg(((LogicException) e).getErrorMsg());
            log.error("logic error>>>>>>>>>>>>" + ((LogicException) e).getErrorMsg());
        } else {
            log.error("fatal error>>>>>>>>>>>>" + e.getMessage(), e);
        }
        return JSONObject.toJSON(apiResult);
    }
}
