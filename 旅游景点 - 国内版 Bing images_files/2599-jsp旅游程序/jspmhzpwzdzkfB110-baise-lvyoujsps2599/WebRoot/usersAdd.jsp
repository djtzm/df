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

	<LINK href="css.css" type=text/css rel=stylesheet>
	<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js" charset="gb2312"></script>
	<script type="text/javascript" src="js/popup.js"></script>


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
			                if(document.getElementById("loginname").value=="")
                {
                    alert("please input:用户名称");
                    return false;
                }

                if(document.getElementById("loginpw").value=="")
                {
                    alert("please input:密码");
                    return false;
                }

                if(document.getElementById("xingming").value=="")
                {
                    alert("please input:姓名");
                    return false;
                }

                if(document.getElementById("nianling").value=="")
                {
                    alert("please input:年龄");
                    return false;
                }

                if(document.getElementById("address").value=="")
                {
                    alert("please input:地址");
                    return false;
                }

                if(document.getElementById("dianhua").value=="")
                {
                    alert("please input:电话");
                    return false;
                }

                var dianhua = document.getElementById("dianhua");
                if(dianhua.value!="")
                {
                    if(/^[1][3,4,5,6,7,8,9][0-9]{9}$/.test(dianhua.value))
                    {
                    }
                    else
                    {
                        alert("必需手机格式");
                        return false;
                    }
                }
                if(document.getElementById("type").value=="")
                {
                    alert("please input:类型");
                    return false;
                }

                if(document.getElementById("typename").value=="")
                {
                    alert("please input:类型名称");
                    return false;
                }


			/*if(document.formAdd.biaoti.value=="")
            {
                alert("请输入标题：");
                return false;
            }*/

			document.getElementById("formAdd").submit();
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
			//alert("typechange start");
			//document.formAdd.typename.value=document.formAdd.type.text;
			var obj = document.getElementById("type"); //定位id				//document.getElementById(id)
			var index = obj.selectedIndex; // 选中索引
			var text = obj.options[index].text; // 选中索引值
			//alert(index);
			//alert(text);
			//var text = obj.options[index].text; // 选中文本     输出张三等汉字信�?
			//var value = obj.options[index].value; // 选中     输出zhangsan等英文信�?
			//obj.options[index].text = obj.options[index].value;
			document.getElementById("typename").value = text; //okok
			//document.formAdd.typename.value=text; //error
			//alert("typechange end");
		}
		function init()
		{
			typechange();
			/*typechange();*/
			
			/*leibieSelect();*/
		}

		
		/*function leibieSelect()
        {
            loginService.leibieSelect(leibiecallBack);
        }
        function leibiecallBack(data)
        {
            DWRUtil.addOptions("leibieid",data,"id","mingcheng");
        }*/
	</script>
</head>





<body onload="init()" >
<form action="<%=path %>/usersAdd.action" method="post" id="formAdd" name="formAdd" >
	用户添加
	<br><br>
	<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
		   style="border-collapse:collapse">

							    <tr>
							<td>
								用户名称:
						    </td>

							<td>
								<input type="text" name="loginname" id="loginname" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								密码:
						    </td>

							<td>
								<input type="text" name="loginpw" id="loginpw" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								姓名:
						    </td>

							<td>
								<input type="text" name="xingming" id="xingming" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								性别:
						    </td>

						    <td>
						        <select name="xingbie" id="xingbie"
										style=" height:19px; border:solid 1px #000000; color:#666666" >
									<option value="男">男</option>
									<option value="女">女</option>

				                </select>
						    </td>

						</tr>
					    <tr>
							<td>
								年龄:
						    </td>

							<td>
								<input type="text" name="nianling" id="nianling" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								地址:
						    </td>

							<td>
								<input type="text" name="address" id="address" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								电话:
						    </td>

							<td>
								<input type="text" name="dianhua" id="dianhua" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								审核:
						    </td>

						    <td>
						        <select name="shenhe" id="shenhe"
										style=" height:19px; border:solid 1px #000000; color:#666666" >
									<option value="yes">yes</option>
									<option value="no">no</option>

				                </select>
						    </td>

						</tr>
					    <tr>
							<td>
								类型:
						    </td>

						    <td>
						        <select name="type" id="type"
										style=" height:19px; border:solid 1px #000000; color:#666666" onchange="typechange()">
									<option value="0">管理</option>
									<%--<option value="1">老师</option>--%>
									<option value="2">用户</option>

				                </select>
						    </td>

						</tr>
					    <tr>
							<td>
								类型名称:
						    </td>

						    <td>
						        <input type="text" name="typename" id="typename" value="" readonly="readonly" size="70"/>
						    </td>

						</tr>


		<tr>
			<td>&nbsp;</td>
			<td>
				<input type="button" name="Submit" value="提交" style='border:solid 1px #000000; color:#666666' onclick="check()"/>
				<input type="button" value="返回" style='border:solid 1px #000000; color:#666666' onClick="javascript:history.back()" />
				<input type="reset" name="Submit2" value="重置" style='border:solid 1px #000000; color:#666666'/></td>
		</tr>
	</table>
</form>

</body>
</html>


<script language=javascript src='js/ajax.js'></script>

<%@page import="java.util.ArrayList" %>
<%@page import="java.util.HashMap" %>



