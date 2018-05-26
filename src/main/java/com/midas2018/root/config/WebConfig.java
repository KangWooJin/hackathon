package com.midas2018.root.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.midas2018.root.support.interceptor.HttpReqFilterInterceptor;
import com.midas2018.root.support.interceptor.HttpReqLoggingInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private HttpReqLoggingInterceptor httpReqLoggingInterceptor;
    @Autowired
    private HttpReqFilterInterceptor httpReqFilterInterceptor;

    /* Interceptor */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(httpReqLoggingInterceptor);
        registry.addInterceptor(httpReqFilterInterceptor)
                .addPathPatterns("/api/admin/**")
                .excludePathPatterns("/api/admin/signup")
                .excludePathPatterns("/api/admin/signin");
    }
}
