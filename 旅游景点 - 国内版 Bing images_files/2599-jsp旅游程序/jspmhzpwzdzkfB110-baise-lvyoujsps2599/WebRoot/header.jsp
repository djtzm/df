<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK" %>

<script type='text/javascript' src='./dwr/interface/loginService.js'></script>
<script type='text/javascript' src='./dwr/engine.js'></script>
<script type='text/javascript' src='./dwr/util.js'></script>
<script language="javascript">
    function check4() {
        if (document.formlogin.loginname.value == "") {
            alert("请输入用户名");
            document.formlogin.loginname.focus();
            return false;
        }
        if (document.formlogin.loginpw.value == "") {
            alert("请输入密码");
            document.formlogin.loginpw.focus();
            return false;
        }
        if (document.formlogin.yzm.value == "") {
            alert("请输入密码");
            document.formlogin.yzm.focus();
            return false;
        }

        loginService.login4(document.formlogin.loginname.value, document.formlogin.loginpw.value, document.formlogin.type.value, document.formlogin.yzm.value, callback);
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
            window.location.href = "./default.jsp";
        }

    }

    function userLogout()
    {
        loginService.userLogout(callback_logout);
    }

    function callback_logout(data)
    {
        alert("成功退出系统");
        window.location.href="./default.jsp";
    }

</script>

<div class="header_wrapper">
    <div class="wrapper">
        <div class="header clearfix">


            <div>
                <c:if test="${sessionScope.user==null}">

                    <table height="30" border="0" cellpadding="0" cellspacing="0">

                            <tr>
                                <%--<td height="30" align="left">用户名
                                    <input name="loginname" type="text" id="loginname2" size="10"
                                           style=" height:19px; border:solid 1px #000000; color:#666666">
                                    密码
                                    <input name="loginpw" type="password" id="loginpw2" size="10"
                                           style=" height:19px; border:solid 1px #000000; color:#666666">

                                    <select name="type" id="type"
                                            style="width:100px; height:20px; border:solid 1px #000000; color:#666666">
                                        <option value="2">用户</option>
                                        <option value="0">管理员</option>
                                    </select>
                                    验证码
                                    <input name="yzm" type="text" id="yzm"
                                           style=" height:20px; border:solid 1px #000000; color:#666666; width:50px"/></td>
                                <td align="left" style="padding-left:3px; padding-right:3px;"><a
                                        href="javascript:loadimage();"><img alt="看不清请点我！" name="randImage" id="randImage"
                                                                            src="image.jsp" width="60" height="20"
                                                                            border="1" align="absmiddle"/> </a></td>
                                <td align="left"><input type="submit" name="Submit3" value="登陆"
                                                        style=" border:solid 1px #000000; color:#666666; width:60px; height:20px;"
                                                        onclick="check4()"/>
                                        &lt;%&ndash;<input type="button" name="Submit32" value="注册"
                                               style=" border:solid 1px #000000; color:#666666; width:60px; height:20px;"
                                               onclick="location.href='userAddQian.jsp';"/>&ndash;%&gt;
                                    <input type="button" name="Submit3" value="后台登录"
                                           onclick="location.href='login.jsp';"
                                           style=" border:solid 1px #000000; color:#666666;width:60px; height:20px; "/>

                                </td>--%>
                                    <td align="right" style="padding-left: 800px"><input type="button" name="Submit32" value="用户登陆"
                                                             style=" border:solid 1px #000000; color:#666666; width:60px; height:20px;"
                                                             onClick="javascript:location.href='userlog.jsp';"/>


                                    </td>
                            </tr>

                    </table>
                </c:if>
                <c:if test="${sessionScope.user!=null}">
                    <table height="30" border="0" cellpadding="0" cellspacing="0">
                        <tr>
                            <td height="30" align="left" valign="middle" style="padding-left: 600px">
                                用户名:${sessionScope.user.loginname}
                                ；您的权限:
                                    ${sessionScope.user.typename}
                                <input type="button" name="Submit" value="退出" onClick="userLogout()"
                                       style=" border:solid 1px #000000; color:#666666; width:60px; height:20px;">
                                <input type="button" name="Submit2" value="个人后台" onClick="location.href='main.jsp';"
                                       style=" border:solid 1px #000000; color:#666666; width:60px; height:20px;"></td>
                        </tr>
                    </table>
                </c:if>
            </div>
            <div class="logo">
                <a href=""><img src="qtimages/logo4.png" class="png" width="150" height="52" alt=""/></a>
            </div>
            <div class="title">
                <div style="text-shadow:#CCCCCC 3px 0 0,#33CC33 0 1px 0,#33CC33 1px 0 0,#33CC33 0 -1px 0; font-size:22px;width: 450px;">
                    特色旅游网站
                </div>
            </div>
            <div class="tel">TEL: 17836911316</div>

        </div>
    </div>
</div>

<script type="text/javascript">

    function loadimage() {
        document.getElementById("randImage").src = "image.jsp?" + Math.random();
    }



</script>
