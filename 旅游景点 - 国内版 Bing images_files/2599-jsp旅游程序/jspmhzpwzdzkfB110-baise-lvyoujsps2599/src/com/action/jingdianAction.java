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

public class jingdianAction extends ActionSupport
{
    /*2������*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  neirong;
	private  java.lang.Integer  leibieid;
	private  java.lang.String  image;
	private  java.lang.Integer  jiage;
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
	public java.lang.Integer  getLeibieid() {
		return leibieid;
	}
	public void  setLeibieid(java.lang.Integer leibieid) {
		this.leibieid = leibieid;
	}
	public java.lang.String  getImage() {
		return image;
	}
	public void  setImage(java.lang.String image) {
		this.image = image;
	}
	public java.lang.Integer  getJiage() {
		return jiage;
	}
	public void  setJiage(java.lang.Integer jiage) {
		this.jiage = jiage;
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
    public String jingdianAdd() {
        jingdian jingdian = new jingdian();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            jingdian.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            jingdian.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
            jingdian.setNeirong(neirong);
        }
        if(!isEmpty(leibieid))
        {
            jingdian.setLeibieid(leibieid);
        }
        if(!isEmpty(image))
        {
            jingdian.setImage(image);
        }
        if(!isEmpty(jiage))
        {
            jingdian.setJiage(jiage);
        }
        if(!isEmpty(shijian))
        {
            jingdian.setShijian(shijian);
        }


        jingdianDAO.save(jingdian);

        this.setMessage("�����ɹ�");

        //return "succeed";
        return "msg";
    }
    //add��̨��ӹ��ܷ���ʵ�ִ���....................

    //addQianǰ̨��ӹ��ܷ���ʵ�ִ���...................
    public String jingdianAddQian() {
        jingdian jingdian = new jingdian();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            jingdian.setId(id);
        }
        if(!isEmpty(biaoti))
        {
            jingdian.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
            jingdian.setNeirong(neirong);
        }
        if(!isEmpty(leibieid))
        {
            jingdian.setLeibieid(leibieid);
        }
        if(!isEmpty(image))
        {
            jingdian.setImage(image);
        }
        if(!isEmpty(jiage))
        {
            jingdian.setJiage(jiage);
        }
        if(!isEmpty(shijian))
        {
            jingdian.setShijian(shijian);
        }



        jingdianDAO.save(jingdian);

        //this.setMessage("�����ɹ�");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQianǰ̨��ӹ��ܷ���ʵ�ִ���....................

    //set��̨��Ϣ�޸ķ���ʵ�ִ���...................
    public String jingdianSet()
    {
        jingdian jingdian=jingdianDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                jingdian.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                jingdian.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
                jingdian.setNeirong(neirong);
        }
        if(!isEmpty(leibieid))
        {
                jingdian.setLeibieid(leibieid);
        }
        if(!isEmpty(image))
        {
                jingdian.setImage(image);
        }
        if(!isEmpty(jiage))
        {
                jingdian.setJiage(jiage);
        }
        if(!isEmpty(shijian))
        {
                jingdian.setShijian(shijian);
        }


        jingdianDAO.attachDirty(jingdian);


        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //set2��̨��Ϣ�޸ĺ����session����ʵ�ִ���...................
    public String jingdianSet2()
    {
        jingdian jingdian=jingdianDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                jingdian.setId(id);
        }
        if(!isEmpty(biaoti))
        {
                jingdian.setBiaoti(biaoti);
        }
        if(!isEmpty(neirong))
        {
                jingdian.setNeirong(neirong);
        }
        if(!isEmpty(leibieid))
        {
                jingdian.setLeibieid(leibieid);
        }
        if(!isEmpty(image))
        {
                jingdian.setImage(image);
        }
        if(!isEmpty(jiage))
        {
                jingdian.setJiage(jiage);
        }
        if(!isEmpty(shijian))
        {
                jingdian.setShijian(shijian);
        }


        jingdianDAO.attachDirty(jingdian);

        //��Ϣ�޸���ɺ� ����session
        Map session=ActionContext.getContext().getSession();
        jingdian jingdiansession = (jingdian) session.get("user");
        if (jingdiansession!=null)
        {
            jingdian jingdiandatabase = jingdianDAO.findById(jingdiansession.getId());
            session.put("user", jingdiandatabase);
        }

        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //Mana ��̨��Ϣ�����б���ʵ�ִ���.............
    public String jingdianMana()
    {
        String sql="from jingdian where 1=1 ";
        
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

        if(!isEmpty(leibieid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibieid='"+leibieid+ "' ";
        }

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        if(!isEmpty(jiage))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiage='"+jiage+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }


        System.out.println(sql);
        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);
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
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana ��̨��Ϣ�����б���ʵ�ִ���.............

    //ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............
    public String jingdianManaQian()
    {
        String sql="from jingdian where 1=1 ";
        
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

        if(!isEmpty(leibieid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibieid='"+leibieid+ "' ";
        }

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        if(!isEmpty(jiage))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiage='"+jiage+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }

        sql= sql + " order by id desc";

        System.out.println(sql);
        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
                //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............



    //ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� ����.............
    public String jingdianManaQianSort()
    {
        String sql="from jingdian where 1=1 ";
        
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

        if(!isEmpty(leibieid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibieid='"+leibieid+ "' ";
        }

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        if(!isEmpty(jiage))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiage='"+jiage+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }

        sql= sql + " order by dianjicishu desc";

        System.out.println(sql);
        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
                //FatherEntitySetStr
                               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� .............

    // manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............
    public String jingdianManaMy()
    {
        String sql="from jingdian where 1=1 ";
        
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

        if(!isEmpty(leibieid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibieid='"+leibieid+ "' ";
        }

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        if(!isEmpty(jiage))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiage='"+jiage+ "' ";
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
        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
                //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int hsgpagesize=jingdianList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............

    //manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ���  .............
    public String jingdianManaMyQian()
    {
        String sql="from jingdian where 1=1 ";
        
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

        if(!isEmpty(leibieid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibieid='"+leibieid+ "' ";
        }

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        if(!isEmpty(jiage))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiage='"+jiage+ "' ";
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
        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
                //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int hsgpagesize=jingdianList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ��� .............

    //ͨ�÷���
    //GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String jingdianGetByAll()
    {
        String sql="from jingdian where 1=1 ";
        
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

        if(!isEmpty(leibieid))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibieid='"+leibieid+ "' ";
        }

        if(!isEmpty(image))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and image='"+image+ "' ";
        }

        if(!isEmpty(jiage))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and jiage='"+jiage+ "' ";
        }

        if(!isEmpty(shijian))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and shijian='"+shijian+ "' ";
        }


        System.out.println(sql);
        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*�������ԣ�������������������*/
                               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int hsgpagesize=jingdianList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............


    //Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String jingdianSearch()
    {
        String sql="from jingdian where 1=1 ";
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
        if(!isEmpty(leibieid))
        {
            sql=sql + " and leibieid='"+leibieid+ "' ";
        }
        if(!isEmpty(image))
        {
            sql=sql + " and image like '%"+image+ "%' ";
        }
        if(!isEmpty(jiage))
        {
            sql=sql + " and jiage like '%"+jiage+ "%' ";
        }
        if(!isEmpty(shijian))
        {
            sql=sql + " and shijian like '%"+shijian+ "%' ";
        }

        System.out.println(sql);

        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int hsgpagesize=jingdianList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............

    //SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............
    public String jingdianSearchMy()
    {
        String sql="from jingdian where 1=1 ";

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
        if(!isEmpty(leibieid))
        {
            sql=sql + " and leibieid='"+leibieid+ "' ";
        }
        if(!isEmpty(image))
        {
            sql=sql + " and image like '%"+image+ "%' ";
        }
        if(!isEmpty(jiage))
        {
            sql=sql + " and jiage like '%"+jiage+ "%' ";
        }
        if(!isEmpty(shijian))
        {
            sql=sql + " and shijian like '%"+shijian+ "%' ";
        }

        System.out.println(sql);

        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int hsgpagesize=jingdianList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............





    //SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String jingdianSearchQian()
    {
        String sql="from jingdian where 1=1 ";
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
        if(!isEmpty(leibieid))
        {
            sql=sql + " and leibieid='"+leibieid+ "' ";
        }
        if(!isEmpty(image))
        {
            sql=sql + " and image like '%"+image+ "%' ";
        }
        if(!isEmpty(jiage))
        {
            sql=sql + " and jiage like '%"+jiage+ "%' ";
        }
        if(!isEmpty(shijian))
        {
            sql=sql + " and shijian like '%"+shijian+ "%' ";
        }

        System.out.println(sql);

        List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<jingdianList.size();i++)
        {
            jingdian jingdian=(jingdian)jingdianList.get(i);

            {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdianList", jingdianList);

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
        int hsgpagesize=jingdianList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList.size());
        List jingdianList1 = jingdianList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(jingdianList.size());//�����ܹ�������
        p.setData(jingdianList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽��.............

    //del ��idɾ����Ϣ����.............
    public String jingdianDel()
    {
        jingdian jingdian=jingdianDAO.findById(id);
        jingdianDAO.delete(jingdian);

        this.setMessage("�����ɹ�");
        //this.setPath("jingdianMana.action");

        //return "succeed";
        return "msg";
    }//del ��idɾ����Ϣ���� .............

    //get ���ֶβ�ѯ��Ϣ����..........................
    public String jingdianGet()
    {
        jingdian jingdian=jingdianDAO.findById(id);



        {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdian", jingdian);


        {
            /*12getson*/
            //SonListGet

                    {
                        String sql="from pinglun where jingdianid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where jingdianid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

        }



        return ActionSupport.SUCCESS;

    }//get ���ֶβ�ѯ��Ϣ���� ..........................

    //Detail ��̨������Ϣ��ȡ���� ..........................
    public String jingdianDetail()
    {
        jingdian jingdian=jingdianDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdian", jingdian);


        {
            //SonListGet

                    {
                        String sql="from pinglun where jingdianid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where jingdianid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

        }

        return ActionSupport.SUCCESS;
    }//Detail ��̨������Ϣ��ȡ���� ..........................

    //DetailQian ǰ̨������Ϣ��ȡ����..........................
    public String jingdianDetailQian()
    {
        jingdian jingdian=jingdianDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdian", jingdian);


        {
            //SonListGet

                    {
                        String sql="from pinglun where jingdianid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where jingdianid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

        }

        return ActionSupport.SUCCESS;
    }//DetailQian ǰ̨������Ϣ��ȡ���� ..........................

    //Xinxi ��̨������Ϣ��ȡ���� ..........................
    public String jingdianXinxi()
    {
        jingdian jingdian=jingdianDAO.findById(id);


        {
            //FatherEntitySetStr
               Integer leibieid = jingdian.getLeibieid();
               //System.out.println(leibieid);
               if(!isEmpty(leibieid))
               {
                   jingdian.setLeibie(leibieDAO.findById(leibieid));
               }

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("jingdian", jingdian);


        {
            //SonListGet

                    {
                        String sql="from pinglun where jingdianid="+id;
                        List pinglunList =pinglunDAO.getHibernateTemplate().find(sql);
                        request.put("pinglunList", pinglunList);
                    }

                    {
                        String sql="from shoucang where jingdianid="+id;
                        List shoucangList =shoucangDAO.getHibernateTemplate().find(sql);
                        request.put("shoucangList", shoucangList);
                    }

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
