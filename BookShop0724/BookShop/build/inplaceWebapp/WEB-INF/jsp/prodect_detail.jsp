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
       <h2 class="fl">书籍添加</h2>
       <a class="fr top_rt_btn" href="product_list.html">返回书籍列表</a>
      </div>
     <section>
      <ul class="ulColumn2">
       <li>
        <span class="item_name" style="width:120px;">书籍名称：</span>
        <input type="text" class="textbox textbox_295" placeholder="书籍名称..."/>
       </li>
       <li>
        <span class="item_name" style="width:120px;">作者：</span>
        <input type="text" class="textbox" placeholder="作者..."/>
       </li>
        <li>
        <span class="item_name" style="width:120px;">出版社：</span>
        <input type="text" class="textbox" placeholder="出版社..."/>
       </li>
       <li>
        <span class="item_name" style="width:120px;">类别：</span>
        <select class="select">
         <option>1</option>
         <option>2</option>
         <option>3</option>
         <option>4</option>
        </select>
        <span>1：小说 &nbsp 2：文学 &nbsp 3：历史 &nbsp 4：科普</span>
       </li>
       <li>
        <span class="item_name" style="width:120px;">价格：</span>
        <input type="text" class="textbox" placeholder="价格..."/>
       </li>
       <li>
        <span class="item_name" style="width:120px;">上传排列图：</span>
        <label class="uploadImg">
         <input type="file"/>
         <span>上传图片</span>
        </label>
       </li>
        <li>
        <span class="item_name" style="width:120px;">上传详情图：</span>
        <label class="uploadImg">
         <input type="file"/>
         <span>上传图片</span>
        </label>
       </li>
        <span class="item_name" style="width:120px;"></span>
        <input type="submit" class="link_btn"/>
       </li>
      </ul>
     </section>
 </div>
</section>
<script src="js/ueditor.config.js"></script>
<script src="js/ueditor.all.min.js"> </script>
</body>
</html>
