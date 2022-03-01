<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>

<%
    String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="pragma" content="no-cache"/>
    <meta http-equiv="cache-control" content="no-cache"/>
    <meta http-equiv="expires" content="0"/>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
    <meta http-equiv="description" content="This is my page"/>

    <link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css"/>

    <script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>

    <script language="javascript">
        function check() {
            var userPwReal = "${sessionScope.user.loginpw}";
            if (document.formPw.loginpw.value != userPwReal) {
                alert("原密码不正确");
                return;
            }

            if (document.formPw.loginpw1.value == "") {
                alert("新密码不能空");
                return;
            }
            if (document.getElementById("loginpw1").value != document.getElementById("loginpw2").value)
            {
                alert("两次输入密码不一致，请重新输入！");
                return ;
            }
            document.getElementById("indicator").style.display = "block";
            loginService.PwEdit(document.formPw.loginpw1.value, callback);
        }

        function callback(data) {
            document.getElementById("indicator").style.display = "none";
            alert("修改成功");
        }
    </script>
</head>

<body leftmargin="2" topmargin="9" background='<%=path %>/images/allbg.gif'>
<form method="post" action="<%=path %>/userPwEdit.action" name="formPw">
    <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" bgcolor="#CBD8AC"
           style="margin-bottom:8px">
        <tr bgcolor="#EEF4EA">
            <td colspan="2" background="<%=path %>/images/wbg.gif" class='title'><span>&nbsp;</span></td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                登录名：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="text" value="${sessionScope.user.loginname }" name="userName" style="width: 250px;"
                       disabled="disabled"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                原密码：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="password" name="loginpw" id="loginpw" style="width: 250px;"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                新密码：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="password" id="loginpw1" name="loginpw1" style="width: 250px;"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                确认密码：
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="password" id="loginpw2" name="loginpw2" style="width: 250px;"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="10%" bgcolor="#FFFFFF" align="right">
                &nbsp;
            </td>
            <td width="90%" bgcolor="#FFFFFF">
                <input type="button" value="修改" onclick="check()"/>
                &nbsp;&nbsp;&nbsp;
                <input type="reset" value="重置"/>
                <img id="indicator" src="<%=path %>/images/loading.gif" alt="Loading..." style="display:none"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
