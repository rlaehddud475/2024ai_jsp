<%@ page contentType='text/html; charset=UTF-8'%>
<%@ taglib prefix="c" url="jakarta.tags.core"%>
<c:forEach var="item" items="${items}">
<table board='1'>
<thead>
<tr>
<th>번호</th><th>제목</th><th>내용</th><th>작성자</th>
</tr>
</thead>
<tbody>
<td>${item.Seq()}</td>
<td>${item.Subject()}</td>
<td>${item.Content()}</td>
<td>${item.Poster()}</td>
<% --
<tr>
<td>${item.getSeq()}</td>
<td>${item.getSubject()}</td>
<td>${item.getContent()}</td>
<td>${item.getPoster()}</td>
</tr>
-- %>
</c:forEach>
</tbody>
</table>
%{pageContext.getRequest().getRequestURI()}