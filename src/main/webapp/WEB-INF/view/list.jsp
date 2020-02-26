<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link  href="/resource/index3.css" rel="stylesheet">
<script type="text/javascript"	src="/resource/jquery-1.8.3.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<script type="text/javascript">
	function fenye(pageNum){
		$("[name=pageNum]").val(pageNum);
		$("form").submit();
		
	}
	
	//全选，全不选
	$(function(){
		 $("[name=all]").change(function(){			
			if($(this).is(":checked")){
				$("[name=check]").prop("checked",true);
			}else{
				$("[name=check]").prop("checked",false);
			}
		}) 
	

	})
	
	
	
	
	//反选
	function fan(){
		//遍历所有name属性为check  each循环
		$("[name=check]").each(function(){
			//prop常用于属性值为true和false  其他用attr
			$(this).prop("checked",!$(this).prop("checked"));
		})
	}
	
	//批删
	function deletep(){
		var ids=$("[name=check]:checked").map(function(){
			return this.value;
		}).get().join();
		alert(ids)
		$.post("deletep",{ids:ids},function(result){
			if(result){
				alert("删除成功")
				location="list";
			}else{
				alert("删除失败")
			}
		});
	}
	
	
</script>
</head>
<body>

	<form	action="list"	method="post">
			<input	type="text"	name="pageNum">
		影片名称:<input	type="text"	name="name"	value="${vo.name }">&nbsp;上映时间:<input	type="text"	name="t1"	value="${vo.t1 }">-<input	type="text"	name="t2"	value="${vo.t2 }"><br>
		价格:<input	type="text"	name="p1"	value="${vo.p1 }">-<input	type="text"	name="p2"	value="${vo.p2 }"><br>
		电影时长:<input	type="text"	name="l1"	value="${vo.l1 }">-<input	type="text"	name="l2"	value="${vo.l2 }"><br>
			<button>查询</button>
			
	</form>
	
	<table>
		<tr>
			<td><input	type="checkbox"		name="all"	onclick="alll(this)"></td>
			<td>序号</td>
			<td>电影名称</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映日期</td>
			<td>电影时长</td>
			<td>年代</td>
			<td>类型</td>
			<td>区域</td>
			<td>状态</td>

		</tr>
		<c:forEach items="${list }" var="movie" varStatus="count">

			<tr>
				
				<td>
					<input	type="checkbox"	name="check"	value="${movie.id }">
				</td>
				<td>${count.count }</td>
				<td>${movie.name }</td>
				<td>${movie.actor }</td>
				<td>${movie.price }</td>
				<td>${movie.uptime }</td>
				<td>${movie.longtime }</td>
				<td>${movie.years }</td>
				<td>${movie.area }</td>
				<td>${movie.status==1?'即将上映':movie.status==2?'正在热映':'已经下架' }</td>
			</tr>


		</c:forEach>
		
		<tr>	
			<td>
				<button onclick="fan()">反选</button>
			</td>
				
					
				
			<td	colspan="10">
				<button	onclick="fenye(1)">首页</button>
				<button	onclick="fenye(${page.prePage==0?1:page.prePage})">上一页</button>
				<button	onclick="fenye(${page.nextPage==0?page.pages:page.nextPage })">下一页</button>
				<button	onclick="fenye(${page.pages})">尾页</button>
				&nbsp;&nbsp;
				当前${page.pageNum }/${page.pages },总共${page.total }条
				<button	onclick="deletep()">删除</button>
			</td>
		</tr>

	</table>

</body>
</html>