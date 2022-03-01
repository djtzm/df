<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>

<%
    String path = request.getContextPath();
%>
<%
    String d = request.getParameter("d");
    if (d != null && d.equals("1")) {
        response.setHeader("Content-disposition", "attachment; filename=daochu.xls");
    }
//获取并判断浏览器信息
    String Agent = request.getHeader("User-Agent");
    if (Agent.contains("Chrome")) {
        System.out.println("Chrome");
        request.setAttribute("brtype", "cbr");
    } else {
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
	<link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/sub.css">
    <link rel="stylesheet" type="text/css" href="css/responsive.css">

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
    <%--<script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>--%>
    <script language=javascript src='js/My97DatePicker/WdatePicker.js'></script>
    <%--<script type="text/javascript" src="<%=path %>/js/riqi.js"></script>--%>
    <%--1 请先登录判断--%>

    

    <script language="javascript">

        //计算两个日期的天数差
        function dateDiff() {

            if (document.getElementById("kaishiriqi").value == "") {
                alert("please input:起始日期");
                return false;
            }

            if (document.getElementById("jieshuriqi").value == "") {
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

        function check() {

                            if(document.getElementById("loginname").value=="")
                {
                    alert("please input:用户名称");
                    return false;
                }

                if(document.getElementById("loginpw").value=="")
                {
                    alert("please input:密码");
                    return false;
                }

                if(document.getElementById("type").value=="")
                {
                    alert("please input:类型");
                    return false;
                }

                if(document.getElementById("typename").value=="")
                {
                    alert("please input:类型名称");
                    return false;
                }

                if(document.getElementById("xingming").value=="")
                {
                    alert("please input:姓名");
                    return false;
                }

                if(document.getElementById("nianling").value=="")
                {
                    alert("please input:年龄");
                    return false;
                }

                if(document.getElementById("address").value=="")
                {
                    alert("please input:地址");
                    return false;
                }

                if(document.getElementById("dianhua").value=="")
                {
                    alert("please input:电话");
                    return false;
                }

                var dianhua = document.getElementById("dianhua");
                if(dianhua.value!="")
                {
                    if(/^[1][3,4,5,6,7,8,9][0-9]{9}$/.test(dianhua.value))
                    {
                    }
                    else
                    {
                        alert("必需手机格式");
                        return false;
                    }
                }
                if(document.getElementById("youxiang").value=="")
                {
                    alert("please input:邮箱");
                    return false;
                }

                var youxiang = document.getElementById("youxiang");
                if(youxiang.value!="")
                {
                    if(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/.test(youxiang.value))
                    {
                    }
                    else
                    {
                        alert("必需邮箱格式");
                        return false;
                    }
                }


            document.getElementById("formAdd").submit();
        }

        function up() {
            var pop = new Popup({contentType: 1, isReloadOnClose: false, width: 400, height: 200});
            pop.setContent("contentUrl", "<%=path %>/upload/upload.jsp");
            pop.setContent("title", "文件上传");
            pop.build();
            pop.show();
        }

        function upx(id) {
            //window.open("<%=path %>/upload/upload.jsp?id="+id, "_self");
            var pop = new Popup({contentType: 1, isReloadOnClose: false, width: 400, height: 200});
            pop.setContent("contentUrl", "<%=path %>/upload/upload.jsp?id=" + id);
            pop.setContent("title", "文件上传");
            pop.build();
            pop.show();
        }

        function typechange() {

            var obj = document.getElementById("type"); //定位id				//document.getElementById(id)
            var index = obj.selectedIndex; // 选中索引
            var text = obj.options[index].text; // 选中索引值

            document.getElementById("typename").value = text; //okok

        }

        function init() {

            

            typechange();
        }

        

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
                <a href="lunboDetailQian.action?id=${lunbo.id }" style="display: block"><img src="./${lunbo.image }" height="350" width="2000"></a>
            </c:forEach>
        </div>
    </div>
</div>

<div class="wrapper">
    <div class="news_con">
        <div class="news_list_con clearfix">

            <h2>用户登录 <b></b></h2>

			<c:if test="${sessionScope.user==null}">
				<form action="" method="post" name="formlogin" id="formlogin"
					  style="display: inline">
					<table width="100%" height="52%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="93" height="50">&nbsp;</td>
							<td width="99" height="28">用户名:</td>
							<td height="28" colspan="2"><input name="loginname" type="text" id="loginnamex"
															   placeholder="请输入用户名"
															   style="width:160px; height:40px; border:solid 1px #000000; color:#666666;"/>
							</td>
						</tr>
						<tr>
							<td height="50">&nbsp;</td>
							<td height="28">密码:</td>
							<td height="28" colspan="2"><input name="loginpw" type="password" id="loginpwx"
															   placeholder="请输入密码"
															   style="width:160px; height:40px; border:solid 1px #000000; color:#666666"/>
							</td>
						</tr>
						<tr>
							<td height="50">&nbsp;</td>
							<td height="28">权限:</td>
							<td height="28" colspan="2">
								<select name="type" id="typex"
										style="width:160px; height:40px; border:solid 1px #000000; color:#666666">
									<option value="2">用户</option>
									<%--<option value="1">企业</option>--%>
									<option value="0">管理员</option>
									<!--quxanxiaxndexnglxu-->
								</select></td>
						</tr>
						<tr>
							<td height="50">&nbsp;</td>
							<td height="28">验证码</td>
							<td width="80" height="28"><input name="yzm" type="text" id="yzmx"
															  style=" height:30px; border:solid 1px #000000; color:#666666; width:110px"/>
							</td>
							<td width="868"><a href="javascript:loadimage();"><img alt="看不清请点我！"
																				   name="randImage"
																				   id="randImage"
																				   src="image.jsp" width="60"
																				   height="20" border="1"
																				   align="absmiddle"/></a></td>
						</tr>
						<script type="text/javascript">

							function loadimage() {
								document.getElementById("randImage").src = "image.jsp?" + Math.random();
							}



						</script>
						<tr>
							<td height="50" align="center">&nbsp;</td>
							<td height="38" colspan="3" align="left"><input type="button" name="Submit"
																			value="登陆" class="hsgbutton"
																			onclick="check4();"/>
								<input type="reset" name="Submit2" value="重置" class="hsgbutton"/></td>
						</tr>
					</table>
				</form>
			</c:if>
			<c:if test="${sessionScope.user!=null}">
				<table width="90%" height="82%" border="0" align="center" cellpadding="0" cellspacing="0" >
					<tr>
						<td width="31%" height="30" >用户名</td>
						<td width="69%" height="30">${sessionScope.user.loginname}
						</td>
					</tr>
					<tr>
						<td height="30">权限</td>
						<td height="30">${sessionScope.user.typename}
						</td>
					</tr>
					<tr>
						<td height="30" colspan="2" align="center" ><input type="button" name="Submit3"
																		  value="退出"
																		  onclick="javascript:location.href='userlogout.jsp';"/>
							<input type="button" name="Submit32" value="个人后台"
								   onclick="javascript:location.href='main.jsp';"/>
						</td>
					</tr>
				</table>
			</c:if>


        </div>
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
            paginationClass: 'pagination',
        });
    });
</script>

</body>
</html>

<script language=javascript src='js/My97DatePicker/WdatePicker.js'></script>
<script type="text/javascript" src="js/popup.js"></script>
<script language=javascript src='js/ajax.js'></script>

<%@page import="java.util.ArrayList" %>
<%@page import="java.util.HashMap" %>

