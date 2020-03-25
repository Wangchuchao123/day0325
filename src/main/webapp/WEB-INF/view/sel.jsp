<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="resources/jquery-3.2.1.js"></script>
</head>
<body>
	<form action="list">
		影片名称：<input type="text" name="name"><br>
		导演：<input type="text" name="guideName"><br>
		电影年代：<select name="year"></select><br>
		上映时间：<input type="date" name="startTime">-
				  <input type="date" name="endTime">
		<br>
		价格：<input type="text" name="price1">
			  <input type="text" name="price2">
				
				<br>
		电影时长：<input type="text" name="longTime1">
				<input type="text" name="longTime2">
		<br>
		<input type="submit" value="查询">
	</form>
	<script type="text/javascript">
		$.post(
			"selyear",
			{},
			function (obj) {
				for ( var i in obj) {
					$("[name='year']").append("<option value='"+obj[i].yid+"'>"+obj[i].yname+"</option>")
				}
			},
			"json"
		)
	</script>
</body>
</html>