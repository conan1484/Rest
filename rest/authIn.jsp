<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="jp.struts.rest.*" %>
<%
	int mode = -1;
	if (request.getParameter("mode") != null){
		mode = Integer.parseInt(request.getParameter("mode"));
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>お客様 ログイン</title>
<link rel="stylesheet" type="text/css" href="./css/base.css"></link>
<script type="text/javascript" src="./js/auth.js"></script>
</head>
<body>
<h1>お客様 ログイン</h1>
<%
  if(mode == ini.AuthRetry){
%>
ご登録情報が確認できません。<br />
再度、
<%
  }
%>
お名前とパスワードを入力してください。

<br />

<form action="AuthInAction" method="post" onsubmit="return frmCheck(this);">
<table>
<tr><th>お名前</th>
<td><input type="text" name="name"      maxlength= "30"  size="30" /></td></tr>
<tr><th>パスワード</th>
<td><input type="text" name="password"  maxlength= "50"  size="30" /></td></tr>
</td></tr>
</table>
<br />
<input type="submit" value="ログイン" />
<input type="hidden" name="mode" value="<%= ini.AuthIn %>" />
</form>
<br />
<a href="./authNew.jsp">新規登録</a>
<a href="./index.jsp">トップページに戻る</a>
</body>
</html>