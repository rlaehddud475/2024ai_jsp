<%@ page contentType='text/html; charset=UTF-8'%>
<%
pageContext.setAttribute("num1",100);
pageContext.setAttribute("num2",200);
request.setAttribute("num1", 200);
application.setAttribute("num1", 300);
%>
${num1}<br>
pageScope.num1:${pageScope.num1}<br>
requestScope.num1:${requestScope.num1}<br>
applicationScope.num1:${applicationScope.num1}<br>
<%-- ${num1+num2}
--%>