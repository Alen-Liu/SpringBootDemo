package com.alen.football.modules.user.service;


import com.alen.football.modules.user.entity.UserEntity;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;


@Service("TokenService")
public class TokenService {

    public String getToken(UserEntity user) {
        String token="";
        token= JWT.create().withAudience(user.getUserName())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }

}
