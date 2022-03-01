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
    /*2������*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.Integer  xianluid;
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
    public String yuyueAdd() {
        yuyue yuyue = new yuyue();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
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
            //����+��������  �û�����  �û���ID��
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

        this.setMessage("�����ɹ�");

        //return "succeed";
        return "msg";
    }
    //add��̨��ӹ��ܷ���ʵ�ִ���....................

    //addQianǰ̨��ӹ��ܷ���ʵ�ִ���...................
    public String yuyueAddQian() {
        yuyue yuyue = new yuyue();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
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
            //����+��������  �û�����  �û���ID��
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

        //this.setMessage("�����ɹ�");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQianǰ̨��ӹ��ܷ���ʵ�ִ���....................

    //set��̨��Ϣ�޸ķ���ʵ�ִ���...................
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


        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //set2��̨��Ϣ�޸ĺ����session����ʵ�ִ���...................
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

        //��Ϣ�޸���ɺ� ����session
        Map session=ActionContext.getContext().getSession();
        yuyue yuyuesession = (yuyue) session.get("user");
        if (yuyuesession!=null)
        {
            yuyue yuyuedatabase = yuyueDAO.findById(yuyuesession.getId());
            session.put("user", yuyuedatabase);
        }

        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //Mana ��̨��Ϣ�����б���ʵ�ִ���.............
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
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana ��̨��Ϣ�����б���ʵ�ִ���.............

    //ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............
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
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............



    //ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� ����.............
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
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� .............

    // manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............
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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............

    //manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ���  .............
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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ��� .............

    //ͨ�÷���
    //GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
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
                /*�������ԣ�������������������*/
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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............


    //Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............

    //SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............
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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............





    //SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
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
        int hsgpagesize=yuyueList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList.size());
        List yuyueList1 = yuyueList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(yuyueList.size());//�����ܹ�������
        p.setData(yuyueList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽��.............

    //del ��idɾ����Ϣ����.............
    public String yuyueDel()
    {
        yuyue yuyue=yuyueDAO.findById(id);
        yuyueDAO.delete(yuyue);

        this.setMessage("�����ɹ�");
        //this.setPath("yuyueMana.action");

        //return "succeed";
        return "msg";
    }//del ��idɾ����Ϣ���� .............

    //get ���ֶβ�ѯ��Ϣ����..........................
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

    }//get ���ֶβ�ѯ��Ϣ���� ..........................

    //Detail ��̨������Ϣ��ȡ���� ..........................
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
    }//Detail ��̨������Ϣ��ȡ���� ..........................

    //DetailQian ǰ̨������Ϣ��ȡ����..........................
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
    }//DetailQian ǰ̨������Ϣ��ȡ���� ..........................

    //Xinxi ��̨������Ϣ��ȡ���� ..........................
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
