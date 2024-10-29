package org.koreait.fiters;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
        System.out.println("MyFilter1 - 요청 전");//요청 처리 전
        //다음필터가 있으면 다음필터로 호출
        //다음필터가 없으면 서블릿쪽정의된 요청메서드 호출
        chain.doFilter(request, response);
        System.out.println("MyFilter1 - 응답 후");
    }
}
