package com.alen.football.modules.config.jpa;

import com.alen.football.modules.config.entity.SysConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author liulun
 */
public interface AppConfigJPA extends JpaRepository<SysConfigEntity, Long>,
        JpaSpecificationExecutor<SysConfigEntity>, Serializable {

}
