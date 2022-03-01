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

用户详情
<br><br>

<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
	   style="border-collapse:collapse">

						    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								用户名称:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.loginname }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								密码:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.loginpw }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								姓名:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.xingming }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								性别:
						    </td>

						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <select name="xingbie" id="xingbie"  style="width: 200px;" >
									<option value="${requestScope.users.xingbie }">${requestScope.users.xingbie }</option>

				                </select>
						    </td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								年龄:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.nianling }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								地址:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.address }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								电话:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.dianhua }
							</td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								审核:
						    </td>

						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <select name="shenhe" id="shenhe"  style="width: 200px;" >
									<option value="${requestScope.users.shenhe }">${requestScope.users.shenhe }</option>

				                </select>
						    </td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								类型:
						    </td>

						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <select name="type" id="type"  style="width: 200px;" onchange="typechange()">
									<option value="${requestScope.users.type }">${requestScope.users.typename }</option>

				                </select>
						    </td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								类型名称:
						    </td>

						    <td width="90%" bgcolor="#FFFFFF" align="left">
								${requestScope.users.typename }
							</td>

						</tr>


	<tr>
		<td colspan=3 align=center>
<%--
			<input type="hidden" name="id" value="${requestScope.users.id }"/>
--%>

			<input type="button" value="打印"  onClick="javascript:window.print()" />
			<input type="button" value="返回"  onClick="javascript:history.back()" />
		</td>
	</tr>
</table>

</body>
</html>


