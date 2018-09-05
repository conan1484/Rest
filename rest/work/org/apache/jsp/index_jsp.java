package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;
import jp.struts.rest.ini;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005fxhtml_005flang;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005fxhtml_005flang = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005fxhtml_005flang.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

  int    id       = -1;
  String name     = null;
  String password = null;
  HttpSession ses = request.getSession();
  if(ses.getAttribute("id") != null){
    id       = Integer.parseInt((String)ses.getAttribute("id"));
    name     = (String)ses.getAttribute("name");
    password = (String)ses.getAttribute("password");
  }

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005fxhtml_005flang.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      // /index.jsp(19,0) name = xhtml type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fhtml_005f0.setXhtml(true);
      // /index.jsp(19,0) name = lang type = boolean reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005fhtml_005f0.setLang(true);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
          out.write("<title>■ Conan's Restaurante ■</title>\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/base.css\"></link>\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("<!--\r\n");
          out.write("AuthIn    = ");
          out.print( ini.AuthIn );
          out.write(";\r\n");
          out.write("AuthNew   = ");
          out.print( ini.AuthNew );
          out.write(";\r\n");
          out.write("ReserveIn = ");
          out.print( ini.ReserveIn );
          out.write(";\r\n");
          out.write("ShowMenu  = ");
          out.print( ini.ShowMenu );
          out.write(";\r\n");
          out.write("BbsIn     = ");
          out.print( ini.BbsIn );
          out.write(";\r\n");
          out.write("LogOff    = ");
          out.print( ini.LogOff );
          out.write(";\r\n");
          out.write("-->\r\n");
          out.write("</script>\r\n");
          out.write("<script type=\"text/javascript\" src=\"./js/index.js\"></script>\r\n");
          out.write("</head>\r\n");
          out.write("<body>\r\n");
          out.write("<h1>■ Conan's Restaurante ■</h1>\r\n");
  if(name != null){ 
          out.write('\r');
          out.write('\n');
          out.print( name );
          out.write('\r');
          out.write('\n');
  } else { 
          out.write("\r\n");
          out.write("ゲスト\r\n");
  } 
          out.write("\r\n");
          out.write("様、いらっしゃいませ。<br />\r\n");
          out.write("\r\n");
          out.write("<ul>\r\n");
          out.write("<li onclick=\"frm(AuthIn)\"   >お客様ログイン</li>\r\n");
 if(id < 0){
          out.write("\r\n");
          out.write("<li onclick=\"frm(AuthNew)\"  >新規お客様登録</li>\r\n");
 } else {
          out.write("\r\n");
          out.write("<li onclick=\"frm(ReserveIn)\">ご予約</li>\r\n");
          out.write("<li onclick=\"frm(ShowMenu)\" >メニューを見る</li>\r\n");
          out.write("<li onclick=\"frm(CommIn)\"   >コミュニケーション掲示板</li>\r\n");
 }
          out.write("\r\n");
          out.write("<li onclick=\"frm(LogOff)\"   >ログオフ</li>\r\n");
          out.write("</ul>\r\n");
          out.write("<form method=\"post\"><input type=\"hidden\" name=\"mode\" /></form>\r\n");
          out.write("</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005fxhtml_005flang.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005fxhtml_005flang.reuse(_jspx_th_html_005fhtml_005f0);
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
