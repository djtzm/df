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
		            //2
            function usersliuyanAddQian(id)
            {
                <c:if test="${sessionScope.userType ==null}">
                    alert("请先登录");
                </c:if>
                <c:if test="${sessionScope.userType !=null}">
                    var url="<%=path %>/usersliuyanAddQian.action?id="+id;
                    window.location.href=url;
                </c:if>
            }

            function usersliuyanGetByusersidQian(id)
            {
                var url="<%=path %>/usersliuyanGetByusersidQian.action?usersid="+id;
                window.location.href=url;
            }
            //2
            function userspinglunAddQian(id)
            {
                <c:if test="${sessionScope.userType ==null}">
                    alert("请先登录");
                </c:if>
                <c:if test="${sessionScope.userType !=null}">
                    var url="<%=path %>/userspinglunAddQian.action?id="+id;
                    window.location.href=url;
                </c:if>
            }

            function userspinglunGetByusersidQian(id)
            {
                var url="<%=path %>/userspinglunGetByusersidQian.action?usersid="+id;
                window.location.href=url;
            }
            //2
            function usersshoucangAddQian(id)
            {
                <c:if test="${sessionScope.userType ==null}">
                    alert("请先登录");
                </c:if>
                <c:if test="${sessionScope.userType !=null}">
                    var url="<%=path %>/usersshoucangAddQian.action?id="+id;
                    window.location.href=url;
                </c:if>
            }

            function usersshoucangGetByusersidQian(id)
            {
                var url="<%=path %>/usersshoucangGetByusersidQian.action?usersid="+id;
                window.location.href=url;
            }
            //2
            function usersxianluAddQian(id)
            {
                <c:if test="${sessionScope.userType ==null}">
                    alert("请先登录");
                </c:if>
                <c:if test="${sessionScope.userType !=null}">
                    var url="<%=path %>/usersxianluAddQian.action?id="+id;
                    window.location.href=url;
                </c:if>
            }

            function usersxianluGetByusersidQian(id)
            {
                var url="<%=path %>/usersxianluGetByusersidQian.action?usersid="+id;
                window.location.href=url;
            }
            //2
            function usersyudingAddQian(id)
            {
                <c:if test="${sessionScope.userType ==null}">
                    alert("请先登录");
                </c:if>
                <c:if test="${sessionScope.userType !=null}">
                    var url="<%=path %>/usersyudingAddQian.action?id="+id;
                    window.location.href=url;
                </c:if>
            }

            function usersyudingGetByusersidQian(id)
            {
                var url="<%=path %>/usersyudingGetByusersidQian.action?usersid="+id;
                window.location.href=url;
            }
            //2
            function usersyuyueAddQian(id)
            {
                <c:if test="${sessionScope.userType ==null}">
                    alert("请先登录");
                </c:if>
                <c:if test="${sessionScope.userType !=null}">
                    var url="<%=path %>/usersyuyueAddQian.action?id="+id;
                    window.location.href=url;
                </c:if>
            }

            function usersyuyueGetByusersidQian(id)
            {
                var url="<%=path %>/usersyuyueGetByusersidQian.action?usersid="+id;
                window.location.href=url;
            }


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
				<h2>用户信息 <b></b></h2>
				<ul>

					<table width="100%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
						   style="border-collapse:collapse" class="newsline">

											    <tr>
							<td width="39%" height="44">
								用户名称:
							</td>
							<td width="39%" >
								${requestScope.users.loginname }
							</td>
						</tr>
					    <tr>
							<td width="39%" height="44">
								密码:
							</td>
							<td width="39%" >
								${requestScope.users.loginpw }
							</td>
						</tr>
					    <tr>
							<td width="39%" height="44">
								姓名:
							</td>
							<td width="39%" >
								${requestScope.users.xingming }
							</td>
						</tr>


						<tr>
							<td width="39%" height="44">
								性别:
							</td>
							<td width="39%" >
								${requestScope.users.xingbie }
							</td>
						</tr>
					    <tr>
							<td width="39%" height="44">
								年龄:
							</td>
							<td width="39%" >
								${requestScope.users.nianling }
							</td>
						</tr>
					    <tr>
							<td width="39%" height="44">
								地址:
							</td>
							<td width="39%" >
								${requestScope.users.address }
							</td>
						</tr>
					    <tr>
							<td width="39%" height="44">
								电话:
							</td>
							<td width="39%" >
								${requestScope.users.dianhua }
							</td>
						</tr>

						<tr>
							<td width="39%" height="44">
								审核:
							</td>
							<td width="39%" >
								${requestScope.users.shenhe }
							</td>
						</tr>

						<tr>
							<td width="39%" height="44">
								类型:
							</td>
							<td width="39%" >
								${requestScope.users.type }
							</td>
						</tr>

						<tr>
							<td width="39%" height="44">
								类型名称:
							</td>
							<td width="39%" >
								${requestScope.users.typename }
							</td>
						</tr>



						<tr>
							<td colspan=3 align=center>

								
									<input type="button" value="用户留言添加" onclick="usersliuyanAddQian(${requestScope.users.id })" />&nbsp;&nbsp;



									<input type="button" value="用户留言查看" onclick="usersliuyanGetByusersidQian(${requestScope.users.id })" />


									<input type="button" value="用户评论添加" onclick="userspinglunAddQian(${requestScope.users.id })" />&nbsp;&nbsp;



									<input type="button" value="用户评论查看" onclick="userspinglunGetByusersidQian(${requestScope.users.id })" />


									<input type="button" value="用户收藏添加" onclick="usersshoucangAddQian(${requestScope.users.id })" />&nbsp;&nbsp;



<%--
									<input type="button" value="用户收藏查看" onclick="usersshoucangGetByusersidQian(${requestScope.users.id })" />
--%>


									<input type="button" value="用户旅游路线添加" onclick="usersxianluAddQian(${requestScope.users.id })" />&nbsp;&nbsp;



									<input type="button" value="用户旅游路线查看" onclick="usersxianluGetByusersidQian(${requestScope.users.id })" />


									<input type="button" value="用户预定添加" onclick="usersyudingAddQian(${requestScope.users.id })" />&nbsp;&nbsp;



<%--
									<input type="button" value="用户预定查看" onclick="usersyudingGetByusersidQian(${requestScope.users.id })" />
--%>


									<input type="button" value="用户预约添加" onclick="usersyuyueAddQian(${requestScope.users.id })" />&nbsp;&nbsp;



<%--
									<input type="button" value="用户预约查看" onclick="usersyuyueGetByusersidQian(${requestScope.users.id })" />
--%>



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
