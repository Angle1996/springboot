package com.satan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @Description
 * @Author Satan
 * @Date 2020/2/2521:59
 * @Version 1.0
 */
@Configuration
public class MyLocaleResolver implements LocaleResolver {
	//解析请求
	@Override
	public Locale resolveLocale(HttpServletRequest request) {
		//获取请求中的语言参数
		String language = request.getParameter("l");
		Locale locale = Locale.getDefault();//如果没有就使用默认的
		//如果请求携带了国际化的参数
		if (!StringUtils.isEmpty(language)){
			String[] s = language.split("_");
			locale=new Locale(s[0],s[1]);
		}

		return locale;
	}

	@Override
	public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

	}


}
