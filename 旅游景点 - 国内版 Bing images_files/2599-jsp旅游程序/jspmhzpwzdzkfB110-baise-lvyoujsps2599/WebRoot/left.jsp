<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
    <TITLE>TITLE</TITLE>
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <STYLE type=text/css>
        {
            FONT-SIZE: 12px
        }
        #menuTree A {
            COLOR: #566984;
            TEXT-DECORATION: none
        }
    </STYLE>
    <SCRIPT src="images/TreeNode.js" type=text/javascript></SCRIPT>
    <SCRIPT src="images/Tree.js" type=text/javascript></SCRIPT>
    <META content="MSHTML 6.00.2900.5848" name=GENERATOR>
</HEAD>
<BODY style="BACKGROUND-POSITION-Y: -120px; BACKGROUND-IMAGE: url(images/bg.gif); BACKGROUND-REPEAT: repeat-x">
<TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%">
    <TBODY>
    <TR>
        <TD width=10 height=29><IMG src="images/bg_left_tl.gif"></TD>
        <TD
                style="FONT-SIZE: 18px; BACKGROUND-IMAGE: url(images/bg_left_tc.gif); COLOR: white; FONT-FAMILY: system">
            Main
            Menu
        </TD>
        <TD width=10><IMG src="images/bg_left_tr.gif"></TD>
    </TR>
    <TR>
        <TD style="BACKGROUND-IMAGE: url(images/bg_left_ls.gif)"></TD>
        <TD id=menuTree
            style="PADDING-RIGHT: 10px; PADDING-LEFT: 10px; PADDING-BOTTOM: 10px; PADDING-TOP: 10px; HEIGHT: 100%; BACKGROUND-COLOR: white"
            vAlign=top></TD>
        <TD style="BACKGROUND-IMAGE: url(images/bg_left_rs.gif)"></TD>
    </TR>
    <TR>
        <TD width=10><IMG src="images/bg_left_bl.gif"></TD>
        <TD style="BACKGROUND-IMAGE: url(images/bg_left_bc.gif)"></TD>
        <TD width=10><IMG
                src="images/bg_left_br.gif"></TD>
    </TR>
    </TBODY>
</TABLE>
<SCRIPT type=text/javascript>
    var tree = null;
    var root = new TreeNode('系统菜单');
    var a1;
    var b1;
    a1 = new TreeNode('用户管理');
    b1 = new TreeNode('用户添加', 'usersAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('用户查询', 'usersMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('修改密码', 'userPw.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('修改资料', 'usersSet2.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    root.add(a1);


    a1 = new TreeNode('轮播管理');
    b1 = new TreeNode('轮播添加', 'lunboAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('轮播查询', 'lunboMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    root.add(a1);

    a1 = new TreeNode('公告管理');
    b1 = new TreeNode('公告添加', 'gonggaoAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('公告查询', 'gonggaoMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    root.add(a1);

    a1 = new TreeNode('类别管理');
    b1 = new TreeNode('类别添加', 'leibieAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('类别查询', 'leibieMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    root.add(a1);


    a1 = new TreeNode('酒店管理');

    b1 = new TreeNode('酒店添加', 'jiudianAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('酒店查询', 'jiudianMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    b1 = new TreeNode('酒店预定查询', 'yudingMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    root.add(a1);

    a1 = new TreeNode('景点管理');

    b1 = new TreeNode('景点添加', 'jingdianAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('景点查询', 'jingdianMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    b1 = new TreeNode('收藏查询', 'shoucangMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('评论查询', 'pinglunMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    root.add(a1);

    a1 = new TreeNode('线路预约管理');

    b1 = new TreeNode('线路添加', 'xianluAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('线路查询', 'xianluMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    b1 = new TreeNode('线路预约查询', 'yuyueMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    root.add(a1);

    a1 = new TreeNode('美食管理');

    b1 = new TreeNode('美食添加', 'meishiAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('美食查询', 'meishiMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    root.add(a1);



    a1 = new TreeNode('特色产品管理');

    b1 = new TreeNode('特色产品添加', 'chanpinAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('特色产品查询', 'chanpinMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    root.add(a1);


    a1 = new TreeNode('系统管理');

    b1 = new TreeNode('友情连接添加', 'lianjieAdd.jsp', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    b1 = new TreeNode('友情连接查询', 'lianjieMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);

    b1 = new TreeNode('系统介绍管理', 'dxMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    
    b1 = new TreeNode('留言管理', 'liuyanMana.action', 'tree_node.gif', null, 'tree_node.gif', null);
    a1.add(b1);
    root.add(a1);

    tree = new Tree(root);
    tree.show('menuTree')
</SCRIPT>
</BODY>
</HTML>
