package com.example.demo.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 *
 * 호출 시점
 * Filter는 DispatcherServlet이 실행되기 전
 * Interceptor는 DispatcherServlet이 실행된 후
 */
@Slf4j
public class CommonInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("CommonInterceptor : {}", request.getRequestURI());
        System.out.println("CommonInterceptor : " + request.getRequestURI());
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
