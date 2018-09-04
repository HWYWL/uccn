package com.yi.uccn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 登录检验拦截
 * @author YI
 * @date 2018-7-19 14:55:13
 */
@Configuration
public class WebSecurityConfig implements WebMvcConfigurer {

    @Bean
    public ApiInterceptor apiInterceptor(){
        return new ApiInterceptor();
    }

    /**
     * 拦截器注册 设置拦截接口
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiInterceptor()).addPathPatterns("/", "/**")
                .excludePathPatterns("/", "/login", "/details", "/user/login", "/open/**", "/article/findArticle",
                        "/js/**", "/layui/**", "/css/**", "/fonts/**", "/images/**", "/audio/**");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }

}
