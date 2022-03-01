<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>

<%
	String path = request.getContextPath();
%>
<%
	String d = request.getParameter("d");
	if(d!=null && d.equals("1"))
	{
		response.setHeader("Content-disposition","attachment; filename=daochu.xls");
	}
//获取并判断浏览器信息
	String Agent = request.getHeader("User-Agent");
	if(Agent.contains("Chrome"))
	{
		System.out.println("Chrome");
		request.setAttribute("brtype", "cbr");
	}
	else
	{
		System.out.println("!Chrome");
		request.setAttribute("brtype", "obr");
	}
	System.out.println(Agent);
%>

<html>
<head>
	<title>title</title>

	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>
	<LINK href="css.css" type=text/css rel=stylesheet>

	<script type="text/javascript" src="<%=path %>/js/popup.js"></script>
	<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
	<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
	<script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
	<script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
	<%--<script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>--%>
	<script language=javascript src='js/My97DatePicker/WdatePicker.js'></script>
	<%--<script type="text/javascript" src="<%=path %>/js/riqi.js"></script>--%>
	<script language="javascript">
		//计算两个日期的天数差
		function dateDiff(){

			if(document.getElementById("kaishiriqi").value=="")
			{
				alert("please input:起始日期");
				return false;
			}

			if(document.getElementById("jieshuriqi").value=="")
			{
				alert("please input:结束日期");
				return false;
			}
			var firstriqi = document.getElementById("kaishiriqi").value;
			var secondriqi = document.getElementById("jieshuriqi").value;
			var first = new Date(firstriqi);
			var second = new Date(secondriqi);
			var diff = Math.abs(first.getTime() - second.getTime())
			var result = parseInt(diff / (1000 * 60 * 60 * 24));
			//document.getElementById("jine").value = result*${requestScope.kefang.jiage };
		}
		function check()
		{
			                if(document.formAdd.shijian.value=="")
                {
                    alert("please input:时间");
                    return false;
                }


			/*if(document.formAdd.biaoti.value=="")
            {
                alert("请输入标题：");
                return false;
            }*/

			document.formAdd.submit();
		}
		function up()
		{
			var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
			pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
			pop.setContent("title","文件上传");
			pop.build();
			pop.show();
		}
		function upx(id)
		{
			//window.open("<%=path %>/upload/upload.jsp?id="+id, "_self");
			var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
			pop.setContent("contentUrl","<%=path %>/upload/upload.jsp?id="+id);
			pop.setContent("title","文件上传");
			pop.build();
			pop.show();
		}
		function typechange()
		{
			//document.formAdd.typename.value=document.formAdd.type.text;
			var obj = document.getElementById("type"); //定位id
			//document.getElementById(id)
			var index = obj.selectedIndex; // 选中索引
			//var text = obj.options[index].text; // 选中文本     输出张三等汉字信息
			//var value = obj.options[index].value; // 选中值        输出zhangsan等英文信息
			//obj.options[index].text = obj.options[index].value;
			document.formAdd.typename.value=obj.options[index].text;
		}
		function init()
		{
			
			/*typechange();*/
				           jingdianSelect();

			/*leibieSelect();*/
		}

			        function jingdianSelect()
	        {
	            loginService.jingdianSelect(jingdiancallBack);
	        }
	        function jingdiancallBack(data)
	        {
	            DWRUtil.addOptions("jingdianid",data,"id","biaoti");
	        }
	        function usersSelect()
	        {
	            loginService.usersSelect(userscallBack);
	        }
	        function userscallBack(data)
	        {
	            DWRUtil.addOptions("usersid",data,"id","loginname");
	        }


	</script>
</head>


<body onload="init()" >

<form action="<%=path %>/shoucangSet.action" method="post" name="formAdd" >
	收藏修改
	<br><br>

	<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
		   style="border-collapse:collapse">

							    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								时间:
						    </td>

						    <td width="90%" bgcolor="#FFFFFF" align="left">
						        <input type="text" name="shijian" id="shijian" size="90" value="${requestScope.shoucang.shijian }" />
						    </td>

						</tr>
					    <tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								收藏景点:
						    </td>

							<td width="90%" bgcolor="#FFFFFF" align="left">
						        <select name="jingdianid" id="jingdianid" style="width: 280px;">
									<option value="${requestScope.shoucang.jingdian.id }">${requestScope.shoucang.jingdian.biaoti }</option>
								</select>
						    </td>

						</tr>
						<tr>
							<td width="10%" bgcolor="#FFFFFF" align="right">
								收藏用户:
						    </td>


                            <td width="90%" bgcolor="#FFFFFF" align="left">
                                <select name="usersid" id="usersid" style="width: 280px;">
                                    <option value="${requestScope.shoucang.users.id }">${requestScope.shoucang.users.loginname }</option>
                                </select>
                            </td>

						</tr>


		<tr>
			<td>&nbsp;</td>
			<td>
				<input type="hidden" name="id" value="${requestScope.shoucang.id }"/>
				<input type="button" value="提交" onclick="check()"/>&nbsp;
				<input type="button" value="返回"  onClick="javascript:history.back()" />
				<input type="reset" value="重置"/>&nbsp;
			</td>
		</tr>
	</table>
</form>

</body>
</html>


