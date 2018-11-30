package com.alen.football.interceptor.log;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author liulun
 */
public interface LogInfoJPA extends JpaRepository<TLoggerInfosEntity, Long>,
        JpaSpecificationExecutor<TLoggerInfosEntity>, Serializable {

}
