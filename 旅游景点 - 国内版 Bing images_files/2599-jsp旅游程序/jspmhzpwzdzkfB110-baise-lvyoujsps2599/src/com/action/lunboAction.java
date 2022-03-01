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

public class lunboAction extends ActionSupport
{
    /*2列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  image;

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
	public java.lang.String  getImage() {
		return image;
	}
	public void  setImage(java.lang.String image) {
		this.image = image;
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
    public String lunboAdd() {
        lunbo lunbo = new lunbo();
        /*8addbody*/
        /*包含属性，表名，列名*/
        /*8addbodyuserid*/
        /*包含属性，表名，列名,用户表名，表对应用户添加列名，用户id列名*/
        if(!isEmpty(id))
        {
            lunbo.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            lunbo.setBiaoti(biaoti);
        }
        if(!isEmpty(image))
        {
            lunbo.setImage(image);
        }


        lunboDAO.save(lunbo);

        this.setMessage("操作成功");

        //return "succeed";
        return "msg";
    }
    //add后台添加功能方法实现代码....................

    //addQian前台添加功能方法实现代码...................
    public String lunboAddQian() {
        lunbo lunbo = new lunbo();
        /*8addbody*/
        /*包含属性，表名，列名*/
        /*8addbodyuserid*/
        /*包含属性，表名，列名,用户表名，表对应用户添加列名，用户id列名*/
        if(!isEmpty(id))
        {
            lunbo.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            lunbo.setBiaoti(biaoti);
        }
        if(!isEmpty(image))
        {
            lunbo.setImage(image);
        }



        lunboDAO.save(lunbo);

        //this.setMessage("操作成功");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQian前台添加功能方法实现代码....................

    //set后台信息修改方法实现代码...................
    public String lunboSet()
    {
        lunbo lunbo=lunboDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                lunbo.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                lunbo.setBiaoti(biaoti);
        }
        if(!isEmpty(image))
        {
                lunbo.setImage(image);
        }


        lunboDAO.attachDirty(lunbo);


        //this.setMessage("操作成功");
        //return "succeed";
        return "msg";
    }//set 后台信息修改方法实现代码....................

    //set2后台信息修改后更新session方法实现代码...................
    public String lunboSet2()
    {
        lunbo lunbo=lunboDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                lunbo.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                lunbo.setBiaoti(biaoti);
        }
        if(!isEmpty(image))
        {
                lunbo.setImage(image);
        }


        lunboDAO.attachDirty(lunbo);

        //信息修改完成后 更新session
        Map session=ActionContext.getContext().getSession();
        lunbo lunbosession = (lunbo) session.get("user");
        if (lunbosession!=null)
        {
            lunbo lunbodatabase = lunboDAO.findById(lunbosession.getId());
            session.put("user", lunbodatabase);
        }

        //this.setMessage("操作成功");
        //return "succeed";
        return "msg";
    }//set 后台信息修改方法实现代码....................

    //Mana 后台信息管理列表方法实现代码.............
    public String lunboMana()
    {
        String sql="from lunbo where 1=1 ";
        
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

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }


        System.out.println(sql);
        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);
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
        request.put("lunboList", lunboList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana 后台信息管理列表方法实现代码.............

    //ManaQian 前台信息列表方法实现代码.............
    public String lunboManaQian()
    {
        String sql="from lunbo where 1=1 ";
        
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

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        sql= sql + " order by id desc";

        System.out.println(sql);
        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian 前台信息列表方法实现代码.............



    //ManaQianSort 前台信息排序列表方法实现代码 方法.............
    public String lunboManaQianSort()
    {
        String sql="from lunbo where 1=1 ";
        
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

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        sql= sql + " order by dianjicishu desc";

        System.out.println(sql);
        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
                //FatherEntitySetStr
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort 前台信息排序列表方法实现代码 .............

    // manaMy 后台我的信息列表方法实现代码.............
    public String lunboManaMy()
    {
        String sql="from lunbo where 1=1 ";
        
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

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int hsgpagesize=lunboList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy 后台我的信息列表方法实现代码.............

    //manaMyQian 前台我的信息列表方法实现代码  .............
    public String lunboManaMyQian()
    {
        String sql="from lunbo where 1=1 ";
        
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

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int hsgpagesize=lunboList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian 前台我的信息列表方法实现代码 .............

    //通用方法
    //GetByAll 按字段查询所有信息方法实现代码方法 .............
    public String lunboGetByAll()
    {
        String sql="from lunbo where 1=1 ";
        
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

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }


        System.out.println(sql);
        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*包含属性，表名，列名，父表名*/
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int hsgpagesize=lunboList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll 按字段查询所有信息方法实现代码方法 .............


    //Search 后台按字段查询所有信息方法实现代码方法 .............
    public String lunboSearch()
    {
        String sql="from lunbo where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(image))
        {
            sql=sql + " and image like '%"+image+ "%' ";
        }

        System.out.println(sql);

        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int hsgpagesize=lunboList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search 后台按字段查询所有信息方法实现代码方法 .............

    //SearchMy 后台按字段查询我的信息方法实现代码方法 .............
    public String lunboSearchMy()
    {
        String sql="from lunbo where 1=1 ";

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
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(image))
        {
            sql=sql + " and image like '%"+image+ "%' ";
        }

        System.out.println(sql);

        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int hsgpagesize=lunboList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy 后台按字段查询我的信息方法实现代码方法 .............





    //SearchQian 前台按字段查询所有信息方法实现代码方法 .............
    public String lunboSearchQian()
    {
        String sql="from lunbo where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(image))
        {
            sql=sql + " and image like '%"+image+ "%' ";
        }

        System.out.println(sql);

        List lunboList=lunboDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<lunboList.size();i++)
        {
            lunbo lunbo=(lunbo)lunboList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunboList", lunboList);

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
        int hsgpagesize=lunboList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, lunboList.size());
        List lunboList1 = lunboList.subList(fromIndex, toIndex);

        p.setIndex(index);//设置页数
        p.setPageSize(hsgpagesize);
        p.setTotle(lunboList.size());//设置总共的条数
        p.setData(lunboList1);//设置数据

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian 前台按字段查询所有信息方法实现代码方法.............

    //del 按id删除信息方法.............
    public String lunboDel()
    {
        lunbo lunbo=lunboDAO.findById(id);
        lunboDAO.delete(lunbo);

        this.setMessage("操作成功");
        //this.setPath("lunboMana.action");

        //return "succeed";
        return "msg";
    }//del 按id删除信息方法 .............

    //get 按字段查询信息方法..........................
    public String lunboGet()
    {
        lunbo lunbo=lunboDAO.findById(id);



        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunbo", lunbo);


        {
            /*12getson*/
            //SonListGet

        }



        return ActionSupport.SUCCESS;

    }//get 按字段查询信息方法 ..........................

    //Detail 后台详情信息获取方法 ..........................
    public String lunboDetail()
    {
        lunbo lunbo=lunboDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunbo", lunbo);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//Detail 后台详情信息获取方法 ..........................

    //DetailQian 前台详情信息获取方法..........................
    public String lunboDetailQian()
    {
        lunbo lunbo=lunboDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunbo", lunbo);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//DetailQian 前台详情信息获取方法 ..........................

    //Xinxi 后台详情信息获取方法 ..........................
    public String lunboXinxi()
    {
        lunbo lunbo=lunboDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("lunbo", lunbo);


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
