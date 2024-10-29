package org.koreait.fiters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter3 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
   String key1=filterConfig.getInitParameter("key1");
        String key2=filterConfig.getInitParameter("key2");
        //최초 객체 생성시에 호출 => 단 1번 호출
        System.out.printf("key1=%s%n",key1);
        System.out.printf("key2=%s%n",key2);
    }



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("MyFilter3 - 요청 전");
        chain.doFilter(request, response);
        System.out.println("MyFilter3 - 응답 후");
    }
    @Override
    public void destroy() {

        System.out.println("MyFilter3 - destroy()");
    }
}
