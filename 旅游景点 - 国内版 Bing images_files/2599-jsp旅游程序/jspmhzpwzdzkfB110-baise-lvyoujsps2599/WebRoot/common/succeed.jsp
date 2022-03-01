<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <script type="text/javascript">

        javascript:alert('操作完成！继续操作！${requestScope.msg}');

        <s:if test="path!=null">
            document.location.href = "<%=path%>/<s:property value='path'/>";
        </s:if>
        <s:if test="path==null">
            history.back();
        </s:if>

        <%--<s:if test="message!=null">
        alert('操作完成！继续操作！${requestScope.msg}');
        alert("<s:property value='message'/>");
        </s:if>--%>

        <%--<s:if test="#request.msg!=null">
        alert('操作完成！继续操作！${requestScope.msg}');
        </s:if>--%>


    </script>
</head>

<body>

</body>
</html>
