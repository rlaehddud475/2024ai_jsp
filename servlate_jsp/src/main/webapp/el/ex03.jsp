<%@ page contentType='text/html; charset=UTF-8'%>
<form method="POST" action="ex03_ps.jsp">
<dl>
<dt>이메일</dt>
<dd>
<input type="text" name="email">
</dd>
</dl>
<dl>
<dt>비밀번호</dt>
<dd>
<input type="password" name="password">
</dd>
</dl>
<dl>
<dt>비밀번호 확인</dt>
<dd>
<input type="password" name="confirmPassword">
</dd>
</dl>
<dl>
<dt>회원명</dt>
<dd>
<input type="text" name="userName">
</dd>
</dl>
<dt>취미</dt>
<dd>
<lable><input type="checkbox" name="hobby" value="취미1">취미1</lable>
<lable><input type="checkbox" name="hobby" value="취미2">취미2</lable>
<lable><input type="checkbox" name="hobby" value="취미3">취미3</lable>
<lable><input type="checkbox" name="hobby" value="취미4">취미4</lable>
<lable><input type="checkbox" name="hobby" value="취미5">취미5</lable>
</dd>
</dl>
<button type="submit">가입하기</button>
</form>