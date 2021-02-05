package com.example.demo.config;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author OceansHan
 * @date 2021/1/18 17:02
 * MybatisPlus配置
 */
@MapperScan(basePackages = "com.example.demo.mapper")
@EnableTransactionManagement
/**配置项的注解*/
@Configuration
public class MybatisPlusConfig {
    /**乐观锁配置，只写配置不能用*/
    @Bean
    public OptimisticLockerInterceptor OptimisticLockerInnerInterceptor() {
        return new OptimisticLockerInterceptor();
    }

    /**分页插件*/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
