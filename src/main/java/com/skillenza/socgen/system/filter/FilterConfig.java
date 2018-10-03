package com.skillenza.socgen.system.filter;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {
	@Bean
	public FilterRegistrationBean registerCORSFilterBean() {
		FilterRegistrationBean corsBean = new FilterRegistrationBean();
		corsBean.setFilter(registerCORSFilter());
		corsBean.setOrder(0);
		return corsBean;
	}


	@Bean
	public Filter registerCORSFilter() {
		return new CORSFilter();
	}


}