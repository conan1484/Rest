<?xml version="1.0" encoding="UTF-8" ?>
<%@ page   contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="jp.struts.rest.ini" %>
<%
  int    id       = -1;
  String name     = null;
  String password = null;
  HttpSession ses = request.getSession();
  if(ses.getAttribute("id") != null){
    id       = Integer.parseInt((String)ses.getAttribute("id"));
    name     = (String)ses.getAttribute("name");
    password = (String)ses.getAttribute("password");
  }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html:html xhtml="true" lang="true">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>■ Conan's Restaurante ■</title>
<link rel="stylesheet" type="text/css" href="./css/base.css"></link>
<script type="text/javascript">
<!--
AuthIn    = <%= ini.AuthIn %>;
AuthNew   = <%= ini.AuthNew %>;
ReserveIn = <%= ini.ReserveIn %>;
ShowMenu  = <%= ini.ShowMenu %>;
BbsIn     = <%= ini.BbsIn %>;
LogOff    = <%= ini.LogOff %>;
-->
</script>
<script type="text/javascript" src="./js/index.js"></script>
</head>
<body>
<h1>■ Conan's Restaurante ■</h1>
<%  if(name != null){ %>
<%= name %>
<%  } else { %>
ゲスト
<%  } %>
様、いらっしゃいませ。<br />

<ul>
<li onclick="frm(AuthIn)"   >お客様ログイン</li>
<% if(id < 0){%>
<li onclick="frm(AuthNew)"  >新規お客様登録</li>
<% } else {%>
<li onclick="frm(ReserveIn)">ご予約</li>
<li onclick="frm(ShowMenu)" >メニューを見る</li>
<li onclick="frm(CommIn)"   >コミュニケーション掲示板</li>
<% }%>
<li onclick="frm(LogOff)"   >ログオフ</li>
</ul>
<form method="post"><input type="hidden" name="mode" /></form>
</body>
</html:html>
