package com.skillenza.socgen.system.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = { "com.skillenza.socgen.*" })
@PropertySource({ "classpath:error_message.properties", "file:common.properties" })
public class ApplicationConfig {
}