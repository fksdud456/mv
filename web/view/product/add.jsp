<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!--
	main.jsp �� section �ȿ� include �ϴ� ����
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
			var c = confirm('��� �Ͻðڽ��ϱ�?');
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