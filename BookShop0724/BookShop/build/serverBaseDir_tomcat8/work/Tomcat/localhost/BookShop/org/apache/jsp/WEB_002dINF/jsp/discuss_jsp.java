/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-23 03:18:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class discuss_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1498223239581L));
    _jspx_dependants.put("jar:file:/C:/Users/GRSTAR/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>评论页面</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/star.css\" type=\"text/css\">\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<meta name=\"description\" content=\"Source code generated using layoutit.com\" />\r\n");
      out.write("<meta name=\"author\" content=\"LayoutIt!\">\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"owner\" content=\"\" />\r\n");
      out.write("<meta name=\"robots\" content=\"index, follow\" />\r\n");
      out.write("<meta name=\"googlebot\" content=\"index, follow\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"书山有路\" src=\"images/Logol2.jpg\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"home\">首页</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"novel\">小说</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"literature\">文学</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"history\">历史</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"science\">科普</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">其他<strong class=\"caret\"></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"background\">管理员后台</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"resigter\">注册</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"loginForm\">用户切换</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t <a href=\"#\" data-toggle=\"dropdown\" class=\"dropdown-toggle\">我的<strong class=\"caret\"></strong></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"cart?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">购物车</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"collect?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">我的收藏</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"order?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">我的订单</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"change\">修改密码</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t<address>\r\n");
      out.write("\t\t\t\t\t\t\t\t<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.identity }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong><br> 欢迎您的光临！<br> 您是今天在线的");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("位顾客之一\r\n");
      out.write("\t\t\t\t\t\t\t</address>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<div class=\"panel-group\" id=\"panel-970909\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t <a class=\"panel-title\" data-toggle=\"collapse\" data-parent=\"#panel-970909\" href=\"#panel-element-272487\">书海拾珠</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"panel-element-272487\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"home\">首页</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"novel\">小说</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"literature\">文学</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"history\">历史</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"science\">科普</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t <a class=\"panel-title\" data-toggle=\"collapse\" data-parent=\"#panel-970909\" href=\"#panel-element-389560\">我的</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"panel-element-389560\" class=\"panel-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"cart?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">购物车</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"collect?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">我的收藏</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"order?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">我的订单</a><br>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"change\">修改密码</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"panel-title\"  data-toggle=\"collapse\" data-parent=\"#panel-970909\" href=\"#panel-element-189130\">其他</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"panel-element-189130\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"resigter\">注册</a><br>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"background\">管理员后台</a><br>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"loginForm\">用户切换</a><br>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-9\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row clearfix\">\r\n");
      out.write("\t\t<div class=\"col-md-3 column\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-6 column\">\r\n");
      out.write("<form action=\"enddiscuss\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<font size=\"4\"><strong>订单编号：</strong></font><font size=\"4\" color=\"red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</font>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("<label for=\"inputfile\">星级评分</label>\r\n");
      out.write("\t<div class=\"shop-rating\">\r\n");
      out.write("\t\t<span class=\"title\">物流评分：</span>\r\n");
      out.write("\t\t\t<ul class=\"rating-level\" id=\"stars1\">\r\n");
      out.write("\t\t\t\t<li><a class=\"one-star\" star:value=\"1\" href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t<li><a class=\"two-stars\" star:value=\"2\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t<li><a class=\"three-stars\" star:value=\"3\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t<li><a class=\"four-stars\" star:value=\"4\" href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t<li><a class=\"five-stars\" star:value=\"5\" href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t<span class=\"result\" id=\"stars1-tips\"></span>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"stars1-input\" name=\"logistics\" value=\"\" size=\"2\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("\t# 星级评分\r\n");
      out.write("\t# star:value = 分数\r\n");
      out.write("-->\r\n");
      out.write("<div class=\"shop-rating\">\r\n");
      out.write("\t<span class=\"title\">质量评分：</span>\r\n");
      out.write("\t<ul class=\"rating-level\" id=\"stars2\">\r\n");
      out.write("\t\t<li><a class=\"one-star\" star:value=\"1\" href=\"#\">1</a></li>\r\n");
      out.write("\t\t<li><a class=\"two-stars\" star:value=\"2\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t<li><a class=\"three-stars\" star:value=\"3\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t<li><a class=\"four-stars\" star:value=\"4\" href=\"#\">4</a></li>\r\n");
      out.write("\t\t<li><a class=\"five-stars\" star:value=\"5\" href=\"#\">5</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<span class=\"result\" id=\"stars2-tips\"></span>\r\n");
      out.write("\t<input type=\"hidden\" id=\"stars2-input\" name=\"quality\" value=\"\" size=\"2\" />\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"shop-rating\">\r\n");
      out.write("\t<span class=\"title\">服务评分：</span>\r\n");
      out.write("\t<ul class=\"rating-level\" id=\"stars3\">\r\n");
      out.write("\t\t<li><a class=\"one-star\" star:value=\"1\" href=\"#\">1</a></li>\r\n");
      out.write("\t\t<li><a class=\"two-stars\" star:value=\"2\" href=\"#\">2</a></li>\r\n");
      out.write("\t\t<li><a class=\"three-stars\" star:value=\"3\" href=\"#\">3</a></li>\r\n");
      out.write("\t\t<li><a class=\"four-stars\" star:value=\"4\" href=\"#\">4</a></li>\r\n");
      out.write("\t\t<li><a class=\"five-stars\" star:value=\"5\" href=\"#\">5</a></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<span class=\"result\" id=\"stars3-tips\"></span>\r\n");
      out.write("\t<input type=\"hidden\" id=\"stars3-input\" name=\"serve\" value=\"\" size=\"2\" />\r\n");
      out.write("</div>\r\n");
      out.write("<!-- END 星级评分 -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("\t<label for=\"inputfile\">图片评论</label>\r\n");
      out.write("\t<input type=\"file\" id=\"inputfile\" name=\"file\">\r\n");
      out.write("</div>\r\n");
      out.write("\t<div class=\"form-group\">\r\n");
      out.write("\t\t<label for=\"name\">文字评论</label>\r\n");
      out.write("\t\t<textarea class=\"form-control\" rows=\"3\" name=\"word\"></textarea>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <input type=\"hidden\" id=\"orderID\" name=\"orderID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t <input type=\"hidden\" id=\"status\" name=\"status\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.status }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t<button type=\"submit\" class=\"btn btn-default\">提交</button>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-3 column\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<h5 class=\"text-center\">\r\n");
      out.write("\t\t\t\tJava EE 大作业应用\r\n");
      out.write("\t\t\t</h5>\r\n");
      out.write("\t\t\t<h5 class=\"text-center text-muted\">\r\n");
      out.write("\t\t\t\t电子商务15-2高垚攀（09153677）\r\n");
      out.write("\t\t\t</h5>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var Class = {\r\n");
      out.write("\tcreate: function() {\r\n");
      out.write("\t\treturn function() { this.initialize.apply(this, arguments); }\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("var Extend = function(destination, source) {\r\n");
      out.write("\tfor (var property in source) {\r\n");
      out.write("\t\tdestination[property] = source[property];\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("function stopDefault( e ) {\r\n");
      out.write("\t if ( e && e.preventDefault ){\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\twindow.event.returnValue = false;\r\n");
      out.write("\t}\r\n");
      out.write("\treturn false;\r\n");
      out.write("} \r\n");
      out.write("/**\r\n");
      out.write(" * 星星打分组件\r\n");
      out.write(" *\r\n");
      out.write(" * @author\tYunsd\r\n");
      out.write(" * @date\t\t2010-7-5\r\n");
      out.write(" */\r\n");
      out.write("var Stars = Class.create();\r\n");
      out.write("Stars.prototype = {\r\n");
      out.write("\tinitialize: function(star,options) {\r\n");
      out.write("\t\tthis.SetOptions(options); //默认属性\r\n");
      out.write("\t\tvar flag = 999; //定义全局指针\r\n");
      out.write("\t\tvar isIE = (document.all) ? true : false; //IE?\r\n");
      out.write("\t\tvar starlist = document.getElementById(star).getElementsByTagName('a'); //星星列表\r\n");
      out.write("\t\tvar input = document.getElementById(this.options.Input) || document.getElementById(star+\"-input\"); // 输出结果\r\n");
      out.write("\t\tvar tips = document.getElementById(this.options.Tips) || document.getElementById(star+\"-tips\"); // 打印提示\r\n");
      out.write("\t\tvar nowClass = \" \" + this.options.nowClass; // 定义选中星星样式名\r\n");
      out.write("\t\tvar tipsTxt = this.options.tipsTxt; // 定义提示文案\r\n");
      out.write("\t\tvar len = starlist.length; //星星数量\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\tfor(i=0;i<len;i++){ // 绑定事件 点击 鼠标滑过\r\n");
      out.write("\t\t\tstarlist[i].value = i;\r\n");
      out.write("\t\t\tstarlist[i].onclick = function(e){\r\n");
      out.write("\t\t\t\tstopDefault(e);\r\n");
      out.write("\t\t\t\tthis.className = this.className + nowClass;\r\n");
      out.write("\t\t\t\tflag = this.value;\r\n");
      out.write("\t\t\t\tinput.value = this.getAttribute(\"star:value\");\r\n");
      out.write("\t\t\t\ttips.innerHTML = tipsTxt[this.value]\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tstarlist[i].onmouseover = function(){\r\n");
      out.write("\t\t\t\tif (flag< 999){\r\n");
      out.write("\t\t\t\t\tvar reg = RegExp(nowClass,\"g\");\r\n");
      out.write("\t\t\t\t\tstarlist[flag].className = starlist[flag].className.replace(reg,\"\")\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tstarlist[i].onmouseout = function(){\r\n");
      out.write("\t\t\t\tif (flag< 999){\r\n");
      out.write("\t\t\t\t\tstarlist[flag].className = starlist[flag].className + nowClass;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tif (isIE){ //FIX IE下样式错误\r\n");
      out.write("\t\t\tvar li = document.getElementById(star).getElementsByTagName('li');\r\n");
      out.write("\t\t\tfor (var i = 0, len = li.length; i < len; i++) {\r\n");
      out.write("\t\t\t\tvar c = li[i];\r\n");
      out.write("\t\t\t\tif (c) {\r\n");
      out.write("\t\t\t\t\tc.className = c.getElementsByTagName('a')[0].className;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t},\r\n");
      out.write("\t//设置默认属性\r\n");
      out.write("\tSetOptions: function(options) {\r\n");
      out.write("\t\tthis.options = {//默认值\r\n");
      out.write("\t\t\tInput:\t\t\t\"\",//设置触保存分数的INPUT\r\n");
      out.write("\t\t\tTips:\t\t\t\"\",//设置提示文案容器\r\n");
      out.write("\t\t\tnowClass:\t\"current-rating\",//选中的样式名\r\n");
      out.write("\t\t\ttipsTxt:\t\t[\"1分-严重不合格\",\"2分-不合格\",\"3分-合格\",\"4分-优秀\",\"5分-完美\"]//提示文案\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tExtend(this.options, options || {});\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var Stars1 = new Stars(\"stars1\")\r\n");
      out.write("var Stars2 = new Stars(\"stars2\")\r\n");
      out.write("var Stars3 = new Stars(\"stars3\")\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent(null);
    // /WEB-INF/jsp/discuss.jsp(96,126) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${applicationScope.number }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}
