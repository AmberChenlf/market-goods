package com.qianfeng.market.config.web;

import com.qianfeng.market.consts.GoodsConsts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author bingqiong.cbb
 * @date 2020-04-27 00:39
 **/
@SpringBootConfiguration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 配置跨域请求
     * @param registry
     */
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET","HEAD","PUT","DELETE","POST").allowCredentials(false).maxAge(3600);
    }

    public void addResourceHandlers(ResourceHandlerRegistry register){
        Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);
        String docPath = GoodsConsts.getConfigUploadPath();
        logger.info("图片上传路径为："+ docPath);
        register.addResourceHandler("/upload/**").addResourceLocations(docPath);
    }
}
