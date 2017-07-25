<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"/>
<title>“书山有路”网上书店后台管理系统</title>
<meta name="author" content="DeathGhost" />
<link rel="stylesheet" type="text/css" href="css/bgstyle.css">
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
  <li><a href="home" target="_blank" class="website_icon">站点首页</a></li>
  <li><a href="#" class="admin_icon">${sessionScope.user_session.username }</a></li>
  <li><a href="background" class="quit_icon">安全退出</a></li>
 </ul>
</header>
<!--aside nav-->
<!--aside nav-->
<aside class="lt_aside_nav content mCustomScrollbar">
 <h2><a href="index.html">起始页</a></h2>
 <ul>
  <li>
   <dl>
    <dt>书籍管理</dt>
    <!--当前链接则添加class:active-->
    <dd><a href="product_list.html" class="active">书籍列表</a></dd>
    <dd><a href="product_detail.html">书籍添加</a></dd>
    <dd><a href="product_change.html">书籍修改</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>订单管理</dt>
    <dd><a href="order_list.html">订单列表</a></dd>
    <dd><a href="order_detail.html">订单详情</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>用户管理</dt>
    <dd><a href="user_list.html">用户列表</a></dd>
    <dd><a href="user_detail.html">权限修改</a></dd>
    <dd><a href="user_rank.html">权限说明</a></dd>
   </dl>
  </li>
  <li>
   <dl>
    <dt>配送与支付合作公司</dt>
    <dd><a href="express_list.html">配送方式</a></dd>
    <dd><a href="pay_list.html">支付方式</a></dd>
   </dl>
  </li>
 </ul>
</aside>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <div class="page_title">
       <h2 class="fl">商品列表</h2>
       <a href="product_detail.html" class="fr top_rt_btn add_icon">添加商品</a>
      </div>
      <section class="mtb">
       <select class="select" >
        <option>类别</option>
        <option>小说</option>
        <option>文学</option>
        <option>历史</option>
        <option>科普</option>
       </select>
      </section>
      <table class="table">
       <tr>
        <th>书号</th>
        <th>缩略图</th>
        <th>书籍名称</th>
        <th>作者</th>
        <th>出版社</th>
        <th>类别编号<br>（1小说 2文学 <br>3历史 4科普）</th>
        <th>价格</th>
        <th>操作</th>
       </tr>
       <tr>
        <td class="center">bookID</td>
        <td>picture_s</td>
        <td class="center">bookname</td>
        <td class="center">author</td>
        <td class="center">publish</td>
        <td class="center">sortID</td>
        <td class="center">price</td>
        <td class="center">
         <a href="product_detail.html" title="编辑" class="link_icon">&#101;</a>
         <a href="#" title="删除" class="link_icon">&#100;</a>
        </td>
       </tr>
      </table>
 </div>
</section>
</body>
</html>
