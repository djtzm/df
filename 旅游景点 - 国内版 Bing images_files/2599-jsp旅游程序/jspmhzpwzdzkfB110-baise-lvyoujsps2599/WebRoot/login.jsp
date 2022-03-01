<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
%>

<html>
<head>
    <title>title</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <style type="text/css">
        <!--
        body {
            background-image: url(images/hsgbg.gif);
        }

        .STYLE3 {
            color: #528311;
            font-size: 12px;
        }

        .STYLE5 {
            color: #72AC27;
            font-size: 26pt;
        }

        .STYLE9 {
            color: #FFFFFF;
            font-size: 12px
        }

        -->
    </style>
</head>

<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
<script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
<script language="javascript">
    function check4() {
        if (document.form1.loginname.value == "") {
            alert("请输入用户名");
            document.form1.loginname.focus();
            return false;
        }
        if (document.form1.loginpw.value == "") {
            alert("请输入密码");
            document.form1.loginpw.focus();
            return false;
        }
        //document.getElementById("indicator").style.display="block";
        loginService.login4(document.form1.loginname.value, document.form1.loginpw.value, document.form1.type.value, document.form1.yzm.value, callback);
    }

    function callback(data) {
        //document.getElementById("indicator").style.display="none";
        if (data == "yanzhenmacuowu") {
            alert("验证码输入错误");
        }
        if (data == "no") {
            alert("用户名或密码错误");
        }
        if (data == "yes") {
            alert("通过验证,系统登录成功");
            window.location.href = "<%=path %>/loginSuccess.jsp";
        }

    }

    function check2() {
        if (document.form1.loginname.value == "") {
            alert("请输入用户名");
            document.form1.loginname.focus();
            return false;
        }
        if (document.form1.loginpw.value == "") {
            alert("请输入密码");
            document.form1.loginpw.focus();
            return false;
        }
        if (document.form1.rand.value == "") {
            alert("请输入密码");
            document.form1.rand.focus();
            return false;
        }
        //document.getElementById("indicator").style.display="block";
        loginService.login2(document.form1.loginname.value, document.form1.loginpw.value, 0, document.form1.rand.value, callback);
    }

    function callback2(data) {
        //document.getElementById("indicator").style.display="none";
        if (data == "no") {
            alert("用户名或密码错误");
        }
        if (data == "yes") {
            alert("通过验证,系统登录成功");
            window.location.href = "<%=path %>/loginSuccess.jsp";
        }
    }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<table width="800" height="630" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
        <td height="134" valign="bottom"><p>&nbsp;</p></td>
    </tr>
    <tr>
        <td height="496" valign="top">
            <table width="800" height="496" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="246" background="images/hsgbg2.gif">
                        <table width="74%" height="51" border="0" align="center">
                            <tr>
                                <td>
                                    <div style="font-family:宋体; color:#FFFFFF;  WIDTH: 100%; FONT-WEIGHT: bold; FONT-SIZE: 32px; margin-top:5pt">

                                        <div align="right">后台登录</div>

                                    </div>
                                </td>
                            </tr>
                        </table>
                        <p>&nbsp;</p>
                        <p>&nbsp;</p>
                        <table width="100%" height="112" border="0" cellpadding="0" cellspacing="0">
                            <tr>
                                <td width="48%">&nbsp;</td>
                                <td width="52%">
                                    <form action="" method="post" name="form1"
                                          style="display: inline">
                                        <table width="205" border="0" align="center" cellpadding="0" cellspacing="0">
                                            <tr>
                                                <td width="44" height="30"><span class="STYLE9">用户:</span></td>
                                                <td height="30" colspan="2"><input name="loginname" type="text"
                                                                                   id="loginname"
                                                                                   style="width:100px; height:16px; border:solid 1px #000000; color:#666666">
                                                </td>
                                            </tr>
                                            <tr>
                                                <td height="30"><span class="STYLE9">密码:</span></td>
                                                <td height="30" colspan="2"><input name="loginpw" type="password" id="loginpw"
                                                                                   style="width:100px; height:16px; border:solid 1px #000000; color:#666666">
                                                </td>
                                            </tr>
                                            <tr style="">
                                                <td height="30"><span class="STYLE9">权限:</span></td>
                                                <td height="30" colspan="2">
                                                <select name="type" id="type">
                                                    <option value="0">管理员</option>
                                                    <%--<option value="1">企业</option>--%>
                                                    <option value="2">用户</option>
                                                   <%-- <option value="3">人力</option>--%>
                                                </select>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td height="30"><span class="STYLE9">验证码:</span></td>
                                                <td width="59" height="30"><input name="yzm" type="text"
                                                                                  id="yzm"
                                                                                  style=" height:20px; border:solid 1px #000000; color:#666666; width:50px"/>
                                                <td width="102"><a href="javascript:loadimage();"><img alt="看不清请点我！"
                                                                                                       name="randImage"
                                                                                                       id="randImage"
                                                                                                       src="image.jsp"
                                                                                                       width="60"
                                                                                                       height="20"
                                                                                                       border="1"
                                                                                                       align="absmiddle">
                                                </a></td>
                                            </tr>
                                            <tr>
                                                <td height="30" colspan="3"><input type="button" name="Submit"
                                                                                   value="登陆" onClick="check4()"
                                                                                   style="background:url(images/the_formbtn.gif) no-repeat;color:#000000;width:80px;height: 24px; border:0px;line-height:24px; font-size:12px;margin-right: 5px; cursor:pointer">
                                                    <input type="reset" name="Submit2" value="重置"
                                                           style="background:url(images/the_formbtn.gif) no-repeat;color:#000000;width:80px;height: 24px; border:0px;line-height:24px; font-size:12px;margin-right: 5px; cursor:pointer">
                                                </td>
                                            </tr>
                                        </table>
                                    </form>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>
</body>
</html>