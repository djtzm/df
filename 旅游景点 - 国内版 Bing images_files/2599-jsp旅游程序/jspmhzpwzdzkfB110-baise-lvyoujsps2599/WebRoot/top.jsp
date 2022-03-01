<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>

<%
    String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD id=Head1>
    <TITLE>无标题页</TITLE>
    <script language="javascript" src="images/qkjs.js"></script>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <STYLE type=text/css>
        * {
            FONT-SIZE: 12px;
            COLOR: white
        }

        #logo {
            COLOR: white
        }

        #logo A {
            COLOR: white
        }

        FORM {
            MARGIN: 0px
        }
    </STYLE>
    <script language='javascript'>
        function logout() {
            if (confirm("确定要退出本系统吗??")) {
                window.parent.location = "<%=path %>/login.jsp";
            }
        }

        function logout2() {

            window.parent.location = "<%=path %>/default.jsp";

        }
    </script>
    <META content="MSHTML 6.00.2900.5848" name=GENERATOR>
</HEAD>
<BODY style="BACKGROUND-IMAGE: url(images/bg.gif); MARGIN: 0px; BACKGROUND-REPEAT: repeat-x">

<DIV id=logo
     style="BACKGROUND-IMAGE: url(images/logo.png); BACKGROUND-REPEAT: no-repeat">
    <DIV
            style="PADDING-RIGHT: 15px; BACKGROUND-POSITION: right 10%; DISPLAY: block; PADDING-LEFT: 0px; BACKGROUND-IMAGE: url(images/bg_banner_menu.gif); PADDING-BOTTOM: 0px; PADDING-TOP: 3px; BACKGROUND-REPEAT: no-repeat; HEIGHT: 30px; TEXT-ALIGN: right">
        <span style="PADDING-RIGHT: 2px"><a href="default.jsp"
                                            target="_parent">返回首页</a> 当前用户：${sessionScope.user.loginname}，权限：${sessionScope.user.typename}</span><IMG
            src="images/menu_seprator.gif" align=absMiddle> <A id=HyperLink3
                                                               href="logout.jsp" target="_parent">退出</A></DIV>
    <DIV style="DISPLAY: block; HEIGHT: 54px"></DIV>
    <DIV
            style="BACKGROUND-IMAGE: url(images/bg_nav.gif); BACKGROUND-REPEAT: repeat-x; HEIGHT: 30px">
        <TABLE cellSpacing=0 cellPadding=0 width="100%">
            <TBODY>
            <TR>
                <TD>
                    <DIV><IMG src="images/nav_pre.gif" align=absMiddle>  <SPAN
                            id=lblBra>后台管理</SPAN>
                    </DIV>
                </TD>
               <%-- <TD align=right width="70%"><SPAN style="PADDING-RIGHT: 50px">今天是：<SCRIPT
                        language=javascript>setCalendar();</SCRIPT><IMG
                        src="images/menu_seprator.gif" align=absMiddle> <SPAN
                        id=clock></SPAN></SPAN>
                </TD>--%>
            </TR>
            </TBODY>
        </TABLE>
    </DIV>
</DIV>

</BODY>
</HTML>
