package com.action;

import com.dao.*;
import com.model.*;
import com.util.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class usersAction extends ActionSupport
{
    /*2列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  loginname;
	private  java.lang.String  loginpw;
	private  java.lang.String  xingming;
	private  java.lang.String  xingbie;
	private  java.lang.String  nianling;
	private  java.lang.String  address;
	private  java.lang.String  dianhua;
	private  java.lang.String  shenhe;
	private  java.lang.String  type;
	private  java.lang.String  typename;

    /*3 DAO列属性*/
	private chanpinDAO chanpinDAO;
	private dxDAO dxDAO;
	private gonggaoDAO gonggaoDAO;
	private jingdianDAO jingdianDAO;
	private jiudianDAO jiudianDAO;
	private leibieDAO leibieDAO;
	private lianjieDAO lianjieDAO;
	private liuyanDAO liuyanDAO;
	private lunboDAO lunboDAO;
	private meishiDAO meishiDAO;
	private pinglunDAO pinglunDAO;
	private shoucangDAO shoucangDAO;
	private usersDAO usersDAO;
	private xianluDAO xianluDAO;
	private yudingDAO yudingDAO;
	private yuyueDAO yuyueDAO;


    private String message;
    private String path;
    /*5列属性方法*/
	public java.lang.Integer  getId() {
		return id;
	}
	public void  setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String  getLoginname() {
		return loginname;
	}
	public void  setLoginname(java.lang.String loginname) {
		this.loginname = loginname;
	}
	public java.lang.String  getLoginpw() {
		return loginpw;
	}
	public void  setLoginpw(java.lang.String loginpw) {
		this.loginpw = loginpw;
	}
	public java.lang.String  getXingming() {
		return xingming;
	}
	public void  setXingming(java.lang.String xingming) {
		this.xingming = xingming;
	}
	public java.lang.String  getXingbie() {
		return xingbie;
	}
	public void  setXingbie(java.lang.String xingbie) {
		this.xingbie = xingbie;
	}
	public java.lang.String  getNianling() {
		return nianling;
	}
	public void  setNianling(java.lang.String nianling) {
		this.nianling = nianling;
	}
	public java.lang.String  getAddress() {
		return address;
	}
	public void  setAddress(java.lang.String address) {
		this.address = address;
	}
	public java.lang.String  getDianhua() {
		return dianhua;
	}
	public void  setDianhua(java.lang.String dianhua) {
		this.dianhua = dianhua;
	}
	public java.lang.String  getShenhe() {
		return shenhe;
	}
	public void  setShenhe(java.lang.String shenhe) {
		this.shenhe = shenhe;
	}
	public java.lang.String  getType() {
		return type;
	}
	public void  setType(java.lang.String type) {
		this.type = type;
	}
	public java.lang.String  getTypename() {
		return typename;
	}
	public void  setTypename(java.lang.String typename) {
		this.typename = typename;
	}


    /*6 DAO列属性方法*/
	//chanpinDAOget和set方法
	public chanpinDAO getChanpinDAO()
	{
		return chanpinDAO;
	}
	public void setChanpinDAO(chanpinDAO chanpinDAO)
	{
		this.chanpinDAO = chanpinDAO;
	}

	//dxDAOget和set方法
	public dxDAO getDxDAO()
	{
		return dxDAO;
	}
	public void setDxDAO(dxDAO dxDAO)
	{
		this.dxDAO = dxDAO;
	}

	//gonggaoDAOget和set方法
	public gonggaoDAO getGonggaoDAO()
	{
		return gonggaoDAO;
	}
	public void setGonggaoDAO(gonggaoDAO gonggaoDAO)
	{
		this.gonggaoDAO = gonggaoDAO;
	}

	//jingdianDAOget和set方法
	public jingdianDAO getJingdianDAO()
	{
		return jingdianDAO;
	}
	public void setJingdianDAO(jingdianDAO jingdianDAO)
	{
		this.jingdianDAO = jingdianDAO;
	}

	//jiudianDAOget和set方法
	public jiudianDAO getJiudianDAO()
	{
		return jiudianDAO;
	}
	public void setJiudianDAO(jiudianDAO jiudianDAO)
	{
		this.jiudianDAO = jiudianDAO;
	}

	//leibieDAOget和set方法
	public leibieDAO getLeibieDAO()
	{
		return leibieDAO;
	}
	public void setLeibieDAO(leibieDAO leibieDAO)
	{
		this.leibieDAO = leibieDAO;
	}

	//lianjieDAOget和set方法
	public lianjieDAO getLianjieDAO()
	{
		return lianjieDAO;
	}
	public void setLianjieDAO(lianjieDAO lianjieDAO)
	{
		this.lianjieDAO = lianjieDAO;
	}

	//liuyanDAOget和set方法
	public liuyanDAO getLiuyanDAO()
	{
		return liuyanDAO;
	}
	public void setLiuyanDAO(liuyanDAO liuyanDAO)
	{
		this.liuyanDAO = liuyanDAO;
	}

	//lunboDAOget和set方法
	public lunboDAO getLunboDAO()
	{
		return lunboDAO;
	}
	public void setLunboDAO(lunboDAO lunboDAO)
	{
		this.lunboDAO = lunboDAO;
	}

	//meishiDAOget和set方法
	public meishiDAO getMeishiDAO()
	{
		return meishiDAO;
	}
	public void setMeishiDAO(meishiDAO meishiDAO)
	{
		this.meishiDAO = meishiDAO;
	}

	//pinglunDAOget和set方法
	public pinglunDAO getPinglunDAO()
	{
		return pinglunDAO;
	}
	public void setPinglunDAO(pinglunDAO pinglunDAO)
	{
		this.pinglunDAO = pinglunDAO;
	}

	//shoucangDAOget和set方法
	public shoucangDAO getShoucangDAO()
	{
		return shoucangDAO;
	}
	public void setShoucangDAO(shoucangDAO shoucangDAO)
	{
		this.shoucangDAO = shoucangDAO;
	}

	//usersDAOget和set方法
	public usersDAO getUsersDAO()
	{
		return usersDAO;
	}
	public void setUsersDAO(usersDAO usersDAO)
	{
		this.usersDAO = usersDAO;
	}

	//xianluDAOget和set方法
	public xianluDAO getXianluDAO()
	{
		return xianluDAO;
	}
	public void setXianluDAO(xianluDAO xianluDAO)
	{
		this.xianluDAO = xianluDAO;
	}

	//yudingDAOget和set方法
	public yudingDAO getYudingDAO()
	{
		return yudingDAO;
	}
	public void setYudingDAO(yudingDAO yudingDAO)
	{
		this.yudingDAO = yudingDAO;
	}

	//yuyueDAOget和set方法
	public yuyueDAO getYuyueDAO()
	{
		return yuyueDAO;
	}
	public void setYuyueDAO(yuyueDAO yuyueDAO)
	{
		this.yuyueDAO = yuyueDAO;
	}



    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getPath()
    {
        return path;
    }
    public void setPath(String path)
    {
        this.path = path;
    }

    //add 后台添加功能方法实现代码...................
    public String usersAdd() {
        users users = new users();
        /*8addbody*/
        /*包含属性，表名，列名*/
        /*8addbodyuserid*/
        /*包含属性，表名，列名,用户表名，表对应用户添加列名，用户id列名*/
        if(!isEmpty(id))
        {
            users.setId(id);
        }
        if(!isEmpty(loginname))
        {
            users.setLoginname(loginname);
        }
        if(!isEmpty(loginpw))
        {
            users.setLoginpw(loginpw);
        }
        if(!isEmpty(xingming))
        {
            users.setXingming(xingming);
        }
        if(!isEmpty(xingbie))
        {
            users.setXingbie(xingbie);
        }
        if(!isEmpty(nianling))
        {
            users.setNianling(nianling);
        }
        if(!isEmpty(address))
        {
            users.setAddress(address);
        }
        if(!isEmpty(dianhua))
        {
            users.setDianhua(dianhua);
        }
        if(!isEmpty(shenhe))
        {
            users.setShenhe(shenhe);
        }
        if(!isEmpty(type))
        {
            users.setType(type);
        }
        if(!isEmpty(typename))
        {
            users.setTypename(typename);
        }


        usersDAO.save(users);

        this.setMessage("操作成功");

        //return "succeed";
        return "msg";
    }
    //add后台添加功能方法实现代码....................

    //addQian前台添加功能方法实现代码...................
    public String usersAddQian() {
        users users = new users();
        /*8addbody*/
        /*包含属性，表名，列名*/
        /*8addbodyuserid*/
        /*包含属性，表名，列名,用户表名，表对应用户添加列名，用户id列名*/
        if(!isEmpty(id))
        {
            users.setId(id);
        }
        if(!isEmpty(loginname))
        {
            users.setLoginname(loginname);
        }
        if(!isEmpty(loginpw))
        {
            users.setLoginpw(loginpw);
        }
        if(!isEmpty(xingming))
        {
            users.setXingming(xingming);
        }
        if(!isEmpty(xingbie))
        {
            users.setXingbie(xingbie);
        }
        if(!isEmpty(nianling))
        {
            users.setNianling(nianling);
        }
        if(!isEmpty(address))
        {
            users.setAddress(address);
        }
        if(!isEmpty(dianhua))
        {
            users.setDianhua(dianhua);
        }
        if(!isEmpty(shenhe))
        {
            users.setShenhe(shenhe);
        }
        if(!isEmpty(type))
        {
            users.setType(type);
        }
        if(!isEmpty(typename))
        {
            users.setTypename(typename);
        }



        List usersList = usersDAO.findByLoginname(loginname);
        if (usersList == null || usersList.size() == 0)
        {
        }
        else
        {
            Map request=(Map)ServletActionContext.getContext().get("request");
            request.put("msg", "用户已存在！");
            return "false";
        }

        usersDAO.save(users);

        //this.setMessage("操作成功");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQian前台添加功能方法实现代码....................

    //set后台信息修改方法实现代码...................
    public String usersSet()
    {
        users users=usersDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                users.setId(id);
        }
        if(!isEmpty(loginname))
        {
                users.setLoginname(loginname);
        }
        if(!isEmpty(loginpw))
        {
                users.setLoginpw(loginpw);
        }
        if(!isEmpty(xingming))
        {
                users.setXingming(xingming);
        }
        if(!isEmpty(xingbie))
        {
                users.setXingbie(xingbie);
        }
        if(!isEmpty(nianling))
        {
                users.setNianling(nianling);
        }
        if(!isEmpty(address))
        {
                users.setAddress(address);
        }
        if(!isEmpty(dianhua))
        {
                users.setDianhua(dianhua);
        }
        if(!isEmpty(shenhe))
        {
                users.setShenhe(shenhe);
        }
        if(!isEmpty(type))
        {
                users.setType(type);
        }
        if(!isEmpty(typename))
        {
                users.setTypename(typename);
        }


        usersDAO.attachDirty(users);


        //this.setMessage("操作成功");
        //return "succeed";
        return "msg";
    }//set 后台信息修改方法实现代码....................

    //set2后台信息修改后更新session方法实现代码...................
    public String usersSet2()
    {
        users users=usersDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                users.setId(id);
        }
        if(!isEmpty(loginname))
        {
                users.setLoginname(loginname);
        }
        if(!isEmpty(loginpw))
        {
                users.setLoginpw(loginpw);
        }
        if(!isEmpty(xingming))
        {
                users.setXingming(xingming);
        }
        if(!isEmpty(xingbie))
        {
                users.setXingbie(xingbie);
        }
        if(!isEmpty(nianling))
        {
                users.setNianling(nianling);
        }
        if(!isEmpty(address))
        {
                users.setAddress(address);
        }
        if(!isEmpty(dianhua))
        {
                users.setDianhua(dianhua);
        }
        if(!isEmpty(shenhe))
        {
                users.setShenhe(shenhe);
        }
        if(!isEmpty(type))
        {
                users.setType(type);
        }
        if(!isEmpty(typename))
        {
                users.setTypename(typename);
        }


        usersDAO.attachDirty(users);

        //信息修改完成后 更新session
        Map session=ActionContext.getContext().getSession();
        users userssession = (users) session.get("user");
        if (userssession!=null)
        {
            users usersdatabase = usersDAO.findById(userssession.getId());
            session.put("user", usersdatabase);
        }

        //this.setMessage("操作成功");
        //return "succeed";
        return "msg";
    }//set 后台信息修改方法实现代码....................

    //Mana 后台信息管理列表方法实现代码.............
    public String usersMana()
    {
        String sql="from users where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(loginname))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginname='"+loginname+ "' ";
        }

        if(!isEmpty(loginpw))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginpw='"+loginpw+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(xingbie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingbie='"+xingbie+ "' ";
        }

        if(!isEmpty(nianling))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and nianling='"+nianling+ "' ";
        }

        if(!isEmpty(address))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and address='"+address+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(shenhe))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shenhe='"+shenhe+ "' ";
        }

        if(!isEmpty(type))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and type='"+type+ "' ";
        }

        if(!isEmpty(typename))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and typename='"+typename+ "' ";
        }


        System.out.println(sql);
        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);
            //示例代码
            //Integer leibieid = xinwen.getLeibieid();
            //System.out.println(leibieid);
            //if(leibieid != null )
            //{
            //  xinwen.setLeibie(leibieDAO.findById(leibieid));
            //}
            {
                /*11fatherset*/
                //FatherEntitySetStr
        /*包含属性，表名，列名，父表名*/

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //分页部分代码实现
        /*包含属性，表名*/

        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        int hsgpagesize=p.getPageSize();
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana 后台信息管理列表方法实现代码.............

    //ManaQian 前台信息列表方法实现代码.............
    public String usersManaQian()
    {
        String sql="from users where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(loginname))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginname='"+loginname+ "' ";
        }

        if(!isEmpty(loginpw))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginpw='"+loginpw+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(xingbie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingbie='"+xingbie+ "' ";
        }

        if(!isEmpty(nianling))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and nianling='"+nianling+ "' ";
        }

        if(!isEmpty(address))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and address='"+address+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(shenhe))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shenhe='"+shenhe+ "' ";
        }

        if(!isEmpty(type))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and type='"+type+ "' ";
        }

        if(!isEmpty(typename))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and typename='"+typename+ "' ";
        }

        sql= sql + " order by id desc";

        System.out.println(sql);
        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //分页部分代码实现

        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        int hsgpagesize=p.getPageSize();
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian 前台信息列表方法实现代码.............



    //ManaQianSort 前台信息排序列表方法实现代码 方法.............
    public String usersManaQianSort()
    {
        String sql="from users where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(loginname))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginname='"+loginname+ "' ";
        }

        if(!isEmpty(loginpw))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginpw='"+loginpw+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(xingbie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingbie='"+xingbie+ "' ";
        }

        if(!isEmpty(nianling))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and nianling='"+nianling+ "' ";
        }

        if(!isEmpty(address))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and address='"+address+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(shenhe))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shenhe='"+shenhe+ "' ";
        }

        if(!isEmpty(type))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and type='"+type+ "' ";
        }

        if(!isEmpty(typename))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and typename='"+typename+ "' ";
        }

        sql= sql + " order by dianjicishu desc";

        System.out.println(sql);
        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
                //FatherEntitySetStr
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //分页部分代码实现
        
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        int hsgpagesize=p.getPageSize();
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort 前台信息排序列表方法实现代码 .............

    // manaMy 后台我的信息列表方法实现代码.............
    public String usersManaMy()
    {
        String sql="from users where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(loginname))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginname='"+loginname+ "' ";
        }

        if(!isEmpty(loginpw))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginpw='"+loginpw+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(xingbie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingbie='"+xingbie+ "' ";
        }

        if(!isEmpty(nianling))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and nianling='"+nianling+ "' ";
        }

        if(!isEmpty(address))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and address='"+address+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(shenhe))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shenhe='"+shenhe+ "' ";
        }

        if(!isEmpty(type))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and type='"+type+ "' ";
        }

        if(!isEmpty(typename))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and typename='"+typename+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //动态分页部分代码单独实现
                //动态分页部分代码单独实现
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=usersList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy 后台我的信息列表方法实现代码.............

    //manaMyQian 前台我的信息列表方法实现代码  .............
    public String usersManaMyQian()
    {
        String sql="from users where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(loginname))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginname='"+loginname+ "' ";
        }

        if(!isEmpty(loginpw))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginpw='"+loginpw+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(xingbie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingbie='"+xingbie+ "' ";
        }

        if(!isEmpty(nianling))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and nianling='"+nianling+ "' ";
        }

        if(!isEmpty(address))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and address='"+address+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(shenhe))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shenhe='"+shenhe+ "' ";
        }

        if(!isEmpty(type))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and type='"+type+ "' ";
        }

        if(!isEmpty(typename))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and typename='"+typename+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //动态分页部分代码单独实现
                //动态分页部分代码单独实现
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=usersList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian 前台我的信息列表方法实现代码 .............

    //通用方法
    //GetByAll 按字段查询所有信息方法实现代码方法 .............
    public String usersGetByAll()
    {
        String sql="from users where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(loginname))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginname='"+loginname+ "' ";
        }

        if(!isEmpty(loginpw))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and loginpw='"+loginpw+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(xingbie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingbie='"+xingbie+ "' ";
        }

        if(!isEmpty(nianling))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and nianling='"+nianling+ "' ";
        }

        if(!isEmpty(address))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and address='"+address+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(shenhe))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shenhe='"+shenhe+ "' ";
        }

        if(!isEmpty(type))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and type='"+type+ "' ";
        }

        if(!isEmpty(typename))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and typename='"+typename+ "' ";
        }


        System.out.println(sql);
        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*包含属性，表名，列名，父表名*/
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //分页部分代码实现
        /*包含属性，表名*/
                //动态分页部分代码单独实现
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=usersList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll 按字段查询所有信息方法实现代码方法 .............


    //Search 后台按字段查询所有信息方法实现代码方法 .............
    public String usersSearch()
    {
        String sql="from users where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(loginname))
        {
            sql=sql + " and loginname like '%"+loginname+ "%' ";
        }
        if(!isEmpty(loginpw))
        {
            sql=sql + " and loginpw like '%"+loginpw+ "%' ";
        }
        if(!isEmpty(xingming))
        {
            sql=sql + " and xingming like '%"+xingming+ "%' ";
        }
        if(!isEmpty(xingbie))
        {
            sql=sql + " and xingbie like '%"+xingbie+ "%' ";
        }
        if(!isEmpty(nianling))
        {
            sql=sql + " and nianling like '%"+nianling+ "%' ";
        }
        if(!isEmpty(address))
        {
            sql=sql + " and address like '%"+address+ "%' ";
        }
        if(!isEmpty(dianhua))
        {
            sql=sql + " and dianhua like '%"+dianhua+ "%' ";
        }
        if(!isEmpty(shenhe))
        {
            sql=sql + " and shenhe like '%"+shenhe+ "%' ";
        }
        if(!isEmpty(type))
        {
            sql=sql + " and type like '%"+type+ "%' ";
        }
        if(!isEmpty(typename))
        {
            sql=sql + " and typename like '%"+typename+ "%' ";
        }

        System.out.println(sql);

        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //动态分页部分代码单独实现
                //动态分页部分代码单独实现
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=usersList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search 后台按字段查询所有信息方法实现代码方法 .............

    //SearchMy 后台按字段查询我的信息方法实现代码方法 .............
    public String usersSearchMy()
    {
        String sql="from users where 1=1 ";

        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "' ";
        }

        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(loginname))
        {
            sql=sql + " and loginname like '%"+loginname+ "%' ";
        }
        if(!isEmpty(loginpw))
        {
            sql=sql + " and loginpw like '%"+loginpw+ "%' ";
        }
        if(!isEmpty(xingming))
        {
            sql=sql + " and xingming like '%"+xingming+ "%' ";
        }
        if(!isEmpty(xingbie))
        {
            sql=sql + " and xingbie like '%"+xingbie+ "%' ";
        }
        if(!isEmpty(nianling))
        {
            sql=sql + " and nianling like '%"+nianling+ "%' ";
        }
        if(!isEmpty(address))
        {
            sql=sql + " and address like '%"+address+ "%' ";
        }
        if(!isEmpty(dianhua))
        {
            sql=sql + " and dianhua like '%"+dianhua+ "%' ";
        }
        if(!isEmpty(shenhe))
        {
            sql=sql + " and shenhe like '%"+shenhe+ "%' ";
        }
        if(!isEmpty(type))
        {
            sql=sql + " and type like '%"+type+ "%' ";
        }
        if(!isEmpty(typename))
        {
            sql=sql + " and typename like '%"+typename+ "%' ";
        }

        System.out.println(sql);

        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //动态分页部分代码单独实现
                //动态分页部分代码单独实现
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=usersList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy 后台按字段查询我的信息方法实现代码方法 .............





    //SearchQian 前台按字段查询所有信息方法实现代码方法 .............
    public String usersSearchQian()
    {
        String sql="from users where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(loginname))
        {
            sql=sql + " and loginname like '%"+loginname+ "%' ";
        }
        if(!isEmpty(loginpw))
        {
            sql=sql + " and loginpw like '%"+loginpw+ "%' ";
        }
        if(!isEmpty(xingming))
        {
            sql=sql + " and xingming like '%"+xingming+ "%' ";
        }
        if(!isEmpty(xingbie))
        {
            sql=sql + " and xingbie like '%"+xingbie+ "%' ";
        }
        if(!isEmpty(nianling))
        {
            sql=sql + " and nianling like '%"+nianling+ "%' ";
        }
        if(!isEmpty(address))
        {
            sql=sql + " and address like '%"+address+ "%' ";
        }
        if(!isEmpty(dianhua))
        {
            sql=sql + " and dianhua like '%"+dianhua+ "%' ";
        }
        if(!isEmpty(shenhe))
        {
            sql=sql + " and shenhe like '%"+shenhe+ "%' ";
        }
        if(!isEmpty(type))
        {
            sql=sql + " and type like '%"+type+ "%' ";
        }
        if(!isEmpty(typename))
        {
            sql=sql + " and typename like '%"+typename+ "%' ";
        }

        System.out.println(sql);

        List usersList=usersDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<usersList.size();i++)
        {
            users users=(users)usersList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("usersList", usersList);

        //动态分页部分代码单独实现
                //动态分页部分代码单独实现
        HttpServletRequest request1=ServletActionContext.getRequest();
        int index=0;
        if(request1.getParameter("index")==null)
        {
                index=1;
        }
        else
        {
                index=Integer.parseInt(request1.getParameter("index"));
        }

        Pagination p = new Pagination();//创建 分页对象
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=usersList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, usersList.size());
        List usersList1 = usersList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(usersList.size());//设置总共的条数
        p.setData(usersList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian 前台按字段查询所有信息方法实现代码方法.............

    //del 按id删除信息方法.............
    public String usersDel()
    {
        users users=usersDAO.findById(id);
        usersDAO.delete(users);

        this.setMessage("操作成功");
        //this.setPath("usersMana.action");

        //return "succeed";
        return "msg";
    }//del 按id删除信息方法 .............

    //get 按字段查询信息方法..........................
    public String usersGet()
    {
        users users=usersDAO.findById(id);



        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("users", users);


        {
            /*12getson*/
            //SonListGet

                    {
                        String sql="from liuyan where usersid="+id;
                        List liuyanList =liuyanDAO.getHibernateTemplate().find(sql);
                        request.put("liuyanList", liuyanList);
                    }

                    {
                        String sql="from pinglun where usersid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where usersid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

                    {
                        String sql="from xianlu where usersid="+id;
                        List xianluList =xianluDAO.getHibernateTemplate().find(sql);
                        request.put("xianluList", xianluList);
                    }

                    {
                        String sql="from yuding where usersid="+id;
                        List yudingList =yudingDAO.getHibernateTemplate().find(sql);
                        request.put("yudingList", yudingList);
                    }

                    {
                        String sql="from yuyue where usersid="+id;
                        List yuyueList =yuyueDAO.getHibernateTemplate().find(sql);
                        request.put("yuyueList", yuyueList);
                    }

        }



        return ActionSupport.SUCCESS;

    }//get 按字段查询信息方法 ..........................

    //Detail 后台详情信息获取方法 ..........................
    public String usersDetail()
    {
        users users=usersDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("users", users);


        {
            //SonListGet

                    {
                        String sql="from liuyan where usersid="+id;
                        List liuyanList =liuyanDAO.getHibernateTemplate().find(sql);
                        request.put("liuyanList", liuyanList);
                    }

                    {
                        String sql="from pinglun where usersid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where usersid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

                    {
                        String sql="from xianlu where usersid="+id;
                        List xianluList =xianluDAO.getHibernateTemplate().find(sql);
                        request.put("xianluList", xianluList);
                    }

                    {
                        String sql="from yuding where usersid="+id;
                        List yudingList =yudingDAO.getHibernateTemplate().find(sql);
                        request.put("yudingList", yudingList);
                    }

                    {
                        String sql="from yuyue where usersid="+id;
                        List yuyueList =yuyueDAO.getHibernateTemplate().find(sql);
                        request.put("yuyueList", yuyueList);
                    }

        }

        return ActionSupport.SUCCESS;
    }//Detail 后台详情信息获取方法 ..........................

    //DetailQian 前台详情信息获取方法..........................
    public String usersDetailQian()
    {
        users users=usersDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("users", users);


        {
            //SonListGet

                    {
                        String sql="from liuyan where usersid="+id;
                        List liuyanList =liuyanDAO.getHibernateTemplate().find(sql);
                        request.put("liuyanList", liuyanList);
                    }

                    {
                        String sql="from pinglun where usersid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where usersid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

                    {
                        String sql="from xianlu where usersid="+id;
                        List xianluList =xianluDAO.getHibernateTemplate().find(sql);
                        request.put("xianluList", xianluList);
                    }

                    {
                        String sql="from yuding where usersid="+id;
                        List yudingList =yudingDAO.getHibernateTemplate().find(sql);
                        request.put("yudingList", yudingList);
                    }

                    {
                        String sql="from yuyue where usersid="+id;
                        List yuyueList =yuyueDAO.getHibernateTemplate().find(sql);
                        request.put("yuyueList", yuyueList);
                    }

        }

        return ActionSupport.SUCCESS;
    }//DetailQian 前台详情信息获取方法 ..........................

    //Xinxi 后台详情信息获取方法 ..........................
    public String usersXinxi()
    {
        users users=usersDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("users", users);


        {
            //SonListGet

                    {
                        String sql="from liuyan where usersid="+id;
                        List liuyanList =liuyanDAO.getHibernateTemplate().find(sql);
                        request.put("liuyanList", liuyanList);
                    }

                    {
                        String sql="from pinglun where usersid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where usersid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

                    {
                        String sql="from xianlu where usersid="+id;
                        List xianluList =xianluDAO.getHibernateTemplate().find(sql);
                        request.put("xianluList", xianluList);
                    }

                    {
                        String sql="from yuding where usersid="+id;
                        List yudingList =yudingDAO.getHibernateTemplate().find(sql);
                        request.put("yudingList", yudingList);
                    }

                    {
                        String sql="from yuyue where usersid="+id;
                        List yuyueList =yuyueDAO.getHibernateTemplate().find(sql);
                        request.put("yuyueList", yuyueList);
                    }

        }

        return ActionSupport.SUCCESS;
    }//Xinxi Detail 后台详情信息获取方法

    /*14关键词搜索,可以不使用*/
/*classNameLowerAction.notuse.actionsearchbycolunmalljavaList*/
    /*17按列查询*/
/*classNameLowerAction.notuse.actiongetbycolunmalljavaList*/
    /*20字段设置,可以不使用*/
/*classNameLowerAction.notuse.actionsetbycolunmalljavaList*/

    //判断字符串类型数据是否为空方法
    public static boolean isEmpty(String cs) {
        return cs == null || cs.length() == 0;
    }

    //判断整型类型数据是否为空方法
    public static boolean isEmpty(Integer csi) {
        return csi == null;
    }
}
