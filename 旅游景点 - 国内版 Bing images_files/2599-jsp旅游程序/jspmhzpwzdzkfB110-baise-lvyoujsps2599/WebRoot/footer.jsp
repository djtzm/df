<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page isELIgnored="false" %>

<div class="footer_wrapper">
    <div class="wrapper">
        <div class="footer_con clearfix">
            <div class="footer_manu_con clearfix">
                <div class="footer_manu clearfix">
                    <%--<dl>
                        <dt>联系我们</dt>
                        <font color="#FFFFFF"><%
                            HashMap mbt = new CommDAO().getmaps("leibie", "联系我们", "dx");
                            out.print(mbt.get("content"));
                        %></font>
                    </dl>--%>
                    <dl>
                        <dt>友情链接</dt>

                        <dd>
                            <c:forEach items="${sessionScope.lianjieList }" var="lianjie" varStatus="ss">

                            <a href="${lianjie.url }"
                               target="_blank">${lianjie.name }
                            </a>
                            </c:forEach>
                        </dd>
                    </dl>
                </div>

            </div>
            <div class="footer_code">
                <dl>
                   <%-- <dd><img src="qtimages/ewm.png" width="94" height="94"></dd>--%>
                   <%-- <dd>xxxxxx</dd>--%>
                </dl>
            </div>
        </div>
    </div>
</div>