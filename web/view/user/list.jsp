<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--
	main.jsp 의 section 안에 include 하는 파일
 -->
<style>
#main_center {
	margin : 0px 20px;
	width: 760px;
	height: 480px;
	background: white;
}
</style>
<div id = "main_center">
<h1>User List Page</h1>

<table>
<thead>
	<tr><th>ID</th><th>PWD</th><th>NAME</th></tr>
</thead>

<tbody>
<c:forEach var ="user" items="${userlist }">
<tr>
	<td>${user.id }</td>
	<td>${user.pwd}</td>
	<td> ${user.name }</td>
</tr>
</c:forEach>
</tbody>
</table>

</div>