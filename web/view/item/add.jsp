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
$(document).ready(function(){
	$('#r_bt').click(function() {
		var c = confirm("����Ͻðڽ��ϱ�?");
		if(c== true) {
			$('#item_register').attr({
				'method' : 'post',
				'action' : 'itemaddimpl.do'
			});
			$('#item_register').submit();
		};
	});
	
});
</script>
<div id = "main_center">
<h1>Item Add Page</h1>
	<form id="item_register">
		<input type="number" id="id" name="id"> 
		<input type="text" id="name" name="name">
		<input type="number" id="price" name="price">
		<input type="button" value="REGISTER" id="r_bt">
	</form>
</div>