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

<%
	int p = 1;
%>

<!doctype html>
<html class="no-js" lang="en">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title></title>

	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/common.css">
	<link rel="stylesheet" type="text/css" href="css/sub.css">
	<link rel="stylesheet" type="text/css" href="css/responsive.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

	<style type="text/css">
		<!--
		.STYLE1 {
			color: #2F7A0A;
			font-weight: bold;
		}

		-->
	</style>


	<script type="text/javascript" src="<%=path %>/js/popup.js"></script>
	<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
	<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
	<script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
	<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
	<%--<script type="text/javascript" src="<%=path %>/js/riqi.js"></script>--%>

	<script language="javascript">


		function up()
		{
			var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
			pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
			pop.setContent("title","文件上传");
			pop.build();
			pop.show();
		}
		function upx(id)
		{
			//window.open("<%=path %>/upload/upload.jsp?id="+id, "_self");
			var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
			pop.setContent("contentUrl","<%=path %>/upload/upload.jsp?id="+id);
			pop.setContent("title","文件上传");
			pop.build();
			pop.show();
		}
		function down1(fujianPath,fujianYuashiMing)
		{
			var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
			url=encodeURI(url);
			url=encodeURI(url);
			window.open(url,"_self");
		}
		//2 针对本对象添加子表信息，唯一
		

		//3子表管理getbycolumnjs
		/*classNameLowerDetailQian.jsp.sonGetByFatheridQianjsList*/

	</script>
</head>

<body>

<%@ include file="header.jsp" %>
<div class="menu_wrapper">
	<div class="wrapper menu clearfix">
		<div id="menu">

			<%@ include file="header2.jsp" %>
		</div>

		<%@ include file="topsearch.jsp" %>
	</div>
</div>

<div class="banner">
	<div id="slides">
		<div class="slides_container">

			<c:forEach items="${sessionScope.lunboList }" var="lunbo" varStatus="ss">
				<a href="lunboDetailQian.action?id=${lunbo.id }" style="display: block"><img src="./${lunbo.image }" height="350" width="2000"></a>
			</c:forEach>
		</div>
	</div>
</div>

<div class="wrapper">
	<div class="news_con">

		<div class="news_list_con clearfix">
			<div>
				<h2>收藏信息 <b></b></h2>
				<ul>

					<table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
						   style="border-collapse:collapse" class="newsline">

						
						<tr>
							<td width="39%" height="44">
								时间:
							</td>
							<td width="39%" >
								${requestScope.shoucang.shijian }
							</td>
						</tr>

						<tr>
							<td width="39%" height="44">
								收藏景点:
							</td>
							<td width="39%" >
								${requestScope.shoucang.jingdian.biaoti }
							</td>
						</tr>

                        <tr>
                            <td width="39%" height="44">
                                收藏用户:
                            </td>
                            <td width="39%" >
                                ${requestScope.shoucang.users.loginname }
                            </td>
                        </tr>



						<tr>
							<td colspan=3 align=center>

								

								<input type=button name=Submit5 value=返回
									   onClick="javascript:history.back()"/>
								<input type=button name=Submit52 value=打印 onClick="javascript:window.print()"/>


							</td>
						</tr>

					</table>


				</ul>

			</div>

		</div>
	</div>
</div>
<%@ include file="footer.jsp" %>

</div>


</div>



<script src="js/libs/jquery-1.7.1.min.js"></script>
<script src="js/slides.min.jquery.js"></script>
<script src="js/jcarousellite.js"></script>
<script src="js/plugins.js"></script>
<script src="js/script.js"></script>
</body>
</html>
<script>
	$(function () {
		$('#slides').slides({
			preload: true,
			preloadImage: 'img/loading.gif',
			play: 3000,
			pause: 1000,
			generateNextPrev: false,
			generatePagination: false,
			hoverPause: true,
			currentClass: 'current',
			paginationClass:'pagination',
		});
	});
</script>
