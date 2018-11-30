package com.alen.football.modules.user.jpa;

import com.alen.football.modules.user.entity.UserEntity;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author liulun
 */
public interface UserJPA extends JpaRepository<UserEntity, Long>,
        JpaSpecificationExecutor<UserEntity>, Serializable {

    UserEntity findByUserName(@Param("user_name") String username);
}
