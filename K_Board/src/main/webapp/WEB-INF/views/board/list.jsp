<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous"></script>
</head>
<body>
<h1>목록 페이지입니다.</h1>
<a href="/board/enroll">게시판 등록</a>
<script type="text/javascript">
	$(document).ready(function () {
		let result = "${result}";
		
		checkAlert(result);
		
		function checkAlert (result) {
			if(result === '') {
				return;
			}
			if(result === "enroll success") {
				alert("등록이 완료되었습니다.");
			}
		}
	});
</script>
</body>
</html>