<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

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
<script>
	$(document).ready(function() {
		$('#r_bt').click(function() {
			var c = confirm('등록 하시겠습니까?');
			if (c == true) {
				$('#add_product').attr({
					'method' : 'post',
					'action' : 'productaddimpl.do',
					'enctype' : 'multipart/form-data'
				});
				$('#add_product').submit();
			};
		});
	});
</script>
<div id = "main_center">
<h1>Product Add Page</h1>

<form id="add_product">
ID<input type="number" name="id"><br>
NAME<input type="text" name="name"><br>
PRICE<input type="number" name="price"><br>
IMG<input type="file" name="mf"><br>
<input type="button" value = "REGISTER" id="r_bt"><br>
</form> 
</div>