<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false" %>
<%String path = request.getContextPath();%>

<!DOCTYPE HTML>
<html>
<head>
    <title>&nbsp;</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

    <style rel="stylesheet" type="text/css">
        .c1-bline {
            border-bottom: #999 1px dashed;
            border-top: 1px;
        }

        .f-right {
            float: right
        }

        .f-left {
            float: left
        }

        .clear {
            clear: both
        }
    </style>

    <link rel="stylesheet" type="text/css" href="<%=path %>/css/metinfo_ui.css" id="metuimodule" data-module="10001"/>

    <script src="<%=path %>/js/jQuery1.7.2.js" type="text/javascript"></script>
    <script src="<%=path %>/js/metinfo_ui.js" type="text/javascript"></script>
    <script type="text/javascript">
        function go(index) {
            window.location.href = "<%=path %>/index.action?index=" + index;
        }
    </script>
</head>

<body>
<jsp:include flush="true" page="/qttop.jsp"></jsp:include>


<div class="index inner">
    <table style="margin-left: -3px;">
        <tr>
            <td valign="top">
                <table>
                    <tr>
                        <td colspan="2" valign="top">
                            <div class="aboutus style-1">
                                <h3 class="title">
                                    <span class='myCorner' data-corner='top 5px'>操作提示</span>
                                    <!-- <a href="#" class="more" >更多>></a> -->
                                </h3>
                                <div class="active editor clear contour-1">
                                    <%-- <c:out value="${requestScope.msgqian}" escapeXml="false"></c:out> --%>
                                    ${requestScope.msgqian}
                                    <script>javascript:alert('操作成功！继续操作！');
                                    history.back();</script>
                                    <div class="clear"></div>
                                </div>
                            </div>
                        </td>
                    </tr>


                </table>
            </td>
            <td>&nbsp;</td>
            <td valign="top">

            </td>
        </tr>
    </table>


    <div class="clear p-line"></div>
    <!-- <div class="index-product style-2">
        <h3 class='title myCorner' data-corner='top 5px'>
            <span>软件产品</span>
            <a href="product/" title="链接关键词" class="more">更多>></a>
        </h3>
        <div class="active clear">
            sds
        </div>
    </div> -->
</div>

<div style="background: #673ab7;height: 30px;margin-top: 15px;">
    <div class="inner">
        <center>
            <jsp:include flush="true" page="/qtdown.jsp"></jsp:include>
        </center>
    </div>
</div>


</body>
</html>
