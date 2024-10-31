<%@ page contentType='text/html; charset=UTF-8'%>
<%
Cookie cookie=new Cookie("key4","value4");

cookie.setMaxAge(0);
response.addCookie(cookie);
%>