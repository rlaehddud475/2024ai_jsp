package org.koreait.fiters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter2 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter2 - 요청 전");
        chain.doFilter(request, response);
        System.out.println("MyFilter2 - 응답 후");
    }
}
