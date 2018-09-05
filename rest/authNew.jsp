<?xml version="1.0" encoding="UTF-8" ?>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="jp.struts.rest.*" %>
<%
	String[] c    = ini.Comm;
	int      mode = ini.AuthNewExecute;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>お客様情報登録</title>
<link rel="stylesheet" type="text/css" href="./css/base.css"></link>
<script type="text/javascript" src="./js/auth.js"></script>
</head>
<body>
<h1>お客様情報登録</h1>
<form action="./AuthAction" >
<table>
<tr><th>ＩＤ</th>
<td><input type="text" name="id"        maxlength= "30"  size="30" /></td></tr>
<tr><th>名前</th>
<td><input type="text" name="name"      maxlength= "30"  size="30" /></td></tr>
<tr><th>ふりがな</th>
<td><input type="text" name="reading"   maxlength= "50"  size="30" /></td></tr>
<tr><th>パスワード</th>
<td><input type="text" name="password"  maxlength= "64"  size="30" /></td></tr>
<tr><th>住所</th>
<td><input type="text" name="address"   maxlength="200"  size="50" /></td></tr>
<tr><th>電話番号</th>
<td><input type="text" name="phone"     maxlength= "20"  size="30" /></td></tr>
<tr><th>メールアドレス</th>
<td><input type="text" name="mail"      maxlength="100"  size="30" /></td></tr>
<tr><th>連絡方法</th>
<td>
<%
	for(int i=0;i < c.length; i++){
%>
<input type="radio" name="comm" value="<%= i %>"/><%= c[i] %>　
<% } %>
</td></tr>
</table>
<br />
<input type="submit" value="登録" />
<input type="reset"  value="やり直し" />
<input type="hidden" name="mode" value="<%= mode %>" />
</form>
<br />
<a href="./index.jsp">トップページに戻る</a>
</body>
</html>