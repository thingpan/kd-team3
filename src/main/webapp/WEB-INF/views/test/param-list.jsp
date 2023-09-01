<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">

		<tr>
			<th>번호</th>
			<th>이름</th>
		<tbody id="tBody"></tbody>


	</table>
	<button onclick="location.href='/views/test/param-ajax'">등록 </button>
	<script>
	window.addEventListener('load',function(){
		const xhr =new XMLHttpRequest();
		xhr.open('GET','/params');
		xhr.onreadystatechange=function(){
			if(xhr.readyState===200){
				if(xhr.status===4){
				const xhr =JSON.parse(xhr.responseText)
				let html=''
				for(list of xhr){
					html+='<tr>'
					html+='<td>'+list.num+'</td>'
					html+='<td>'+list.name+'</td>'
					html+='</tr>'
					
				}
				document.queryselector('#tbody').innerHTML=html;
				}
			}
		}
		xhr.send();
		alert('load');
	})
</script>
</body>
</html>