/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-23 03:10:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bgfailure_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\"/>\r\n");
      out.write("<title>“书山有路”网上书店后台管理系统</title>\r\n");
      out.write("<meta name=\"author\" content=\"DeathGhost\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bgstyle.css\">\r\n");
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
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.cookie.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("\t\tif($.cookie(\"rmbUser\")==\"true\"){\r\n");
      out.write("\t\t\t$(\"#checkbox\").attr(\"checked\",true);\r\n");
      out.write("\t\t\t$(\"#loginname\").val($.cookie(\"name\"));\r\n");
      out.write("\t\t\t$(\"#password\").val($.cookie(\"pwd\"));\r\n");
      out.write("\t\t}\r\n");
      out.write("\t})\r\n");
      out.write("\t\r\n");
      out.write("\tfunction Save(){\r\n");
      out.write("\t\tif($(\"#checkbox:checked\").length==1){\r\n");
      out.write("\t\t\tvar str_loginname=$(\"#loginname\").val();\r\n");
      out.write("\t\t\tvar str_password=$(\"#password\").val();\r\n");
      out.write("\t\t\t$.cookie(\"rmbUser\",\"true\",{expires:7});\r\n");
      out.write("\t\t\t$.cookie(\"name\",str_loginname,{expires:7});\r\n");
      out.write("\t\t\t$.cookie(\"pwd\",str_password,{expires:7});\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$.cookie(\"rmbUser\",\"false\",{expires:-1});\r\n");
      out.write("\t\t\t$.cookie(\"name\",\"\",{expires:-1});\r\n");
      out.write("\t\t\t$.cookie(\"pwd\",\"\",{expires:-1});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}</script>\r\n");
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
      out.write(" <ul>\r\n");
      out.write("  <li>\r\n");
      out.write("   <dl>\r\n");
      out.write("    <dt>书籍管理</dt>\r\n");
      out.write("    <!--当前链接则添加class:active-->\r\n");
      out.write("    <dd><a href=\"allBook\" class=\"active\">书籍列表</a></dd>\r\n");
      out.write("    <dd><a href=\"product_detail\">书籍添加</a></dd>\r\n");
      out.write("    <dd><a href=\"product_change\">书籍修改</a></dd>\r\n");
      out.write("   </dl>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li>\r\n");
      out.write("   <dl>\r\n");
      out.write("    <dt>订单管理</dt>\r\n");
      out.write("    <dd><a href=\"allOrder\">订单列表</a></dd>\r\n");
      out.write("    <dd><a href=\"order_detail\">订单详情</a></dd>\r\n");
      out.write("    <dd><a href=\"order_discuss\">订单评论</a></dd>\r\n");
      out.write("   </dl>\r\n");
      out.write("  </li>\r\n");
      out.write("  <li>\r\n");
      out.write("   <dl>\r\n");
      out.write("    <dt>用户管理</dt>\r\n");
      out.write("    <dd><a href=\"allUser\">用户列表</a></dd>\r\n");
      out.write("    <dd><a href=\"user_detail\">权限修改</a></dd>\r\n");
      out.write("    <dd><a href=\"user_rank\">权限说明</a></dd>\r\n");
      out.write("   </dl>\r\n");
      out.write("  </li>\r\n");
      out.write(" </ul>\r\n");
      out.write("</aside>\r\n");
      out.write("\r\n");
      out.write("<section class=\"rt_wrap content mCustomScrollbar\"> \r\n");
      out.write(" <div class=\"rt_content\">\r\n");
      out.write("    <img alt=\"操作失败\" src=\"images/failure.jpg\">\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
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
}