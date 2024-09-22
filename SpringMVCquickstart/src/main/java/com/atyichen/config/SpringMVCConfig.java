package com.atyichen.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// 创建配置文件 指定包扫描路径
@Configuration
@ComponentScan("com.atyichen.controller")
public class SpringMVCConfig {
}
