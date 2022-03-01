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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
        <script type="text/javascript" src="<%=path %>/js/popup.js"></script>
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
		<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
	    <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
	    <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
		<script type="text/javascript" src="<%=path %>/My97DatePicker/WdatePicker.js"></script>
		<script type="text/javascript" src="<%=path %>/js/riqi.js"></script>

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
            //导出信息
            function daochu()
           {
              var url="<%=path %>/usersChakan.action?d=1";
              window.location.href=url;
           }
           //上传文件
           function up()
		    {
		        var pop=new Popup({ contentType:1,isReloadOnClose:false,width:400,height:200});
	            pop.setContent("contentUrl","<%=path %>/upload/upload.jsp");
	            pop.setContent("title","文件上传");
	            pop.build();
	            pop.show();
	            //另一红上传方式可以参照upx
		    }
          	//添加信息
           function usersAdd()
           {
              var url="<%=path %>/usersAdd.jsp";
              window.location.href=url;
           }
           //删除信息
           function usersDel(id)
           {
               if(confirm('您确定删除吗?'))
               {
                   window.location.href="<%=path %>/usersDel.action?id="+id+"&path=usersMana.action";
               }
           }
           //修改信息
           function usersGet(id)
           {
                   window.location.href="usersGet.action?id="+id;
           }
			//详细信息
			function usersDetail(id)
			{
				window.location.href="usersDetail.action?id="+id;
			}
           //图片预览
           function over(picPath)
	       {
			  if (picPath=="")picPath="/images/default.jpg";
			  x = event.clientX;
			  y = event.clientY;      
			  document.all.tip.style.display = "block";
			  document.all.tip.style.top = y;
			  document.all.tip.style.left = x+10;
			  document.all.photo.src = ".."+picPath; 
		   }
		   function out()
	       {
			  document.all.tip.style.display = "none";
		   }
		   function down1(fujianPath,fujianYuashiMing)
           {
               var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
		       url=encodeURI(url); 
               url=encodeURI(url); 
               window.open(url,"_self");
           }
           function go(index)
           {
               document.form123.index.value=index;
               document.form123.action="usersMana.action"
               document.form123.submit();
           }
            function usersSet(id,property,value)
           {
               if(confirm('您确定操作吗?'))
               {
				   var form = document.getElementById("formset");
				   form.getElementsByTagName("INPUT")[0].name = property;
				   form.getElementsByTagName("INPUT")[0].value = value;
				   document.formset.action="usersSet.action?id="+id+"&path=usersMana.action";
				   document.formset.submit();
				   //window.location.href="<%=path %>/usersSet.action?id="+id+"&isurl=1"+"&"+property+"="+value;
               }
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

				
				/*leibieSelect();*/

				typechange();
				/*typechange();*/
			}

			
           //子表管理示例代码
/*			function tupianGetByxinwen_id(xinwen_id)
			{
				var url="<%=path %>/tupianGetByxinwen_id.action?xinwen_id="+xinwen_id;
				window.location.href=url;
			}*/
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function usersliuyanGetByusersid(usersid)
           {
               var url="<%=path %>/usersliuyanGetByusersid.action?usersid="+usersid;
               window.location.href=url;
           }
           function usersliuyanAddByusersid(id)
           {
               var url="<%=path %>/usersliuyanAdd.action?id="+id;
               window.location.href=url;
           }
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function userspinglunGetByusersid(usersid)
           {
               var url="<%=path %>/userspinglunGetByusersid.action?usersid="+usersid;
               window.location.href=url;
           }
           function userspinglunAddByusersid(id)
           {
               var url="<%=path %>/userspinglunAdd.action?id="+id;
               window.location.href=url;
           }
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function usersshoucangGetByusersid(usersid)
           {
               var url="<%=path %>/usersshoucangGetByusersid.action?usersid="+usersid;
               window.location.href=url;
           }
           function usersshoucangAddByusersid(id)
           {
               var url="<%=path %>/usersshoucangAdd.action?id="+id;
               window.location.href=url;
           }
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function usersxianluGetByusersid(usersid)
           {
               var url="<%=path %>/usersxianluGetByusersid.action?usersid="+usersid;
               window.location.href=url;
           }
           function usersxianluAddByusersid(id)
           {
               var url="<%=path %>/usersxianluAdd.action?id="+id;
               window.location.href=url;
           }
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function usersyudingGetByusersid(usersid)
           {
               var url="<%=path %>/usersyudingGetByusersid.action?usersid="+usersid;
               window.location.href=url;
           }
           function usersyudingAddByusersid(id)
           {
               var url="<%=path %>/usersyudingAdd.action?id="+id;
               window.location.href=url;
           }
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function usersyuyueGetByusersid(usersid)
           {
               var url="<%=path %>/usersyuyueGetByusersid.action?usersid="+usersid;
               window.location.href=url;
           }
           function usersyuyueAddByusersid(id)
           {
               var url="<%=path %>/usersyuyueAdd.action?id="+id;
               window.location.href=url;
           }

       </script>
	</head>

	<body onload="init()"  leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">

				<form action="<%=path %>/usersMana.action" name="formSearch" id="formSearch" method="post">

					用户名称:<input type="text" name="loginname" id="loginname" size="15"/>&nbsp;&nbsp;
密码:<input type="text" name="loginpw" id="loginpw" size="15"/>&nbsp;&nbsp;
姓名:<input type="text" name="xingming" id="xingming" size="15"/>&nbsp;&nbsp;
								性别:
								<select name="xingbie" id="xingbie"  size="1" >
									<option value="">全部</option>
									<option value="男">男</option>
									<option value="女">女</option>

				                </select>&nbsp;&nbsp;
年龄:<input type="text" name="nianling" id="nianling" size="15"/>&nbsp;&nbsp;
地址:<input type="text" name="address" id="address" size="15"/>&nbsp;&nbsp;
电话:<input type="text" name="dianhua" id="dianhua" size="15"/>&nbsp;&nbsp;

								审核:
								<select name="shenhe" id="shenhe"  size="1" >
									<option value="">全部</option>
									<option value="yes">yes</option>
									<option value="no">no</option>

				                </select>&nbsp;&nbsp;

                                        类型:<input type="text" name="type" id="type" size="15"/>&nbsp;&nbsp;
                                        类型名称:<input type="text" name="typename" id="typename" value="" size="15"/>&nbsp;&nbsp;


					<input type="submit" value="搜索" />

				</form>


				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="6" background="<%=path %>/img/tbg.gif">&nbsp;&nbsp;用户管理</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="2%">序号</td>
					<%--colunmRemarks--%>
				    <td width="4%">用户名称</td>
				    <td width="4%">密码</td>
				    <td width="5%">姓名</td>
				    <td width="4%">性别</td>
				    <td width="5%">年龄</td>
				    <td width="5%">地址</td>
				    <td width="4%">电话</td>
				    <td width="4%">审核</td>
				    <td width="4%">类型</td>
				    <td width="4%">类型名称</td>


					<td width="10%">操作</td>
		        </tr>	
				
				
				 <s:iterator value="#request.page.data" id="users" status="s"> 
				 <tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						 <s:property value="#s.index+1"/>
					</td>
					 <%--colunmNameValue--%>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.loginname.length()>16">
							<s:property value="#users.loginname.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.loginname"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.loginpw.length()>16">
							<s:property value="#users.loginpw.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.loginpw"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.xingming.length()>16">
							<s:property value="#users.xingming.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.xingming"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.xingbie.length()>16">
							<s:property value="#users.xingbie.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.xingbie"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.nianling.length()>16">
							<s:property value="#users.nianling.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.nianling"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.address.length()>16">
							<s:property value="#users.address.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.address"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.dianhua.length()>16">
							<s:property value="#users.dianhua.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.dianhua"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.shenhe.length()>16">
							<s:property value="#users.shenhe.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.shenhe"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.type.length()>16">
							<s:property value="#users.type.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.type"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#users.typename.length()>16">
							<s:property value="#users.typename.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#users.typename"/>
						</s:else>
					</td>


					<td bgcolor="#FFFFFF" align="center">
						 <input type="button" value="审核" onclick="usersSet(${users.id},'shenhe','yes')"/>
						 <input type="button" value="取消审核" onclick="usersSet(${users.id},'shenhe','no')"/>

						<input type="button" value="修改" onclick="usersGet(<s:property value="#users.id"/>)"/>
						<input type="button" value="详情" onclick="usersDetail(<s:property value="#users.id"/>)"/>
						<input type="button" value="删除" onclick="usersDel(<s:property value="#users.id"/>)"/>
						<%--sonTable本表子表管理--%>

                        <%--<input type="button" value="用户留言查看" onclick="usersliuyanGetByusersid(<s:property value="#users.id"/>)"/>--%>
                        <%--<input type="button" value="用户留言添加" onclick="usersliuyanAddByusersid(<s:property value="#users.id"/>)"/>--%>

                        <%--<input type="button" value="用户评论查看" onclick="userspinglunGetByusersid(<s:property value="#users.id"/>)"/>--%>
                        <%--<input type="button" value="用户评论添加" onclick="userspinglunAddByusersid(<s:property value="#users.id"/>)"/>--%>

                        <%--<input type="button" value="用户收藏查看" onclick="usersshoucangGetByusersid(<s:property value="#users.id"/>)"/>--%>
                        <%--<input type="button" value="用户收藏添加" onclick="usersshoucangAddByusersid(<s:property value="#users.id"/>)"/>--%>

                        <%--<input type="button" value="用户旅游路线查看" onclick="usersxianluGetByusersid(<s:property value="#users.id"/>)"/>--%>
                        <%--<input type="button" value="用户旅游路线添加" onclick="usersxianluAddByusersid(<s:property value="#users.id"/>)"/>--%>

                        <%--<input type="button" value="用户预定查看" onclick="usersyudingGetByusersid(<s:property value="#users.id"/>)"/>--%>
                        <%--<input type="button" value="用户预定添加" onclick="usersyudingAddByusersid(<s:property value="#users.id"/>)"/>--%>

                        <%--<input type="button" value="用户预约查看" onclick="usersyuyueGetByusersid(<s:property value="#users.id"/>)"/>--%>
                        <%--<input type="button" value="用户预约添加" onclick="usersyuyueAddByusersid(<s:property value="#users.id"/>)"/>--%>

					</td>
				</tr>
				 </s:iterator>

			</table>
			<%@ include file="/hsgfenye.jsp"%>
			<%@ include file="/hsgset.jsp"%>
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 8px;">
			  <tr>
			    <td>
<%--
			      <input type="button" value="添加" style="width: 120px;" onclick="usersAdd()" />
--%>
			      <input type="button" value="导出" style="width: 120px;" onclick="daochu()" />
					<input type="button" value="打印" style="width: 120px;" onClick="javascript:window.print()" />
					<input type="button" value="返回" style="width: 120px;" onClick="javascript:history.back()" />
				</td>
			    
			  </tr>
		    </table>
		    
		    
		    <div id="tip" style="position:absolute;display:none;border:0px;width:80px; height:80px;">
			<TABLE id="tipTable" border="0" bgcolor="#ffffee">
				<TR align="center">
					<TD><img id="photo" src="" height="160" width="200"></TD>
				</TR>
			</TABLE>
			</div>
	</body>
</html>
