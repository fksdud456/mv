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
<h1>Product List Page</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
				<th>DATE</th>
				<th>IMAGE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${productlist }">
				<tr>
					<td>${product.id }</td>
					<td>${product.name }</td>
					<td>${product.price }</td>
					<td>${product.regdate }</td>
					<td><img src = "img/${product.imgname }"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</div>