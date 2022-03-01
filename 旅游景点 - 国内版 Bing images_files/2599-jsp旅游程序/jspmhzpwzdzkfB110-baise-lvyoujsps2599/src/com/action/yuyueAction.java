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

public class yuyueAction extends ActionSupport
{
    /*2列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.Integer  xianluid;
	private  java.lang.Integer  usersid;
	private  java.lang.String  riqi;
	private  java.lang.String  xingming;
	private  java.lang.String  dianhua;
	private  java.lang.String  beizhu;

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
	public java.lang.String  getBiaoti() {
		return biaoti;
	}
	public void  setBiaoti(java.lang.String biaoti) {
		this.biaoti = biaoti;
	}
	public java.lang.Integer  getXianluid() {
		return xianluid;
	}
	public void  setXianluid(java.lang.Integer xianluid) {
		this.xianluid = xianluid;
	}
	public java.lang.Integer  getUsersid() {
		return usersid;
	}
	public void  setUsersid(java.lang.Integer usersid) {
		this.usersid = usersid;
	}
	public java.lang.String  getRiqi() {
		return riqi;
	}
	public void  setRiqi(java.lang.String riqi) {
		this.riqi = riqi;
	}
	public java.lang.String  getXingming() {
		return xingming;
	}
	public void  setXingming(java.lang.String xingming) {
		this.xingming = xingming;
	}
	public java.lang.String  getDianhua() {
		return dianhua;
	}
	public void  setDianhua(java.lang.String dianhua) {
		this.dianhua = dianhua;
	}
	public java.lang.String  getBeizhu() {
		return beizhu;
	}
	public void  setBeizhu(java.lang.String beizhu) {
		this.beizhu = beizhu;
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
    public String yuyueAdd() {
        yuyue yuyue = new yuyue();
        /*8addbody*/
        /*包含属性，表名，列名*/
        /*8addbodyuserid*/
        /*包含属性，表名，列名,用户表名，表对应用户添加列名，用户id列名*/
        if(!isEmpty(id))
        {
            yuyue.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            yuyue.setBiaoti(biaoti);
        }
        if(!isEmpty(xianluid))
        {
            yuyue.setXianluid(xianluid);
        }
        HttpServletRequest request=ServletActionContext.getRequest();
        Map session=ActionContext.getContext().getSession();
        users users=(users)session.get("user");
        if(users != null)
        {
            //本表+本表列名  用户表名  用户表ID名
            yuyue.setUsersid(users.getId());
        }

        
        if(!isEmpty(riqi))
        {
            yuyue.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
            yuyue.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
            yuyue.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
            yuyue.setBeizhu(beizhu);
        }


        yuyueDAO.save(yuyue);

        this.setMessage("操作成功");

        //return "succeed";
        return "msg";
    }
    //add后台添加功能方法实现代码....................

    //addQian前台添加功能方法实现代码...................
    public String yuyueAddQian() {
        yuyue yuyue = new yuyue();
        /*8addbody*/
        /*包含属性，表名，列名*/
        /*8addbodyuserid*/
        /*包含属性，表名，列名,用户表名，表对应用户添加列名，用户id列名*/
        if(!isEmpty(id))
        {
            yuyue.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            yuyue.setBiaoti(biaoti);
        }
        if(!isEmpty(xianluid))
        {
            yuyue.setXianluid(xianluid);
        }
        HttpServletRequest request=ServletActionContext.getRequest();
        Map session=ActionContext.getContext().getSession();
        users users=(users)session.get("user");
        if(users != null)
        {
            //本表+本表列名  用户表名  用户表ID名
            yuyue.setUsersid(users.getId());
        }

        
        if(!isEmpty(riqi))
        {
            yuyue.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
            yuyue.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
            yuyue.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
            yuyue.setBeizhu(beizhu);
        }



        yuyueDAO.save(yuyue);

        //this.setMessage("操作成功");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQian前台添加功能方法实现代码....................

    //set后台信息修改方法实现代码...................
    public String yuyueSet()
    {
        yuyue yuyue=yuyueDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                yuyue.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                yuyue.setBiaoti(biaoti);
        }
        if(!isEmpty(xianluid))
        {
                yuyue.setXianluid(xianluid);
        }
        if(!isEmpty(usersid))
        {
                yuyue.setUsersid(usersid);
        }
        if(!isEmpty(riqi))
        {
                yuyue.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
                yuyue.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
                yuyue.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
                yuyue.setBeizhu(beizhu);
        }


        yuyueDAO.attachDirty(yuyue);


        //this.setMessage("操作成功");
        //return "succeed";
        return "msg";
    }//set 后台信息修改方法实现代码....................

    //set2后台信息修改后更新session方法实现代码...................
    public String yuyueSet2()
    {
        yuyue yuyue=yuyueDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                yuyue.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                yuyue.setBiaoti(biaoti);
        }
        if(!isEmpty(xianluid))
        {
                yuyue.setXianluid(xianluid);
        }
        if(!isEmpty(usersid))
        {
                yuyue.setUsersid(usersid);
        }
        if(!isEmpty(riqi))
        {
                yuyue.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
                yuyue.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
                yuyue.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
                yuyue.setBeizhu(beizhu);
        }


        yuyueDAO.attachDirty(yuyue);

        //信息修改完成后 更新session
        Map session=ActionContext.getContext().getSession();
        yuyue yuyuesession = (yuyue) session.get("user");
        if (yuyuesession!=null)
        {
            yuyue yuyuedatabase = yuyueDAO.findById(yuyuesession.getId());
            session.put("user", yuyuedatabase);
        }

        //this.setMessage("操作成功");
        //return "succeed";
        return "msg";
    }//set 后台信息修改方法实现代码....................

    //Mana 后台信息管理列表方法实现代码.............
    public String yuyueMana()
    {
        String sql="from yuyue where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(biaoti))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and biaoti='"+biaoti+ "' ";
        }

        if(!isEmpty(xianluid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xianluid='"+xianluid+ "' ";
        }

        if(!isEmpty(usersid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and usersid='"+usersid+ "' ";
        }

        if(!isEmpty(riqi))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and riqi='"+riqi+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(beizhu))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and beizhu='"+beizhu+ "' ";
        }


        System.out.println(sql);
        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);
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
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana 后台信息管理列表方法实现代码.............

    //ManaQian 前台信息列表方法实现代码.............
    public String yuyueManaQian()
    {
        String sql="from yuyue where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(biaoti))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and biaoti='"+biaoti+ "' ";
        }

        if(!isEmpty(xianluid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xianluid='"+xianluid+ "' ";
        }

        if(!isEmpty(usersid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and usersid='"+usersid+ "' ";
        }

        if(!isEmpty(riqi))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and riqi='"+riqi+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(beizhu))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and beizhu='"+beizhu+ "' ";
        }

        sql= sql + " order by id desc";

        System.out.println(sql);
        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
                //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian 前台信息列表方法实现代码.............



    //ManaQianSort 前台信息排序列表方法实现代码 方法.............
    public String yuyueManaQianSort()
    {
        String sql="from yuyue where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(biaoti))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and biaoti='"+biaoti+ "' ";
        }

        if(!isEmpty(xianluid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xianluid='"+xianluid+ "' ";
        }

        if(!isEmpty(usersid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and usersid='"+usersid+ "' ";
        }

        if(!isEmpty(riqi))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and riqi='"+riqi+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(beizhu))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and beizhu='"+beizhu+ "' ";
        }

        sql= sql + " order by dianjicishu desc";

        System.out.println(sql);
        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
                //FatherEntitySetStr
                               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort 前台信息排序列表方法实现代码 .............

    // manaMy 后台我的信息列表方法实现代码.............
    public String yuyueManaMy()
    {
        String sql="from yuyue where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(biaoti))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and biaoti='"+biaoti+ "' ";
        }

        if(!isEmpty(xianluid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xianluid='"+xianluid+ "' ";
        }

        if(!isEmpty(usersid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and usersid='"+usersid+ "' ";
        }

        if(!isEmpty(riqi))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and riqi='"+riqi+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(beizhu))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and beizhu='"+beizhu+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and usersid='" + usersid + "'";
        }

        System.out.println(sql);
        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
                //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy 后台我的信息列表方法实现代码.............

    //manaMyQian 前台我的信息列表方法实现代码  .............
    public String yuyueManaMyQian()
    {
        String sql="from yuyue where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(biaoti))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and biaoti='"+biaoti+ "' ";
        }

        if(!isEmpty(xianluid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xianluid='"+xianluid+ "' ";
        }

        if(!isEmpty(usersid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and usersid='"+usersid+ "' ";
        }

        if(!isEmpty(riqi))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and riqi='"+riqi+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(beizhu))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and beizhu='"+beizhu+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and usersid='" + usersid + "'";
        }

        System.out.println(sql);
        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
                //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian 前台我的信息列表方法实现代码 .............

    //通用方法
    //GetByAll 按字段查询所有信息方法实现代码方法 .............
    public String yuyueGetByAll()
    {
        String sql="from yuyue where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(biaoti))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and biaoti='"+biaoti+ "' ";
        }

        if(!isEmpty(xianluid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xianluid='"+xianluid+ "' ";
        }

        if(!isEmpty(usersid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and usersid='"+usersid+ "' ";
        }

        if(!isEmpty(riqi))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and riqi='"+riqi+ "' ";
        }

        if(!isEmpty(xingming))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and xingming='"+xingming+ "' ";
        }

        if(!isEmpty(dianhua))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and dianhua='"+dianhua+ "' ";
        }

        if(!isEmpty(beizhu))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and beizhu='"+beizhu+ "' ";
        }


        System.out.println(sql);
        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*包含属性，表名，列名，父表名*/
                               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll 按字段查询所有信息方法实现代码方法 .............


    //Search 后台按字段查询所有信息方法实现代码方法 .............
    public String yuyueSearch()
    {
        String sql="from yuyue where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(xianluid))
        {
            sql=sql + " and xianluid='"+xianluid+ "' ";
        }
        if(!isEmpty(usersid))
        {
            sql=sql + " and usersid='"+usersid+ "' ";
        }
        if(!isEmpty(riqi))
        {
            sql=sql + " and riqi like '%"+riqi+ "%' ";
        }
        if(!isEmpty(xingming))
        {
            sql=sql + " and xingming like '%"+xingming+ "%' ";
        }
        if(!isEmpty(dianhua))
        {
            sql=sql + " and dianhua like '%"+dianhua+ "%' ";
        }
        if(!isEmpty(beizhu))
        {
            sql=sql + " and beizhu like '%"+beizhu+ "%' ";
        }

        System.out.println(sql);

        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search 后台按字段查询所有信息方法实现代码方法 .............

    //SearchMy 后台按字段查询我的信息方法实现代码方法 .............
    public String yuyueSearchMy()
    {
        String sql="from yuyue where 1=1 ";

        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and usersid='" + usersid + "' ";
        }

        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(xianluid))
        {
            sql=sql + " and xianluid='"+xianluid+ "' ";
        }
        if(!isEmpty(usersid))
        {
            sql=sql + " and usersid='"+usersid+ "' ";
        }
        if(!isEmpty(riqi))
        {
            sql=sql + " and riqi like '%"+riqi+ "%' ";
        }
        if(!isEmpty(xingming))
        {
            sql=sql + " and xingming like '%"+xingming+ "%' ";
        }
        if(!isEmpty(dianhua))
        {
            sql=sql + " and dianhua like '%"+dianhua+ "%' ";
        }
        if(!isEmpty(beizhu))
        {
            sql=sql + " and beizhu like '%"+beizhu+ "%' ";
        }

        System.out.println(sql);

        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy 后台按字段查询我的信息方法实现代码方法 .............





    //SearchQian 前台按字段查询所有信息方法实现代码方法 .............
    public String yuyueSearchQian()
    {
        String sql="from yuyue where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(xianluid))
        {
            sql=sql + " and xianluid='"+xianluid+ "' ";
        }
        if(!isEmpty(usersid))
        {
            sql=sql + " and usersid='"+usersid+ "' ";
        }
        if(!isEmpty(riqi))
        {
            sql=sql + " and riqi like '%"+riqi+ "%' ";
        }
        if(!isEmpty(xingming))
        {
            sql=sql + " and xingming like '%"+xingming+ "%' ";
        }
        if(!isEmpty(dianhua))
        {
            sql=sql + " and dianhua like '%"+dianhua+ "%' ";
        }
        if(!isEmpty(beizhu))
        {
            sql=sql + " and beizhu like '%"+beizhu+ "%' ";
        }

        System.out.println(sql);

        List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yuyueList.size();i++)
        {
            yuyue yuyue=(yuyue)yuyueList.get(i);

            {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyueList", yuyueList);

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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//设置总共的条数
        p.setData(yuyueList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian 前台按字段查询所有信息方法实现代码方法.............

    //del 按id删除信息方法.............
    public String yuyueDel()
    {
        yuyue yuyue=yuyueDAO.findById(id);
        yuyueDAO.delete(yuyue);

        this.setMessage("操作成功");
        //this.setPath("yuyueMana.action");

        //return "succeed";
        return "msg";
    }//del 按id删除信息方法 .............

    //get 按字段查询信息方法..........................
    public String yuyueGet()
    {
        yuyue yuyue=yuyueDAO.findById(id);



        {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyue", yuyue);


        {
            /*12getson*/
            //SonListGet

        }



        return ActionSupport.SUCCESS;

    }//get 按字段查询信息方法 ..........................

    //Detail 后台详情信息获取方法 ..........................
    public String yuyueDetail()
    {
        yuyue yuyue=yuyueDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyue", yuyue);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//Detail 后台详情信息获取方法 ..........................

    //DetailQian 前台详情信息获取方法..........................
    public String yuyueDetailQian()
    {
        yuyue yuyue=yuyueDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyue", yuyue);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//DetailQian 前台详情信息获取方法 ..........................

    //Xinxi 后台详情信息获取方法 ..........................
    public String yuyueXinxi()
    {
        yuyue yuyue=yuyueDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer xianluid = yuyue.getXianluid();
               //System.out.println(xianluid);
               if(!isEmpty(xianluid))
               {
                   yuyue.setXianlu(xianluDAO.findById(xianluid));
               }
               Integer usersid = yuyue.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuyue.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuyue", yuyue);


        {
            //SonListGet

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
