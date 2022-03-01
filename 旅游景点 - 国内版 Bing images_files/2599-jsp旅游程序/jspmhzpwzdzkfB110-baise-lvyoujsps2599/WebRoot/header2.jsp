<%@ page language="java" pageEncoding="UTF-8" %>


<ul>
    <li <% if (p == 1) {
        out.print("class='cureent'");
    }%>><a href="default.jsp">网站首页</a></li>

    <li <% if (p == 2) {
        out.print("class='cureent'");
    }%>><a href="dxDetailQian.action?id=1">系统简介</a></li>

    <li <% if (p == 3) {
        out.print("class='cureent'");
    }%>><a href="gonggaoManaQian.action">公告</a></li>


    <li <% if (p == 4) {
        out.print("class='cureent'");
    }%>><a href="jingdianManaQian.action">旅游景点</a></li>



    <li <% if (p == 5) {
        out.print("class='cureent'");
    }%>><a href="xianluManaQian.action">旅游线路</a></li>

    <li <% if (p == 6) {
        out.print("class='cureent'");
    }%>><a href="jiudianManaQian.action">酒店信息</a></li>

    <li <% if (p == 7) {
        out.print("class='cureent'");
    }%>><a href="chanpinManaQian.action">产品</a></li>

    <li <% if (p == 8) {
        out.print("class='cureent'");
    }%>><a href="meishiManaQian.action">美食</a></li>

    <li <% if (p == 9) {
        out.print("class='cureent'");
    }%>><a href="liuyanAddQian.jsp">我要留言</a></li>

    <li <% if (p == 9) {
        out.print("class='cureent'");
    }%>><a href="liuyanManaQian.action">留言信息</a></li>

    <li <% if (p == 9) {
        out.print("class='cureent'");
    }%>><a href="usersAddQian.jsp">用户注册</a></li>

    <li <% if (p == 9) {
        out.print("class='cureent'");
    }%>><a href="login.jsp">后台登录</a></li>

    <%-- <li><a href="default.jsp">网站首页</a></li>
     <li><a href="gonggaoManaQian.action">公告</a></li>
     <li><a href="userAddQian.jsp">用户注册</a></li>
     <li><a href="liuyanManaQian.action">留言信息</a></li>
     <li><a href="liuyanAddQian.jsp">在线留言</a></li>
     <li><a href="product.jsp">产品产示</a></li>
     <li><a href="shangpinManaQian.action">商品信息</a></li>
     <li><a href="about.jsp">系统简介</a></li>
     <li><a href="login.jsp">后台</a></li>--%>
</ul>