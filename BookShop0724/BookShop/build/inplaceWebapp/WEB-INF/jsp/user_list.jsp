<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/bgstyle.css">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
<script src="js/html5.js"></script>
<![endif]-->
<script src="js/jquery.js"></script>
<script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
<script>

	(function($){
		$(window).load(function(){
			
			$("a[rel='load-content']").click(function(e){
				e.preventDefault();
				var url=$(this).attr("href");
				$.get(url,function(data){
					$(".content .mCSB_container").append(data); //load new content inside .mCSB_container
					//scroll-to appended content 
					$(".content").mCustomScrollbar("scrollTo","h2:last");
				});
			});
			
			$(".content").delegate("a[href='top']","click",function(e){
				e.preventDefault();
				$(".content").mCustomScrollbar("scrollTo",$(this).attr("href"));
			});
			
		});
	})(jQuery);
</script>
</head>
<body>
<!--header-->
<header>
 <h1><img src="images/Logol2.jpg"/></h1>
 <ul class="rt_nav">
  <li><a href="home" target="_blank" class="website_icon">首页</a></li>
  <li><a href="#" class="admin_icon">${sessionScope.user_session.username }</a></li>
  <li><a href="background" class="quit_icon">退出</a></li>
 </ul>
</header>
<!--aside nav-->
<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="index">起始页</a></h2>
 <div class="panel-group" id="panel-614695">
 <div class="panel panel-default">
	<div class="panel-heading">
		<a class="panel-title"  data-toggle="collapse" data-parent="#panel-970909" href="#panel-element-272487" ><strong>书籍管理</strong></a>
	</div>
	<div id="panel-element-272487" class="panel-collapse collapse in">
		<div class="panel-body">
			<dd><a href="allBook" >书籍列表</a></dd>
    		<dd><a href="product_detail">书籍添加</a></dd>
    		<dd><a href="product_change">书籍修改</a></dd>
		</div>
	</div>
</div>
<div class="panel panel-default">
	<div class="panel-heading">
		<a class="panel-title"  data-toggle="collapse" data-parent="#panel-970909" href="#panel-element-389560"><strong>订单管理</strong></a>
	</div>
	<div id="panel-element-389560" class="panel-collapse collapse in">
		<div class="panel-body">
			<dd><a href="allOrder">订单列表</a></dd>
    		<dd><a href="order_detail">订单详情</a></dd>
    		<dd><a href="allDiscuss">订单评论</a></dd>
		</div>
	</div>
</div>
<div class="panel panel-default">
	<div class="panel-heading">
		<a class="panel-title"  data-toggle="collapse" data-parent="#panel-970909" href="#panel-element-189130"><strong>用户管理</strong></a>
	</div>
	<div id="panel-element-189130" class="panel-collapse collapse in">
		<div class="panel-body">
			<dd><a href="allUser">用户列表</a></dd>
    		<dd><a href="user_detail">权限修改</a></dd>
    		<dd><a href="user_rank">权限说明</a></dd>
		</div>
	</div>
</div>
</div>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <div class="page_title">
       <h2 class="fl">用户列表</h2>
      </div>
      <section class="mtb">
       <a href="allUser">所有</a>
       <a href="allAdmin">管理员</a>
       <a href="allOrdinary">用户</a>
      </section>
      <table class="table">
       <tr>
        <th>用户编号</th>
        <th>登录名</th>
        <th>用户名</th>
        <th>权限</th>
        <th>电子邮件</th>
        <th>手机号码</th>
        <th>地址</th>
        <th>操作</th>
       </tr>
       <c:forEach items="${requestScope.user_list }" var="user">
       <tr>
        <td class="center">${user.userID }</td>
        <td>${user.loginname }</td>
        <td class="center">${user.username }</td>
        <td class="center">${user.identity }</td>
        <td class="center">${user.email }</td>
        <td class="center">${user.phonenumber }</td>
        <td class="center">${user.address }</td>
        <td class="center">
         <a href="UserRankChange?userID= ${user.userID }" title="修改权限" class="link_icon">&#101;</a>
        </td>
       </tr>
       </c:forEach>
      </table>
 </div>
</section>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>