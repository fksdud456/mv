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
				$('#user_register').attr({
					'method' : 'post',
					'action' : 'useraddimpl.do'
				});
				$('#user_register').submit();
			};
		});
	});
</script>

<div id = "main_center">
<h1>User Add Page</h1>

<form id = "user_register">
ID<input type ="text" name = "id" id = "id"><br>
PWD<input type ="text" name = "pwd" id = "pwd"><br>
NAME<input type ="text" name = "name" id = "name"><br>
<input type ="button" value="REGISTER" id="r_bt">
</form>

</div>