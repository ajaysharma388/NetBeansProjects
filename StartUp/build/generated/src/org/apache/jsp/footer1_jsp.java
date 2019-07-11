package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"\">\n");
      out.write("  <head>\n");
      out.write("      <style>\n");
      out.write("          footer.nb-footer {\n");
      out.write("background: #222;\n");
      out.write("border-top: 4px solid #b78c33; }\n");
      out.write("footer.nb-footer .about {\n");
      out.write("margin: 0 auto;\n");
      out.write("margin-top: 40px;\n");
      out.write("max-width: 1170px;\n");
      out.write("text-align: center; }\n");
      out.write("footer.nb-footer .about p {\n");
      out.write("font-size: 13px;\n");
      out.write("color: #999;\n");
      out.write("margin-top: 30px; }\n");
      out.write("footer.nb-footer .about .social-media {\n");
      out.write("margin-top: 15px; }\n");
      out.write("footer.nb-footer .about .social-media ul li a {\n");
      out.write("display: inline-block;\n");
      out.write("width: 45px;\n");
      out.write("height: 45px;\n");
      out.write("line-height: 45px;\n");
      out.write("border-radius: 50%;\n");
      out.write("font-size: 16px;\n");
      out.write("color: #b78c33;\n");
      out.write("border: 1px solid rgba(255, 255, 255, 0.3); }\n");
      out.write("footer.nb-footer .about .social-media ul li a:hover {\n");
      out.write("background: #b78c33;\n");
      out.write("color: #fff;\n");
      out.write("border-color: #b78c33; }\n");
      out.write("footer.nb-footer .footer-info-single {\n");
      out.write("margin-top: 30px; }\n");
      out.write("footer.nb-footer .footer-info-single .title {\n");
      out.write("color: #aaa;\n");
      out.write("text-transform: uppercase;\n");
      out.write("font-size: 16px;\n");
      out.write("border-left: 4px solid #b78c33;\n");
      out.write("padding-left: 5px; }\n");
      out.write("footer.nb-footer .footer-info-single ul li a {\n");
      out.write("display: block;\n");
      out.write("color: #aaa;\n");
      out.write("padding: 2px 0; }\n");
      out.write("footer.nb-footer .footer-info-single ul li a:hover {\n");
      out.write("color: #b78c33; }\n");
      out.write("footer.nb-footer .footer-info-single p {\n");
      out.write("font-size: 13px;\n");
      out.write("line-height: 20px;\n");
      out.write("color: #aaa; }\n");
      out.write("footer.nb-footer .copyright {\n");
      out.write("margin-top: 15px;\n");
      out.write("background: #111;\n");
      out.write("padding: 7px 0;\n");
      out.write("color: #999; }\n");
      out.write("footer.nb-footer .copyright p {\n");
      out.write("margin: 0;\n");
      out.write("padding: 0; }\n");
      out.write("      </style>\n");
      out.write("      <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href='//netdna.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <footer class=\"nb-footer\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-12\">\n");
      out.write("<div class=\"about\">\n");
      out.write("\t<img src=\"images/logo.png\" class=\"img-responsive center-block\" alt=\"\">\n");
      out.write("\t<p>Bootstrap Footer example snippets with CSS, Javascript and HTML. Code example of bootstrap-3 footer using HTML, Javascript, jQuery, and CSS. 5 Beautiful and Responsive Footer Templates. Pin a fixed-height footer to the bottom of the viewport in desktop browsers with this custom HTML and CSS.</p>\n");
      out.write("\n");
      out.write("\t<div class=\"social-media\">\n");
      out.write("\t\t<ul class=\"list-inline\">\n");
      out.write("\t\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3 col-sm-6\">\n");
      out.write("<div class=\"footer-info-single\">\n");
      out.write("\t<h2 class=\"title\">Help Center</h2>\n");
      out.write("\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> How to Pay</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> FAQ's</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Sitemap</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Delivery Info</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3 col-sm-6\">\n");
      out.write("<div class=\"footer-info-single\">\n");
      out.write("\t<h2 class=\"title\">Customer information</h2>\n");
      out.write("\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> About Us</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> FAQ's</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Sell Your Items</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Contact Us</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> RSS</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3 col-sm-6\">\n");
      out.write("<div class=\"footer-info-single\">\n");
      out.write("\t<h2 class=\"title\">Security & privacy</h2>\n");
      out.write("\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Terms Of Use</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Privacy Policy</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Return / Refund Policy</a></li>\n");
      out.write("\t\t<li><a href=\"http://www.nextbootstrap.com/\" title=\"\"><i class=\"fa fa-angle-double-right\"></i> Store Locations</a></li>\n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"col-md-3 col-sm-6\">\n");
      out.write("<div class=\"footer-info-single\">\n");
      out.write("\t<h2 class=\"title\">Payment</h2>\n");
      out.write("\t<p>Sample HTML page with Twitter's Bootstrap. Code example of Easy Sticky Footer using HTML, Javascript, jQuery, and CSS. This bootstrap tutorial covers all the major elements of responsive</p>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<section class=\"copyright\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-sm-6\">\n");
      out.write("<p>Copyright © 2017. Your Company.</p>\n");
      out.write("</div>\n");
      out.write("<div class=\"col-sm-6\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</section>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>");
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
