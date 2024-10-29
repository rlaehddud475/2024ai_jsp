package org.koreait.member.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinController extends HttpServlet {
   /* @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String key1 = req.getParameter("key1");
        String key2 = req.getParameter("key2");
        System.out.printf("key1=%s%n",key1);
        System.out.printf("key2=%s%n",key2);
    }*/

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("<form method='POST' action='join'>");
        out.write("이메일:<input type='text' name='email'><br>");
        out.write("비밀번호:<input type='password' name='password'><br>");
        out.write("비밀번호 확인:<input type='password' name='confirmPassword'><br>");
        out.write("회원 명:<input type='text' name='userName'><br>");
        out.write("취미:<lable><input type='checkbox' name='hobby' value='취미1'>취미1</lable>");
        out.write("<lable><input type='checkbox' name='hobby' value='취미2'>취미2</lable>");
        out.write("<lable><input type='checkbox' name='hobby' value='취미3'>취미3</lable>");        out.write("<lable><input type='checkbox' name='hobby' value='취미4'>취미4</lable>");        out.write("<lable><input type='checkbox' name='hobby' value='취미5'>취미5</lable><br>");
        out.write("<button type='submit'>가입하기</button>");
        out.write("</form>");
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//서블릿 4버전까지는 필수! 기본 인코딩이 IS08859_1-2바이트 유니코드, 6버전은 기본 인코딩 UTF-8 ,생략가능
    String email=req.getParameter("email");
        String password=req.getParameter("password");
        String confirmPassword=req.getParameter("confirmPassword");
        String userName=req.getParameter("userName");
        String hobby=req.getParameter("hobby");//여러개의 값이있더라도 하나만 출력한다.
        System.out.printf("email=%s, password=%s, confirmPassword=%s,userName=%s, hobby=%s%n",email,password,confirmPassword,userName,hobby);

        String[] hobbys=req.getParameterValues("hobby");
        System.out.println(Arrays.toString(hobbys));
    }
}
