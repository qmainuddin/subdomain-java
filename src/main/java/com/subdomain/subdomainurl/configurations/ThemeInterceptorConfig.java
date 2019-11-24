package com.subdomain.subdomainurl.configurations;

import com.subdomain.subdomainurl.interceptors.AppThemeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ThemeInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    AppThemeInterceptor appThemeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(appThemeInterceptor);
    }
}
