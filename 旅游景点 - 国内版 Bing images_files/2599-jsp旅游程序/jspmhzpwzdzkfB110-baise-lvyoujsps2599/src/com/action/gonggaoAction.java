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

public class gonggaoAction extends ActionSupport
{
    /*2������*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  neirong;
	private  java.lang.String  tupian;
	private  java.lang.String  shijian;

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
	public java.lang.String  getNeirong() {
		return neirong;
	}
	public void  setNeirong(java.lang.String neirong) {
		this.neirong = neirong;
	}
	public java.lang.String  getTupian() {
		return tupian;
	}
	public void  setTupian(java.lang.String tupian) {
		this.tupian = tupian;
	}
	public java.lang.String  getShijian() {
		return shijian;
	}
	public void  setShijian(java.lang.String shijian) {
		this.shijian = shijian;
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
    public String gonggaoAdd() {
        gonggao gonggao = new gonggao();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            gonggao.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            gonggao.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
            gonggao.setNeirong(neirong);
        }
        if(!isEmpty(tupian))
        {
            gonggao.setTupian(tupian);
        }
        if(!isEmpty(shijian))
        {
            gonggao.setShijian(shijian);
        }


        gonggaoDAO.save(gonggao);

        this.setMessage("�����ɹ�");

        //return "succeed";
        return "msg";
    }
    //add��̨��ӹ��ܷ���ʵ�ִ���....................

    //addQianǰ̨��ӹ��ܷ���ʵ�ִ���...................
    public String gonggaoAddQian() {
        gonggao gonggao = new gonggao();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            gonggao.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            gonggao.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
            gonggao.setNeirong(neirong);
        }
        if(!isEmpty(tupian))
        {
            gonggao.setTupian(tupian);
        }
        if(!isEmpty(shijian))
        {
            gonggao.setShijian(shijian);
        }



        gonggaoDAO.save(gonggao);

        //this.setMessage("�����ɹ�");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQianǰ̨��ӹ��ܷ���ʵ�ִ���....................

    //set��̨��Ϣ�޸ķ���ʵ�ִ���...................
    public String gonggaoSet()
    {
        gonggao gonggao=gonggaoDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                gonggao.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                gonggao.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
                gonggao.setNeirong(neirong);
        }
        if(!isEmpty(tupian))
        {
                gonggao.setTupian(tupian);
        }
        if(!isEmpty(shijian))
        {
                gonggao.setShijian(shijian);
        }


        gonggaoDAO.attachDirty(gonggao);


        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //set2��̨��Ϣ�޸ĺ����session����ʵ�ִ���...................
    public String gonggaoSet2()
    {
        gonggao gonggao=gonggaoDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                gonggao.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                gonggao.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
                gonggao.setNeirong(neirong);
        }
        if(!isEmpty(tupian))
        {
                gonggao.setTupian(tupian);
        }
        if(!isEmpty(shijian))
        {
                gonggao.setShijian(shijian);
        }


        gonggaoDAO.attachDirty(gonggao);

        //��Ϣ�޸���ɺ� ����session
        Map session=ActionContext.getContext().getSession();
        gonggao gonggaosession = (gonggao) session.get("user");
        if (gonggaosession!=null)
        {
            gonggao gonggaodatabase = gonggaoDAO.findById(gonggaosession.getId());
            session.put("user", gonggaodatabase);
        }

        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //Mana ��̨��Ϣ�����б���ʵ�ִ���.............
    public String gonggaoMana()
    {
        String sql="from gonggao where 1=1 ";
        
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

        if(!isEmpty(neirong))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and neirong='"+neirong+ "' ";
        }

        if(!isEmpty(tupian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and tupian='"+tupian+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }


        System.out.println(sql);
        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);
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

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana ��̨��Ϣ�����б���ʵ�ִ���.............

    //ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............
    public String gonggaoManaQian()
    {
        String sql="from gonggao where 1=1 ";
        
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

        if(!isEmpty(neirong))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and neirong='"+neirong+ "' ";
        }

        if(!isEmpty(tupian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and tupian='"+tupian+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }

        sql= sql + " order by id desc";

        System.out.println(sql);
        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............



    //ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� ����.............
    public String gonggaoManaQianSort()
    {
        String sql="from gonggao where 1=1 ";
        
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

        if(!isEmpty(neirong))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and neirong='"+neirong+ "' ";
        }

        if(!isEmpty(tupian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and tupian='"+tupian+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }

        sql= sql + " order by dianjicishu desc";

        System.out.println(sql);
        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
                //FatherEntitySetStr
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� .............

    // manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............
    public String gonggaoManaMy()
    {
        String sql="from gonggao where 1=1 ";
        
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

        if(!isEmpty(neirong))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and neirong='"+neirong+ "' ";
        }

        if(!isEmpty(tupian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and tupian='"+tupian+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int hsgpagesize=gonggaoList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............

    //manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ���  .............
    public String gonggaoManaMyQian()
    {
        String sql="from gonggao where 1=1 ";
        
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

        if(!isEmpty(neirong))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and neirong='"+neirong+ "' ";
        }

        if(!isEmpty(tupian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and tupian='"+tupian+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int hsgpagesize=gonggaoList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ��� .............

    //ͨ�÷���
    //GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String gonggaoGetByAll()
    {
        String sql="from gonggao where 1=1 ";
        
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

        if(!isEmpty(neirong))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and neirong='"+neirong+ "' ";
        }

        if(!isEmpty(tupian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and tupian='"+tupian+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }


        System.out.println(sql);
        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*�������ԣ�������������������*/
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int hsgpagesize=gonggaoList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............


    //Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String gonggaoSearch()
    {
        String sql="from gonggao where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(neirong))
        {
            sql=sql + " and neirong like '%"+neirong+ "%' ";
        }
        if(!isEmpty(tupian))
        {
            sql=sql + " and tupian like '%"+tupian+ "%' ";
        }
        if(!isEmpty(shijian))
        {
            sql=sql + " and shijian like '%"+shijian+ "%' ";
        }

        System.out.println(sql);

        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int hsgpagesize=gonggaoList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............

    //SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............
    public String gonggaoSearchMy()
    {
        String sql="from gonggao where 1=1 ";

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
        if(!isEmpty(neirong))
        {
            sql=sql + " and neirong like '%"+neirong+ "%' ";
        }
        if(!isEmpty(tupian))
        {
            sql=sql + " and tupian like '%"+tupian+ "%' ";
        }
        if(!isEmpty(shijian))
        {
            sql=sql + " and shijian like '%"+shijian+ "%' ";
        }

        System.out.println(sql);

        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int hsgpagesize=gonggaoList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............





    //SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String gonggaoSearchQian()
    {
        String sql="from gonggao where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(biaoti))
        {
            sql=sql + " and biaoti like '%"+biaoti+ "%' ";
        }
        if(!isEmpty(neirong))
        {
            sql=sql + " and neirong like '%"+neirong+ "%' ";
        }
        if(!isEmpty(tupian))
        {
            sql=sql + " and tupian like '%"+tupian+ "%' ";
        }
        if(!isEmpty(shijian))
        {
            sql=sql + " and shijian like '%"+shijian+ "%' ";
        }

        System.out.println(sql);

        List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<gonggaoList.size();i++)
        {
            gonggao gonggao=(gonggao)gonggaoList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggaoList", gonggaoList);

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
        int hsgpagesize=gonggaoList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList.size());
        List gonggaoList1 = gonggaoList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(gonggaoList.size());//�����ܹ�������
        p.setData(gonggaoList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽��.............

    //del ��idɾ����Ϣ����.............
    public String gonggaoDel()
    {
        gonggao gonggao=gonggaoDAO.findById(id);
        gonggaoDAO.delete(gonggao);

        this.setMessage("�����ɹ�");
        //this.setPath("gonggaoMana.action");

        //return "succeed";
        return "msg";
    }//del ��idɾ����Ϣ���� .............

    //get ���ֶβ�ѯ��Ϣ����..........................
    public String gonggaoGet()
    {
        gonggao gonggao=gonggaoDAO.findById(id);



        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggao", gonggao);


        {
            /*12getson*/
            //SonListGet

        }



        return ActionSupport.SUCCESS;

    }//get ���ֶβ�ѯ��Ϣ���� ..........................

    //Detail ��̨������Ϣ��ȡ���� ..........................
    public String gonggaoDetail()
    {
        gonggao gonggao=gonggaoDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggao", gonggao);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//Detail ��̨������Ϣ��ȡ���� ..........................

    //DetailQian ǰ̨������Ϣ��ȡ����..........................
    public String gonggaoDetailQian()
    {
        gonggao gonggao=gonggaoDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggao", gonggao);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//DetailQian ǰ̨������Ϣ��ȡ���� ..........................

    //Xinxi ��̨������Ϣ��ȡ���� ..........................
    public String gonggaoXinxi()
    {
        gonggao gonggao=gonggaoDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("gonggao", gonggao);


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
