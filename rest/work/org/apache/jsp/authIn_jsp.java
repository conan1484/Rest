package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.struts.rest.*;

public final class authIn_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

	int mode = -1;
	if (request.getParameter("mode") != null){
		mode = Integer.parseInt(request.getParameter("mode"));
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>お客様 ログイン</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./css/base.css\"></link>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/auth.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>お客様 ログイン</h1>\r\n");

  if(mode == ini.AuthRetry){

      out.write("\r\n");
      out.write("ご登録情報が確認できません。<br />\r\n");
      out.write("再度、\r\n");

  }

      out.write("\r\n");
      out.write("お名前とパスワードを入力してください。\r\n");
      out.write("\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<form action=\"AuthInAction\" method=\"post\" onsubmit=\"return frmCheck(this);\">\r\n");
      out.write("<table>\r\n");
      out.write("<tr><th>お名前</th>\r\n");
      out.write("<td><input type=\"text\" name=\"name\"      maxlength= \"30\"  size=\"30\" /></td></tr>\r\n");
      out.write("<tr><th>パスワード</th>\r\n");
      out.write("<td><input type=\"text\" name=\"password\"  maxlength= \"50\"  size=\"30\" /></td></tr>\r\n");
      out.write("</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br />\r\n");
      out.write("<input type=\"submit\" value=\"ログイン\" />\r\n");
      out.write("<input type=\"hidden\" name=\"mode\" value=\"");
      out.print( ini.AuthIn );
      out.write("\" />\r\n");
      out.write("</form>\r\n");
      out.write("<br />\r\n");
      out.write("<a href=\"./authNew.jsp\">新規登録</a>\r\n");
      out.write("<a href=\"./index.jsp\">トップページに戻る</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
