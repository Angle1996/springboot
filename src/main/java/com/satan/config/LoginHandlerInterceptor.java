package com.satan.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * @Author Satan
 * @Date 2020/2/2523:50
 * @Version 1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		Object user=request.getSession().getAttribute("loginUser");
		if(user==null){
			request.setAttribute("msg","没有权限请先登陆");
			request.getRequestDispatcher("/index.html").forward(request,response);
			return false;
		}else {
			return true;
		}

	}


}
