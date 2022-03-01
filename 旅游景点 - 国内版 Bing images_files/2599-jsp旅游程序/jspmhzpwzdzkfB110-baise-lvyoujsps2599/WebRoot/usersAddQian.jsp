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
                if (document.getElementById("loginpw").value != document.getElementById("loginpw2").value) 
                {
                    alert("两次输入密码不一致，请重新输入！");
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

            <h2>用户注册 <b></b></h2>

            <form action="<%=path %>/usersAddQian.action" method="post" name="formAdd"
                  id="formAdd">
                <table width="98%" height="516" border="1" align="center" cellpadding="3" cellspacing="1"
                       bordercolor="#00CC99" style="border-collapse:collapse">

                    						<tr>
							<td>
								用户名称:
						    </td>

							<td>
								<input type="text" name="loginname" id="loginname" size="70"/>
							</td>

						</tr>
						<tr>
							<td>
								密码:
						    </td>

							<td>
								<input type="password" name="loginpw" id="loginpw" size="70"/>
							</td>

						</tr>
						<tr>
							<td>
								确认密码:
						    </td>

							<td>
								<input type="password" name="loginpw2" id="loginpw2" size="70"/>
							</td>

						</tr>
						<tr>
							<td>
								姓名:
						    </td>

							<td>
								<input type="text" name="xingming" id="xingming" size="70"/>
							</td>

						</tr>
						<tr>
							<td>
								性别:
						    </td>

						    <td>
						        <select name="xingbie" id="xingbie"
										style=" height:19px; border:solid 1px #000000; color:#666666" >
									<option value="男">男</option>
									<option value="女">女</option>

				                </select>
						    </td>

						</tr>
						<tr>
							<td>
								年龄:
						    </td>

							<td>
								<input type="text" name="nianling" id="nianling" size="70"/>
							</td>

						</tr>
						<tr>
							<td>
								地址:
						    </td>

							<td>
								<input type="text" name="address" id="address" size="70"/>
							</td>

						</tr>
						<tr>
							<td>
								电话:
						    </td>

							<td>
								<input type="text" name="dianhua" id="dianhua" size="70"/>
							</td>

						</tr>
						<tr style="display: none">
														<td>
								审核:
						    </td>

													    <td>
						        <select name="shenhe" id="shenhe"
										style=" height:19px; border:solid 1px #000000; color:#666666" >
									<option value="yes">yes</option>
									<%--<option value="no">no</option>--%>

				                </select>
						    </td>

						</tr>
						<tr>
							<td>
								类型:
						    </td>

						    <td>
						        <select name="type" id="type"
										style=" height:19px; border:solid 1px #000000; color:#666666" onchange="typechange()">
									<%--<option value="0">管理</option>
									<option value="1">老师</option>--%>
									<option value="2">用户</option>
									<%--<option value="3">家长</option>
									<option value="4">班主任</option>--%>
				                </select>
						    </td>

						</tr>
						<tr>
							<td>
								类型名称:
						    </td>

						    <td>
						        <input type="text" name="typename" id="typename" value="" readonly="readonly" size="70"/>
						    </td>

						</tr>


                    <tr>
                        <td>&nbsp;</td>
                        <td colspan="2">
                            <input type="button" value="提交" onclick="check()"/>&nbsp;
                            <input type="button" value="返回" onClick="javascript:history.back()"/>

                            <%--<input type="reset" name="Submit22" value="重置"/>--%>
                        </td>
                    </tr>
                </table>
            </form>


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

