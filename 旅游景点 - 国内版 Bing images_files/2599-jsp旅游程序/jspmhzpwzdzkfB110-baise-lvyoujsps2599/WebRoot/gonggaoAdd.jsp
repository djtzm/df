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
			                if(document.getElementById("biaoti").value=="")
                {
                    alert("please input:标题");
                    return false;
                }

                if(document.getElementById("tupian").value=="")
                {
                    alert("please input:图片");
                    return false;
                }

                if(document.getElementById("shijian").value=="")
                {
                    alert("please input:时间");
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
<form action="<%=path %>/gonggaoAdd.action" method="post" id="formAdd" name="formAdd" >
	公告新闻添加
	<br><br>
	<table width="100%" border="1" align="center" cellpadding="3" cellspacing="1" bordercolor="#00FFFF"
		   style="border-collapse:collapse">

							    <tr>
							<td>
								标题:
						    </td>

							<td>
								<input type="text" name="biaoti" id="biaoti" size="70"/>
							</td>

						</tr>
					    <tr>
							<td>
								内容:
						    </td>

							<td width="80%" bgcolor="#FFFFFF" align="left">
								<textarea name="neirong" style="width:670px;height:200px;visibility:;"></textarea>
							</td>

						</tr>
					    <tr>
							<td>
								图片:
						    </td>

							<td>
								<input type="text" name="tupian" id="tupian" size="50" readonly="readonly"/>
						      <!--  <input type="button" value="上传" onclick="up()"/>  -->
						        <input type="button" value="上传" onclick="upx('tupian')"/>
						    </td>

						</tr>
					    <tr>
							<td>
								时间:
						    </td>

						    <td>
						        <input type="text" name="shijian" id="shijian" size="70" value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date())%>"/>
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



