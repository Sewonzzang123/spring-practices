<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String no = request.getParameter("no");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/delete/${no }">
		<input type='hidden' name="no" value="${no }">
		<!-- 번호 들어가야 하는 자리 hidden -->
		<table>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
		<br> <a href="${pageContext.request.contextPath }">메인으로 돌아가기</a>
	</form>
</body>
</html>