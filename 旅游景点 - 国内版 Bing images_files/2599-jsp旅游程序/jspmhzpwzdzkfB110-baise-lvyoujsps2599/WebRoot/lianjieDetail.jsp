<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>

<%
	String path = request.getContextPath();
%>
<%
	String d = request.getParameter("d");
	if(d!=null && d.equals("1"))
	{
		response.setHeader("Content-disposition","attachment; filename=daochu.xls");
	}
//获取并判断浏览器信息
	String Agent = request.getHeader("User-Agent");
	if(Agent.contains("Chrome"))
	{
		System.out.println("Chrome");
		request.setAttribute("brtype", "cbr");
	}
	else
	{
		System.out.println("!Chrome");
		request.setAttribute("brtype", "obr");
	}
	System.out.println(Agent);
%>

<html>
<head>
	<title>title</title>
	<LINK href="css.css" type=text/css rel=stylesheet>
	<script language="javascript">
		function down1(fujianPath,fujianYuashiMing)
		{
			var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
			url=encodeURI(url);
			url=encodeURI(url);
			window.open(url,"_self");
		}
	</script>
</head>

<body>

友情链接详情
<br><br>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
	   style="border-collapse:collapse">

						    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								名称:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.lianjie.name }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								链接地址:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.lianjie.url }
							</td>

						</tr>


	<tr>
		<td colspan=3 align=center>
<%--
			<input type="hidden" name="id" value="${requestScope.lianjie.id }"/>
--%>

			<input type="button" value="打印"  onClick="javascript:window.print()" />
			<input type="button" value="返回"  onClick="javascript:history.back()" />
		</td>
	</tr>
</table>

</body>
</html>


