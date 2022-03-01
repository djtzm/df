<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page isELIgnored="false" %>

<%
    int p = 1;
%>
<!doctype html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>title</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/common.css">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" type="text/css" href="css/responsive.css">

    <link rel="stylesheet" type="text/css" href="css/sub.css">

    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
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
                <img src="./${lunbo.image }" height="350" width="2800">
            </c:forEach>
        </div>
    </div>
</div>

<div class="wrapper">
    <div class="about_con clearfix">
        <div class="about_logo" style="text-align:center;"><img src="qtimages/about_logo.jpg"></div>
        <br>
        <div class="show">
            <c:out value="${fn:substring(jieshao.neirong, 0, 160)}" escapeXml="false"></c:out>

        </div>
    </div>
</div>
<script type="text/javascript">
    var url = "./gonggaoManaQian.action";
    window.location.href = url;
</script>
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
            pause: 3000,
            generateNextPrev: true,
            hoverPause: true,
            directionNav: true,
            pauseOnAction: false
        });
    });
</script>