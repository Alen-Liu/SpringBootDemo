package com.alen.football;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * App:
 * 1. 使用mysql jpa 以及druid
 * 2. 使用swagger   http://localhost:8080/swagger-ui.html
 * 3. 记录请求日志，保存在db里面
 * 4. 使用 LogBack 进行操作记录输出和保存
 * 5. 统一接口输出和统一异常处理， 内部处理错误可以 直接抛出 LogicException
 * 6. 使用JWT进行token验证
 */
@EnableSwagger2
@SpringBootApplication
@EnableCaching
@EnableScheduling
public class FootballApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FootballApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FootballApplication.class);
    }

    /**
     * 配置内部的页面地址解析， 防止swagger找不到
     * @return
     */
    @Bean
    public InternalResourceViewResolver setupViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
