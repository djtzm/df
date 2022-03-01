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
              var url="<%=path %>/jiudianMana.action?d=1";
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
           function jiudianAdd()
           {
              var url="<%=path %>/admin/jiudian/jiudianAdd.jsp";
              window.location.href=url;
           }
           //删除信息
           function jiudianDel(id)
           {
               if(confirm('您确定删除吗?'))
               {
                   window.location.href="<%=path %>/jiudianDel.action?id="+id+"&path=jiudianChakan.action";
               }
           }
           //修改信息
           function jiudianGet(id)
           {
                   window.location.href="jiudianGet.action?id="+id;
           }
			//详细信息
			function jiudianDetail(id)
			{
				window.location.href="jiudianDetail.action?id="+id;
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
               document.form123.action="jiudianChakan.action"
               document.form123.submit();
           }
            function jiudianSet(id,property,value)
           {
               if(confirm('您确定操作吗?'))
               {
				   var form = document.getElementById("formset");
				   form.getElementsByTagName("INPUT")[0].name = property;
				   form.getElementsByTagName("INPUT")[0].value = value;
				   document.formset.action="jiudianSet.action?id="+id+"&path=jiudianChakan.action";
				   document.formset.submit();
				   //window.location.href="<%=path %>/jiudianSet.action?id="+id+"&isurl=1"+"&"+property+"="+value;
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
				
				/*typechange();*/
				
				/*leibieSelect();*/
			}

			

           //子表管理示例代码
/*			function tupianGetByxinwen_id(xinwen_id)
			{
				var url="<%=path %>/tupianGetByxinwen_id.action?xinwen_id="+xinwen_id;
				window.location.href=url;
			}*/
           //子表管理classNameLowerMana.jsp.js.SonclassNameLowerGetbyFatheridList
           function jiudianyudingGetByjiudianid(jiudianid)
           {
               var url="<%=path %>/jiudianyudingGetByjiudianid.action?jiudianid="+jiudianid;
               window.location.href=url;
           }
           function jiudianyudingAddByjiudianid(id)
           {
               var url="<%=path %>/jiudianyudingAdd.action?id="+id;
               window.location.href=url;
           }

       </script>
	</head>

	<body onload="init()" leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<%--<form action="<%=path %>/jiudianSearchChakan.action" name="formSearch" id="formSearch" method="post">

					标题:<input type="text" name="biaoti" id="biaoti" size="15"/>&nbsp;&nbsp;
内容:<input type="text" name="neirong" id="neirong" size="15"/>&nbsp;&nbsp;
地址:<input type="text" name="dizhi" id="dizhi" size="15"/>&nbsp;&nbsp;


					<input type="submit" value="搜索" />

				</form>--%>


				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="6" background="<%=path %>/img/tbg.gif">&nbsp;&nbsp;酒店管理</td>
				</tr>
				<%--colunmRemarks--%>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="2%">序号</td>

				    <td width="5%">标题</td>
				    <td width="10%">内容</td>
				    <td width="5%">地址</td>
				    <td width="4%">图片</td>
				    <td width="5%">时间</td>


					<td width="10%">操作</td>
		        </tr>	
				
				
				 <s:iterator value="#request.page.data" id="jiudian" status="s"> 
				 <tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						 <s:property value="#s.index+1"/>
					</td>
					 <%--colunmNameValue--%>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#jiudian.biaoti.length()>16">
							<s:property value="#jiudian.biaoti.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#jiudian.biaoti"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#jiudian.neirong.length()>16">
							<s:property value="#jiudian.neirong.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#jiudian.neirong"/>
						</s:else>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#jiudian.dizhi.length()>16">
							<s:property value="#jiudian.dizhi.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#jiudian.dizhi"/>
						</s:else>
					</td>

					<td width='90' align='center'>
						<a href='<%=path %>/<s:property value="#jiudian.image"/>' target='_blank'>
							<img
									src='<%=path %>/<s:property value="#jiudian.image"/>' width=88 height=99 border=0/>
						</a>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="#jiudian.shijian.length()>16">
							<s:property value="#jiudian.shijian.substring(0,16)+'...'"/>
						</s:if>
						<s:else>
							<s:property value="#jiudian.shijian"/>
						</s:else>
					</td>


					<td bgcolor="#FFFFFF" align="center">
						<%-- <input type="button" value="审核" onclick="jiudianSet(${jiudian.id},'shenhe','yes')"/> --%>
						<%-- <input type="button" value="取消审核" onclick="jiudianSet(${jiudian.id},'shenhe','no')"/> --%>

						<%--<input type="button" value="修改" onclick="jiudianGet(<s:property value="#jiudian.id"/>)"/>--%>
						<%--<input type="button" value="审核" onclick="jiudianSet(<s:property value="#jiudian.id"/>,'shenhe','yes')"/>--%>
						<input type="button" value="详情" onclick="jiudianDetail(<s:property value="#jiudian.id"/>)"/>
						<%--<input type="button" value="删除" onclick="jiudianDel(<s:property value="#jiudian.id"/>)"/>--%>
						<%--sonTable本表子表管理--%>

                        <%--<input type="button" value="酒店预定查看" onclick="jiudianyudingGetByjiudianid(<s:property value="#jiudian.id"/>)"/>--%>
                        <%--<input type="button" value="酒店预定添加" onclick="jiudianyudingAddByjiudianid(<s:property value="#jiudian.id"/>)"/>--%>

<%--
						<input type="button" value="图片管理" onclick="tupianGetByjiudian_id(<s:property value="#jiudian.id"/>)"/>
--%>
					</td>
				</tr>
				 </s:iterator>

			</table>
			<%@ include file="../../hsgfenye.jsp"%>
			<%@ include file="../../hsgset.jsp"%>
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 8px;">
			  <tr>
			    <td>
			      <%--<input type="button" value="添加" style="width: 120px;" onclick="jiudianAdd()" />--%>
			      <%--<input type="button" value="导出" style="width: 120px;" onclick="daochu()" />--%>
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
