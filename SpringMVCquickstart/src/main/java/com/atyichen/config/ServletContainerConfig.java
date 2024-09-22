package com.atyichen.config;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainerConfig extends AbstractDispatcherServletInitializer {
    // 加载SpringMVC容器配置
    protected WebApplicationContext createServletApplicationContext() {
        ApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        // 类型转换只是在编译时改变编译器对对象的理解，并不会影响实际的对象实例或其在内存中的位置。
        ((AnnotationConfigWebApplicationContext)applicationContext).register(SpringMVCConfig.class);
        return (AnnotationConfigWebApplicationContext)applicationContext;
    }
    // 设置哪些请求归属SpringMVC处理
    protected String[] getServletMappings() {
        return new String[]{"/"}; // 所有请求归springMVC处理
    }
    // 加载Spring容器配置
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
