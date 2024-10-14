package com.nt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class ApplicationFilter  implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest) request;
		
		String uri = req.getRequestURI();
		
		if(uri.contains("login") || uri.contains("register") || uri.contains("Library_SpringMVC")) {
			chain.doFilter(request, response);
		}else {
			HttpSession session = req.getSession();
			String userId = (String) session.getAttribute("userId");
			
			
			if(userId != null) {
				chain.doFilter(request, response);
			}
		}
	}

	@Override
	public void destroy() {
		
		
	}

}
