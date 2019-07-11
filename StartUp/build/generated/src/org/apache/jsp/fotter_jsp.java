package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fotter_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">Sumi</h4>\n");
      out.write("            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin suscipit, libero a molestie consectetur, sapien elit lacinia mi.</p>\n");
      out.write("            <ul class=\"social-icon\">\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-youtube-play\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-google\" aria-hidden=\"true\"></i></a>\n");
      out.write("            <a href=\"#\" class=\"social\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">My Account</h4>\n");
      out.write("            <span class=\"acount-icon\">          \n");
      out.write("            <a href=\"#\"><i class=\"fa fa-heart\" aria-hidden=\"true\"></i> Wish List</a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-cart-plus\" aria-hidden=\"true\"></i> Cart</a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i> Profile</a>\n");
      out.write("            <a href=\"#\"><i class=\"fa fa-globe\" aria-hidden=\"true\"></i> Language</a>           \n");
      out.write("          </span>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">Category</h4>\n");
      out.write("            <div class=\"category\">\n");
      out.write("            <a href=\"#\">men</a>\n");
      out.write("            <a href=\"#\">women</a>\n");
      out.write("            <a href=\"#\">boy</a>\n");
      out.write("            <a href=\"#\">girl</a>\n");
      out.write("            <a href=\"#\">bag</a>\n");
      out.write("            <a href=\"#\">teshart</a>\n");
      out.write("            <a href=\"#\">top</a>\n");
      out.write("            <a href=\"#\">shos</a>\n");
      out.write("            <a href=\"#\">glass</a>\n");
      out.write("            <a href=\"#\">kit</a>\n");
      out.write("            <a href=\"#\">baby dress</a>\n");
      out.write("            <a href=\"#\">kurti</a>           \n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <h4 class=\"title\">Payment Methods</h4>\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry.</p>\n");
      out.write("            <ul class=\"payment\">\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-cc-amex\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-credit-card\" aria-hidden=\"true\"></i></a></li>            \n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-paypal\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            <li><a href=\"#\"><i class=\"fa fa-cc-visa\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("            </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
      out.write("        \n");
      out.write("        <div class=\"row text-center\"> © 2017. Made with  by sumi9xm.</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </footer>\n");
      out.write("    ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
