package org.koreait.fiters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWrapper extends HttpServletRequestWrapper {
//    @Override
//    public String getParameter(String name) {
//        String value  = super.getParameter(name);
//        if (value!=null&&value.isBlank()){
//          value=  String.format("**%s**", value);
//        }
//        return value;
//    }

    public CommonRequestWrapper(ServletRequest request) {
        super((HttpServletRequest) request);
        //요청시 공코드
        System.out.println("요청 공통 코드 처리....");

    }
}
