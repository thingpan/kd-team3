<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="GET" action="/param">
		<input type="text" name="name"> <input type="text" name="age">
		<input type="text" name="address"> <input type="text"
			name="birth">
		<button>GET</button>
		<form method="POST" action="/param">
			<input type="text" name="name"> <input type="text" name="age">
			<input type="text" name="address"> <input type="text"
				name="birth">
			<button>POST</button>


		</form>
</body>
</html>