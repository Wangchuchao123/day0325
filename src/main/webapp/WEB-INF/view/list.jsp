<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/bootstrap.css" rel="stylesheet">
<script type="text/javascript" src="/resources/jquery-3.2.1.js"></script>
</head>
<body>
	<table class="table">
		<tr>
			<td colspan="22">
				<button class="btn btn-success" onclick="sel()">查询影片</button>
				<button class="btn btn-success">添加影片</button>
				<button class="btn btn-success" onclick="delsome()">删除影片</button>
			</td>
		</tr>
		<tr>
			<td>
				<input type="checkbox" onclick="selAll()">
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="m">
			<tr>
				<td><input type="checkbox" name="ids" value="${m.id }"></td>
				<td>${m.id }</td>
				<td>${m.name }</td>
				<td>${m.guideName }</td>
				<td>${m.price }</td>
				<td><fmt:formatDate value="${m.date }" pattern="yyyy-MM-dd"/></td>
				<td>${m.longtime }</td>
				<td>${m.year.yname }</td>
				<td>${m.area }</td>
				<td id="sss">${m.state }</td>
				<td>
					<button class="btn btn-success">详情</button>
					<button class="btn btn-success">编辑</button>
					<button class="btn btn-success" id="aa" onclick="xia()" >下架</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="20">
				现在是第${page.pageNum }/${page.pages }页,共${page.total }条数据
				<input type="button" value="首页" onclick="goPage(1)">
				<input type="button" value="上一页" onclick="goPage(${page.prePage})">
				<input type="button" value="下一页" onclick="goPage(${page.nextPage})">
				<input type="button" value="尾页" onclick="goPage(${page.pages})">
			</td>
		</tr>
	</table>
	
	<script type="text/javascript">
		function goPage(pageNum) {
			location="list?pageNum="+pageNum;
		}
		function selAll() {
			$("[name='ids']").each(function() {
				this.checked=!this.checked;
			})
		}
		
		function delsome() {
			var ids="";
			$("[name='ids']:checked").each(function() {
				ids+=","+this.value;
			})
			ids=ids.substring(1);
			$.post(
					"delsome",
					{ids:ids},
					function (obj) {
						if(obj){
							alert("删除成功");
							location="list";
						}else{
							alert("删除失败");
						}
					},
					"json"
				)
		}
		function sel() {
			location="sel";
		}
		function xia(id) {
			$("#sss").empty();
			$("#sss").append("已下架");
			$("#aa").empty();
			$("#aa").append("上架");
		}
	</script>
</body>
</html>