/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-24 04:42:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1473041377056L));
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
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\"/>\r\n");
      out.write("<title>“书山有路”网上书店后台管理系统</title>\r\n");
      out.write("<meta name=\"author\" content=\"DeathGhost\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bgstyle.css\">\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"js/html5.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script src=\"js/jquery.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.mCustomScrollbar.concat.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t(function($){\r\n");
      out.write("\t\t$(window).load(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\"a[rel='load-content']\").click(function(e){\r\n");
      out.write("\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\tvar url=$(this).attr(\"href\");\r\n");
      out.write("\t\t\t\t$.get(url,function(data){\r\n");
      out.write("\t\t\t\t\t$(\".content .mCSB_container\").append(data); //load new content inside .mCSB_container\r\n");
      out.write("\t\t\t\t\t//scroll-to appended content \r\n");
      out.write("\t\t\t\t\t$(\".content\").mCustomScrollbar(\"scrollTo\",\"h2:last\");\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$(\".content\").delegate(\"a[href='top']\",\"click\",function(e){\r\n");
      out.write("\t\t\t\te.preventDefault();\r\n");
      out.write("\t\t\t\t$(\".content\").mCustomScrollbar(\"scrollTo\",$(this).attr(\"href\"));\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})(jQuery);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--header-->\r\n");
      out.write("<header>\r\n");
      out.write(" <h1><img src=\"images/Logol2.jpg\"/></h1>\r\n");
      out.write(" <ul class=\"rt_nav\">\r\n");
      out.write("  <li><a href=\"home\" target=\"_blank\" class=\"website_icon\">站点首页</a></li>\r\n");
      out.write("  <li><a href=\"#\" class=\"admin_icon\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_session.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a></li>\r\n");
      out.write("  <li><a href=\"background\" class=\"quit_icon\">安全退出</a></li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</header>\r\n");
      out.write("<!--aside nav-->\r\n");
      out.write("<!--aside nav-->\r\n");
      out.write("<aside class=\"lt_aside_nav content mCustomScrollbar\">\r\n");
      out.write(" <h2><a href=\"index\">起始页</a></h2>\r\n");
      out.write(" <div class=\"panel-group\" id=\"panel-614695\">\r\n");
      out.write(" <div class=\"panel panel-default\">\r\n");
      out.write("\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t<a class=\"panel-title\"  data-toggle=\"collapse\" data-parent=\"#panel-970909\" href=\"#panel-element-272487\" ><strong>书籍管理</strong></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"panel-element-272487\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t<dd><a href=\"allBook\" >书籍列表</a></dd>\r\n");
      out.write("    \t\t<dd><a href=\"product_detail\">书籍添加</a></dd>\r\n");
      out.write("    \t\t<dd><a href=\"product_change\">书籍修改</a></dd>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"panel panel-default\">\r\n");
      out.write("\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t<a class=\"panel-title\"  data-toggle=\"collapse\" data-parent=\"#panel-970909\" href=\"#panel-element-389560\"><strong>订单管理</strong></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"panel-element-389560\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t<dd><a href=\"allOrder\">订单列表</a></dd>\r\n");
      out.write("    \t\t<dd><a href=\"order_detail\">订单详情</a></dd>\r\n");
      out.write("    \t\t<dd><a href=\"allDiscuss\">订单评论</a></dd>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"panel panel-default\">\r\n");
      out.write("\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t<a class=\"panel-title\"  data-toggle=\"collapse\" data-parent=\"#panel-970909\" href=\"#panel-element-189130\"><strong>用户管理</strong></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"panel-element-189130\" class=\"panel-collapse collapse in\">\r\n");
      out.write("\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t<dd><a href=\"allUser\">用户列表</a></dd>\r\n");
      out.write("    \t\t<dd><a href=\"user_detail\">权限修改</a></dd>\r\n");
      out.write("    \t\t<dd><a href=\"user_rank\">权限说明</a></dd>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("<section class=\"rt_wrap content mCustomScrollbar\">\r\n");
      out.write(" <div class=\"rt_content\">\r\n");
      out.write("      <div class=\"page_title\">\r\n");
      out.write("       <h2 class=\"fl\">权限修改</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <form action=\"changeidentity?userID= ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\r\n");
      out.write("      <ul class=\"ulColumn2\">\r\n");
      out.write("        <li>\r\n");
      out.write("        <span class=\"item_name\" style=\"width:120px;\">用户编号：</span>\r\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li>\r\n");
      out.write("        <span class=\"item_name\" style=\"width:120px;\">登录名：</span>\r\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.loginname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li>\r\n");
      out.write("        <span class=\"item_name\" style=\"width:120px;\">用户名：</span>\r\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.username }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li>\r\n");
      out.write("        <span class=\"item_name\" style=\"width:120px;\">权限</span>\r\n");
      out.write("        <input type=\"text\" class=\"textbox\" placeholder=\"管理员或用户\" name=\"identity\" id=\"identity\">\r\n");
      out.write("       </li>\r\n");
      out.write("       <li>\r\n");
      out.write("        <span class=\"item_name\" style=\"width:120px;\"></span>\r\n");
      out.write("        <input type=\"submit\" class=\"link_btn\" value=\"更新/保存\"/>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li>\r\n");
      out.write("        PS：若无用户信息显示，请从用户列表中进入修改！\r\n");
      out.write("       </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      </form>\r\n");
      out.write(" </div>\r\n");
      out.write("</section>\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
