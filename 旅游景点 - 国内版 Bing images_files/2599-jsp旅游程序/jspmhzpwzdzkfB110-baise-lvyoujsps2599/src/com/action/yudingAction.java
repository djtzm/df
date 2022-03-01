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

public class yudingAction extends ActionSupport
{
    /*2������*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.Integer  jiudianid;
	private  java.lang.Integer  usersid;
	private  java.lang.String  riqi;
	private  java.lang.String  xingming;
	private  java.lang.String  dianhua;
	private  java.lang.String  beizhu;

    /*3 DAO������*/
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
    /*5�����Է���*/
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
	public java.lang.Integer  getJiudianid() {
		return jiudianid;
	}
	public void  setJiudianid(java.lang.Integer jiudianid) {
		this.jiudianid = jiudianid;
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


    /*6 DAO�����Է���*/
	//chanpinDAOget��set����
	public chanpinDAO getChanpinDAO()
	{
		return chanpinDAO;
	}
	public void setChanpinDAO(chanpinDAO chanpinDAO)
	{
		this.chanpinDAO = chanpinDAO;
	}

	//dxDAOget��set����
	public dxDAO getDxDAO()
	{
		return dxDAO;
	}
	public void setDxDAO(dxDAO dxDAO)
	{
		this.dxDAO = dxDAO;
	}

	//gonggaoDAOget��set����
	public gonggaoDAO getGonggaoDAO()
	{
		return gonggaoDAO;
	}
	public void setGonggaoDAO(gonggaoDAO gonggaoDAO)
	{
		this.gonggaoDAO = gonggaoDAO;
	}

	//jingdianDAOget��set����
	public jingdianDAO getJingdianDAO()
	{
		return jingdianDAO;
	}
	public void setJingdianDAO(jingdianDAO jingdianDAO)
	{
		this.jingdianDAO = jingdianDAO;
	}

	//jiudianDAOget��set����
	public jiudianDAO getJiudianDAO()
	{
		return jiudianDAO;
	}
	public void setJiudianDAO(jiudianDAO jiudianDAO)
	{
		this.jiudianDAO = jiudianDAO;
	}

	//leibieDAOget��set����
	public leibieDAO getLeibieDAO()
	{
		return leibieDAO;
	}
	public void setLeibieDAO(leibieDAO leibieDAO)
	{
		this.leibieDAO = leibieDAO;
	}

	//lianjieDAOget��set����
	public lianjieDAO getLianjieDAO()
	{
		return lianjieDAO;
	}
	public void setLianjieDAO(lianjieDAO lianjieDAO)
	{
		this.lianjieDAO = lianjieDAO;
	}

	//liuyanDAOget��set����
	public liuyanDAO getLiuyanDAO()
	{
		return liuyanDAO;
	}
	public void setLiuyanDAO(liuyanDAO liuyanDAO)
	{
		this.liuyanDAO = liuyanDAO;
	}

	//lunboDAOget��set����
	public lunboDAO getLunboDAO()
	{
		return lunboDAO;
	}
	public void setLunboDAO(lunboDAO lunboDAO)
	{
		this.lunboDAO = lunboDAO;
	}

	//meishiDAOget��set����
	public meishiDAO getMeishiDAO()
	{
		return meishiDAO;
	}
	public void setMeishiDAO(meishiDAO meishiDAO)
	{
		this.meishiDAO = meishiDAO;
	}

	//pinglunDAOget��set����
	public pinglunDAO getPinglunDAO()
	{
		return pinglunDAO;
	}
	public void setPinglunDAO(pinglunDAO pinglunDAO)
	{
		this.pinglunDAO = pinglunDAO;
	}

	//shoucangDAOget��set����
	public shoucangDAO getShoucangDAO()
	{
		return shoucangDAO;
	}
	public void setShoucangDAO(shoucangDAO shoucangDAO)
	{
		this.shoucangDAO = shoucangDAO;
	}

	//usersDAOget��set����
	public usersDAO getUsersDAO()
	{
		return usersDAO;
	}
	public void setUsersDAO(usersDAO usersDAO)
	{
		this.usersDAO = usersDAO;
	}

	//xianluDAOget��set����
	public xianluDAO getXianluDAO()
	{
		return xianluDAO;
	}
	public void setXianluDAO(xianluDAO xianluDAO)
	{
		this.xianluDAO = xianluDAO;
	}

	//yudingDAOget��set����
	public yudingDAO getYudingDAO()
	{
		return yudingDAO;
	}
	public void setYudingDAO(yudingDAO yudingDAO)
	{
		this.yudingDAO = yudingDAO;
	}

	//yuyueDAOget��set����
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

    //add ��̨��ӹ��ܷ���ʵ�ִ���...................
    public String yudingAdd() {
        yuding yuding = new yuding();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            yuding.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            yuding.setBiaoti(biaoti);
        }
        if(!isEmpty(jiudianid))
        {
            yuding.setJiudianid(jiudianid);
        }
        HttpServletRequest request=ServletActionContext.getRequest();
        Map session=ActionContext.getContext().getSession();
        users users=(users)session.get("user");
        if(users != null)
        {
            //����+��������  �û�����  �û���ID��
            yuding.setUsersid(users.getId());
        }

        
        if(!isEmpty(riqi))
        {
            yuding.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
            yuding.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
            yuding.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
            yuding.setBeizhu(beizhu);
        }


        yudingDAO.save(yuding);

        this.setMessage("�����ɹ�");

        //return "succeed";
        return "msg";
    }
    //add��̨��ӹ��ܷ���ʵ�ִ���....................

    //addQianǰ̨��ӹ��ܷ���ʵ�ִ���...................
    public String yudingAddQian() {
        yuding yuding = new yuding();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            yuding.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            yuding.setBiaoti(biaoti);
        }
        if(!isEmpty(jiudianid))
        {
            yuding.setJiudianid(jiudianid);
        }
        HttpServletRequest request=ServletActionContext.getRequest();
        Map session=ActionContext.getContext().getSession();
        users users=(users)session.get("user");
        if(users != null)
        {
            //����+��������  �û�����  �û���ID��
            yuding.setUsersid(users.getId());
        }

        
        if(!isEmpty(riqi))
        {
            yuding.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
            yuding.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
            yuding.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
            yuding.setBeizhu(beizhu);
        }



        yudingDAO.save(yuding);

        //this.setMessage("�����ɹ�");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQianǰ̨��ӹ��ܷ���ʵ�ִ���....................

    //set��̨��Ϣ�޸ķ���ʵ�ִ���...................
    public String yudingSet()
    {
        yuding yuding=yudingDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                yuding.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                yuding.setBiaoti(biaoti);
        }
        if(!isEmpty(jiudianid))
        {
                yuding.setJiudianid(jiudianid);
        }
        if(!isEmpty(usersid))
        {
                yuding.setUsersid(usersid);
        }
        if(!isEmpty(riqi))
        {
                yuding.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
                yuding.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
                yuding.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
                yuding.setBeizhu(beizhu);
        }


        yudingDAO.attachDirty(yuding);


        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //set2��̨��Ϣ�޸ĺ����session����ʵ�ִ���...................
    public String yudingSet2()
    {
        yuding yuding=yudingDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                yuding.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                yuding.setBiaoti(biaoti);
        }
        if(!isEmpty(jiudianid))
        {
                yuding.setJiudianid(jiudianid);
        }
        if(!isEmpty(usersid))
        {
                yuding.setUsersid(usersid);
        }
        if(!isEmpty(riqi))
        {
                yuding.setRiqi(riqi);
        }
        if(!isEmpty(xingming))
        {
                yuding.setXingming(xingming);
        }
        if(!isEmpty(dianhua))
        {
                yuding.setDianhua(dianhua);
        }
        if(!isEmpty(beizhu))
        {
                yuding.setBeizhu(beizhu);
        }


        yudingDAO.attachDirty(yuding);

        //��Ϣ�޸���ɺ� ����session
        Map session=ActionContext.getContext().getSession();
        yuding yudingsession = (yuding) session.get("user");
        if (yudingsession!=null)
        {
            yuding yudingdatabase = yudingDAO.findById(yudingsession.getId());
            session.put("user", yudingdatabase);
        }

        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //Mana ��̨��Ϣ�����б���ʵ�ִ���.............
    public String yudingMana()
    {
        String sql="from yuding where 1=1 ";
        
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

        if(!isEmpty(jiudianid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiudianid='"+jiudianid+ "' ";
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
        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);
            //ʾ������
            //Integer leibieid = xinwen.getLeibieid();
            //System.out.println(leibieid);
            //if(leibieid != null )
            //{
            //  xinwen.setLeibie(leibieDAO.findById(leibieid));
            //}
            {
                /*11fatherset*/
                //FatherEntitySetStr
        /*�������ԣ�������������������*/
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��ҳ���ִ���ʵ��
        /*�������ԣ�����*/

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

        Pagination p = new Pagination();//���� ��ҳ����
        int hsgpagesize=p.getPageSize();
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana ��̨��Ϣ�����б���ʵ�ִ���.............

    //ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............
    public String yudingManaQian()
    {
        String sql="from yuding where 1=1 ";
        
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

        if(!isEmpty(jiudianid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiudianid='"+jiudianid+ "' ";
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
        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
                //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��ҳ���ִ���ʵ��

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

        Pagination p = new Pagination();//���� ��ҳ����
        int hsgpagesize=p.getPageSize();
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............



    //ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� ����.............
    public String yudingManaQianSort()
    {
        String sql="from yuding where 1=1 ";
        
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

        if(!isEmpty(jiudianid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiudianid='"+jiudianid+ "' ";
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
        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
                //FatherEntitySetStr
                               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��ҳ���ִ���ʵ��
        
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

        Pagination p = new Pagination();//���� ��ҳ����
        int hsgpagesize=p.getPageSize();
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� .............

    // manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............
    public String yudingManaMy()
    {
        String sql="from yuding where 1=1 ";
        
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

        if(!isEmpty(jiudianid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiudianid='"+jiudianid+ "' ";
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
        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
                //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��̬��ҳ���ִ��뵥��ʵ��
                //��̬��ҳ���ִ��뵥��ʵ��
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

        Pagination p = new Pagination();//���� ��ҳ����
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=yudingList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............

    //manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ���  .............
    public String yudingManaMyQian()
    {
        String sql="from yuding where 1=1 ";
        
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

        if(!isEmpty(jiudianid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiudianid='"+jiudianid+ "' ";
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
        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
                //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��̬��ҳ���ִ��뵥��ʵ��
                //��̬��ҳ���ִ��뵥��ʵ��
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

        Pagination p = new Pagination();//���� ��ҳ����
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=yudingList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ��� .............

    //ͨ�÷���
    //GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String yudingGetByAll()
    {
        String sql="from yuding where 1=1 ";
        
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

        if(!isEmpty(jiudianid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiudianid='"+jiudianid+ "' ";
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
        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*�������ԣ�������������������*/
                               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��ҳ���ִ���ʵ��
        /*�������ԣ�����*/
                //��̬��ҳ���ִ��뵥��ʵ��
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

        Pagination p = new Pagination();//���� ��ҳ����
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=yudingList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............


    //Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String yudingSearch()
    {
        String sql="from yuding where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(jiudianid))
        {
            sql=sql + " and jiudianid='"+jiudianid+ "' ";
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

        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��̬��ҳ���ִ��뵥��ʵ��
                //��̬��ҳ���ִ��뵥��ʵ��
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

        Pagination p = new Pagination();//���� ��ҳ����
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=yudingList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............

    //SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............
    public String yudingSearchMy()
    {
        String sql="from yuding where 1=1 ";

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
        if(!isEmpty(jiudianid))
        {
            sql=sql + " and jiudianid='"+jiudianid+ "' ";
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

        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��̬��ҳ���ִ��뵥��ʵ��
                //��̬��ҳ���ִ��뵥��ʵ��
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

        Pagination p = new Pagination();//���� ��ҳ����
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=yudingList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............





    //SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String yudingSearchQian()
    {
        String sql="from yuding where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(jiudianid))
        {
            sql=sql + " and jiudianid='"+jiudianid+ "' ";
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

        List yudingList=yudingDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<yudingList.size();i++)
        {
            yuding yuding=(yuding)yudingList.get(i);

            {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yudingList", yudingList);

        //��̬��ҳ���ִ��뵥��ʵ��
                //��̬��ҳ���ִ��뵥��ʵ��
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

        Pagination p = new Pagination();//���� ��ҳ����
        //int hsgpagesize=p.getPageSize();
        int hsgpagesize=yudingList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yudingList.size());
        List yudingList1 = yudingList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yudingList.size());//�����ܹ�������
        p.setData(yudingList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽��.............

    //del ��idɾ����Ϣ����.............
    public String yudingDel()
    {
        yuding yuding=yudingDAO.findById(id);
        yudingDAO.delete(yuding);

        this.setMessage("�����ɹ�");
        //this.setPath("yudingMana.action");

        //return "succeed";
        return "msg";
    }//del ��idɾ����Ϣ���� .............

    //get ���ֶβ�ѯ��Ϣ����..........................
    public String yudingGet()
    {
        yuding yuding=yudingDAO.findById(id);



        {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuding", yuding);


        {
            /*12getson*/
            //SonListGet

        }



        return ActionSupport.SUCCESS;

    }//get ���ֶβ�ѯ��Ϣ���� ..........................

    //Detail ��̨������Ϣ��ȡ���� ..........................
    public String yudingDetail()
    {
        yuding yuding=yudingDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuding", yuding);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//Detail ��̨������Ϣ��ȡ���� ..........................

    //DetailQian ǰ̨������Ϣ��ȡ����..........................
    public String yudingDetailQian()
    {
        yuding yuding=yudingDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuding", yuding);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//DetailQian ǰ̨������Ϣ��ȡ���� ..........................

    //Xinxi ��̨������Ϣ��ȡ���� ..........................
    public String yudingXinxi()
    {
        yuding yuding=yudingDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer jiudianid = yuding.getJiudianid();
               //System.out.println(jiudianid);
               if(!isEmpty(jiudianid))
               {
                   yuding.setJiudian(jiudianDAO.findById(jiudianid));
               }
               Integer usersid = yuding.getUsersid();
               //System.out.println(usersid);
               if(!isEmpty(usersid))
               {
                   yuding.setUsers(usersDAO.findById(usersid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("yuding", yuding);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//Xinxi Detail ��̨������Ϣ��ȡ����

    /*14�ؼ�������,���Բ�ʹ��*/
/*classNameLowerAction.notuse.actionsearchbycolunmalljavaList*/
    /*17���в�ѯ*/
/*classNameLowerAction.notuse.actiongetbycolunmalljavaList*/
    /*20�ֶ�����,���Բ�ʹ��*/
/*classNameLowerAction.notuse.actionsetbycolunmalljavaList*/

    //�ж��ַ������������Ƿ�Ϊ�շ���
    public static boolean isEmpty(String cs) {
        return cs == null || cs.length() == 0;
    }

    //�ж��������������Ƿ�Ϊ�շ���
    public static boolean isEmpty(Integer csi) {
        return csi == null;
    }
}
