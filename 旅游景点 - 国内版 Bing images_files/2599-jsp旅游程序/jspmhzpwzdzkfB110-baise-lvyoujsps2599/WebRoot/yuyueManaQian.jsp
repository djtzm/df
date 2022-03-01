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
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>title</title>

	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" type="text/css" href="css/common.css">
	<link rel="stylesheet" type="text/css" href="css/sub.css">
	<link rel="stylesheet" type="text/css" href="css/responsive.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">

	<script language=javascript src='js/popup.js'></script>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">


	<script type="text/javascript" src="<%=path %>/js/popup.js"></script>
	<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
	<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
	<script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
	<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
	<%--<script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>--%>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<%--<script type="text/javascript" src="<%=path %>/js/riqi.js"></script>--%>

	<script language="javascript">
		//计算两个日期的天数差
		function dateDiff(){

			if(document.getElementById("kaishiriqi").value=="")
			{
				alert("please input:起始日期");
				return false;
			}

			if(document.getElementById("jieshuriqi").value=="")
			{
				alert("please input:结束日期");
				return false;
			}
			var firstriqi = document.getElementById("kaishiriqi").value;
			var secondriqi = document.getElementById("jieshuriqi").value;
			var first = new Date(firstriqi);
			var second = new Date(secondriqi);
			var diff = Math.abs(first.getTime() - second.getTime())
			var result = parseInt(diff / (1000 * 60 * 60 * 24));
			//document.getElementById("jine").value = result*${requestScope.kefang.jiage };
		}
		//导出信息
		function daochu()
		{
			var url="<%=path %>/yuyueAll.action?d=1";
			window.location.href=url;
		}
		//上传文件
		function up()
		{
			var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
			pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
			pop.setContent("title","文件上传");
			pop.build();
			pop.show();
			//另一红上传方式可以参照upx
		}
		//添加信息
		function yuyueAddQian()
		{
			<c:if test="${sessionScope.user==null}">
			alert("请先登录");
			</c:if>
			<c:if test="${sessionScope.user!=null}">
			var url="<%=path %>/qiantai/yuyue/yuyueAddQian.jsp";
			window.location.href=url;
			</c:if>
		}
		//删除信息
		function yuyueDel(id)
		{
			if(confirm('您确定删除吗?'))
			{
				window.location.href="<%=path %>/yuyueDel.action?id="+id;
			}
		}
		//修改信息
		function yuyueGet(id)
		{
			window.location.href="yuyueGet.action?id="+id;
		}
		//图片预览
		function over(picPath)
		{
			if (picPath=="")picPath="/images/default.jpg";
			x = event.clientX;
			y = event.clientY;
			document.all.tip.style.display = "block";
			document.all.tip.style.top = y;
			document.all.tip.style.left = x+10;
			document.all.photo.src = ".."+picPath;
		}
		function out()
		{
			document.all.tip.style.display = "none";
		}
		function down1(fujianPath,fujianYuashiMing)
		{
			var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
			url=encodeURI(url);
			url=encodeURI(url);
			window.open(url,"_self");
		}
		function go(index)
		{
			document.form123.index.value=index;
			document.form123.action="yuyueManaQian.action"
			document.form123.submit();
		}
		function yuyueAll(id,property,value)
		{
			if(confirm('您确定操作吗?'))
			{
				var form = document.getElementById("formset");
				form.getElementsByTagName("INPUT")[0].name = property;
				form.getElementsByTagName("INPUT")[0].value = value;
				document.formset.action="yuyueSet.action?id="+id
				document.formset.submit();
				//window.location.href="<%=path %>/yuyueSet.action?id="+id+"&isurl=1"+"&"+property+"="+value;
			}
		}

		function typechange()
		{
			//alert("typechange start");
			//document.formAdd.typename.value=document.formAdd.type.text;
			var obj = document.getElementById("type"); //定位id				//document.getElementById(id)
			var index = obj.selectedIndex; // 选中索引
			var text = obj.options[index].text; // 选中索引值
			//alert(index);
			//alert(text);
			//var text = obj.options[index].text; // 选中文本     输出张三等汉字信�?
			//var value = obj.options[index].value; // 选中     输出zhangsan等英文信�?
			//obj.options[index].text = obj.options[index].value;
			document.getElementById("typename").value = text; //okok
			//document.formAdd.typename.value=text; //error
			//alert("typechange end");
		}
		function init()
		{

				           xianluSelect();
	           usersSelect();

			/*leibieSelect();*/

			
			/*typechange();*/
		}

			        function xianluSelect()
	        {
	            loginService.xianluSelect(xianlucallBack);
	        }
	        function xianlucallBack(data)
	        {
	            DWRUtil.addOptions("xianluid",data,"id","biaoti");
	        }
	        function usersSelect()
	        {
	            loginService.usersSelect(userscallBack);
	        }
	        function userscallBack(data)
	        {
	            DWRUtil.addOptions("usersid",data,"id","loginname");
	        }


		//子表管理示例代码
		/*			function tupianGetByxinwen_id(xinwen_id)
                    {
                        var url="<%=path %>/tupianGetByxinwen_id.action?xinwen_id="+xinwen_id;
				window.location.href=url;
			}*/
		/*classNameLowerAll.jsp.SontableNameLowerGetbyFatheridjsList*/
	</script>
</head>
<body onload="init()">

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
				<a href="lunboDetailQian.action?id=${lunbo.id }" style="display: block"><img src="./${lunbo.image }" height="350" width="3000"></a>
			</c:forEach>
		</div>
	</div>
</div>

<div class="wrapper">
	<div class="news_con">
		<div class="news_list_con clearfix">
			<%--<div class="product_sidebar">
               <h2>xxxx</h2>
               <p>xxxx。</p>
           </div>
			<div class="product_show clearfix">--%>
			<h2>预约</h2>
			<form name="form1" id="form1" method="post" action="<%=path %>/yuyueSearchQian.action">

				            标题:
            <input type="text" name="biaoti" id="biaoti" style='border:solid 1px #000000; color:#666666' size="12" />
                                预约旅游路线:
                                <select name="xianluid" id="xianluid" style='border:solid 1px #000000; color:#666666;'>
                                    <option value="">全部</option>
                                </select>
								预约用户:
								<select name="usersid" id="usersid" >
									<option value="">全部</option>
								</select>
<%--
                                日期:
                                <input type="text" class="Wdate"  name="riqi" id="riqi"  onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"  value="<%=new SimpleDateFormat("yyyy-MM-dd").format(new Date())%>"/>
--%>
                                日期:


                                <input type="text" name="riqi" id="riqi"  style="border:1px solid #cccccc;"
                                       size="15" class="Wdate" onfocus="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"  onClick="WdatePicker({'dateFmt':'yyyy-MM-dd'})" <%--onclick="fPopCalendar(event,this,this)"--%>
                                       value="" />
            姓名:
            <input type="text" name="xingming" id="xingming" style='border:solid 1px #000000; color:#666666' size="12" />
            电话:
            <input type="text" name="dianhua" id="dianhua" style='border:solid 1px #000000; color:#666666' size="12" />
            备注:
            <input type="text" name="beizhu" id="beizhu" style='border:solid 1px #000000; color:#666666' size="12" />


				<input type="submit" name="Submit" value="查找" style='border:solid 1px #000000; color:#666666'/>
			</form>

			<table width="98%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
				   style="border-collapse:collapse" class="newsline">
				<tr>
					<td width="30" align="center" bgcolor="CCFFFF">序号</td>

					<%--colunmRemarks--%>
									    <td bgcolor='#CCFFFF' align="center" >标题</td>
				    <td bgcolor='#CCFFFF' align="center" >预约旅游路线</td>
				    <td bgcolor='#CCFFFF' align="center" >预约用户</td>
				    <td bgcolor='#CCFFFF' align="center" >日期</td>
				    <td bgcolor='#CCFFFF' align="center" >姓名</td>
				    <td bgcolor='#CCFFFF' align="center" >电话</td>
				    <td bgcolor='#CCFFFF' align="center" >备注</td>



					<td width="30" align="center" bgcolor="CCFFFF">详细</td>
				</tr>

				<c:forEach items="${requestScope.page.data}" var="yuyue" varStatus="s">

					<tr>
						<td width="30" align="center">
								${s.index+1}
						</td>

							<%--colunmNameValue--%>
											<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.biaoti)>'16'}">
							${fn:substring(yuyue.biaoti,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.biaoti)<='16'}">
							${yuyue.biaoti}
						</c:if>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.xianlu.biaoti)>'16'}">
							${fn:substring(yuyue.xianlu.biaoti,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.xianlu.biaoti)<='16'}">
							${yuyue.xianlu.biaoti}
						</c:if>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.users.loginname)>'16'}">
							${fn:substring(yuyue.users.loginname,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.users.loginname)<='16'}">
							${yuyue.users.loginname}
						</c:if>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.riqi)>'16'}">
							${fn:substring(yuyue.riqi,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.riqi)<='16'}">
							${yuyue.riqi}
						</c:if>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.xingming)>'16'}">
							${fn:substring(yuyue.xingming,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.xingming)<='16'}">
							${yuyue.xingming}
						</c:if>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.dianhua)>'16'}">
							${fn:substring(yuyue.dianhua,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.dianhua)<='16'}">
							${yuyue.dianhua}
						</c:if>
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
						<c:if test="${fn:length(yuyue.beizhu)>'16'}">
							${fn:substring(yuyue.beizhu,0,16)}...
						</c:if>
						<c:if test="${fn:length(yuyue.beizhu)<='16'}">
							${yuyue.beizhu}
						</c:if>
					</td>
					



						<td width="30" align="center">
							<a href="<%=path %>/yuyueDetailQian.action?id=${yuyue.id}">
								详细
							</a>
						</td>
					</tr>
				</c:forEach>

			</table>
			<br>
			<%@ include file="/hsgfenye.jsp"%>
			<table width="98%" border="0" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
				   style="border-collapse:collapse" class="newsline">
					<tr>
						<td align="center" bgcolor="CCFFFF">
							<%--
							<input type="button" value="添加" style="width: 120px;" onclick="yuyueAddQian()" />
							--%>
							<input type="button" value="打印" style="width: 60px;" onClick="javascript:window.print()" />
							<input type="button" value="返回" style="width: 60px;" onClick="javascript:history.back()" />

						</td>

					</tr>
			</table>
		</div>
		<%--<div class="product_show clearfix">
			<p align="center">
				<%@ include file="/hsgfenye.jsp"%>
			</p>
			<br>
		</div>--%>
	</div>
</div>
<%@ include file="footer.jsp" %>
</div>


</div>


<script>window.jQuery || document.write('<script src="js/libs/jquery-1.7.1.min.js"><\/script>')</script>

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
