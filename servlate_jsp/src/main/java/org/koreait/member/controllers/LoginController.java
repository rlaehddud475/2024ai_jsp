package org.koreait.member.controllers;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {

    @Override
    public void destroy() {
        System.out.println("서블릿 객체가 소멸되기 직전에 1번만 실행"); //공통 자원해제, 로그 기록
    }

    @Override
    public void init(ServletConfig config) throws ServletException{
        //ServletConfig의 주요 메서드 : 설정값 조회 메서드
        //String getInitParameter(String name);
    String key1=config.getInitParameter("key1");
    String key2=config.getInitParameter("key2");
        System.out.printf("key1=%s%n",key1);
        System.out.printf("key2=%s%n",key2);
    }
/*    public void init() throws ServletException {
        System.out.println("서블릿 객체가 생성되면 최초 1번 실행");//설정 값을 조회할때 최초 1번만 조회후 서블릿 객체 내에서 유지..., 최초 유입 로그...
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet()");
    /*    resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");*/
        resp.setContentType("text/html;charset=UTF-8");
//        System.out.println("로그인 페이지!!");
        PrintWriter out = resp.getWriter();
        out.write("<h1>로그인</h1>");
    }
}