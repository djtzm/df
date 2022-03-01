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

public class dxAction extends ActionSupport
{
    /*2������*/
	private  java.lang.Integer  id;
	private  java.lang.String  leibie;
	private  java.lang.String  content;
	private  java.lang.String  addtime;

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
	public java.lang.String  getLeibie() {
		return leibie;
	}
	public void  setLeibie(java.lang.String leibie) {
		this.leibie = leibie;
	}
	public java.lang.String  getContent() {
		return content;
	}
	public void  setContent(java.lang.String content) {
		this.content = content;
	}
	public java.lang.String  getAddtime() {
		return addtime;
	}
	public void  setAddtime(java.lang.String addtime) {
		this.addtime = addtime;
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
    public String dxAdd() {
        dx dx = new dx();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            dx.setId(id);
        }
        if(!isEmpty(leibie))
        {
            dx.setLeibie(leibie);
        }
        if(!isEmpty(content))
        {
            dx.setContent(content);
        }
        if(!isEmpty(addtime))
        {
            dx.setAddtime(addtime);
        }


        dxDAO.save(dx);

        this.setMessage("�����ɹ�");

        //return "succeed";
        return "msg";
    }
    //add��̨��ӹ��ܷ���ʵ�ִ���....................

    //addQianǰ̨��ӹ��ܷ���ʵ�ִ���...................
    public String dxAddQian() {
        dx dx = new dx();
        /*8addbody*/
        /*�������ԣ�����������*/
        /*8addbodyuserid*/
        /*�������ԣ�����������,�û����������Ӧ�û�����������û�id����*/
        if(!isEmpty(id))
        {
            dx.setId(id);
        }
        if(!isEmpty(leibie))
        {
            dx.setLeibie(leibie);
        }
        if(!isEmpty(content))
        {
            dx.setContent(content);
        }
        if(!isEmpty(addtime))
        {
            dx.setAddtime(addtime);
        }



        dxDAO.save(dx);

        //this.setMessage("�����ɹ�");

        //return ActionSupport.SUCCESS;
        return "msgqian";
    } //addQianǰ̨��ӹ��ܷ���ʵ�ִ���....................

    //set��̨��Ϣ�޸ķ���ʵ�ִ���...................
    public String dxSet()
    {
        dx dx=dxDAO.findById(id);
        /*10setbody*/

        if(!isEmpty(id))
        {
                dx.setId(id);
        }
        if(!isEmpty(leibie))
        {
                dx.setLeibie(leibie);
        }
        if(!isEmpty(content))
        {
                dx.setContent(content);
        }
        if(!isEmpty(addtime))
        {
                dx.setAddtime(addtime);
        }


        dxDAO.attachDirty(dx);


        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //set2��̨��Ϣ�޸ĺ����session����ʵ�ִ���...................
    public String dxSet2()
    {
        dx dx=dxDAO.findById(id);
        /*10setbody*/

                if(!isEmpty(id))
        {
                dx.setId(id);
        }
        if(!isEmpty(leibie))
        {
                dx.setLeibie(leibie);
        }
        if(!isEmpty(content))
        {
                dx.setContent(content);
        }
        if(!isEmpty(addtime))
        {
                dx.setAddtime(addtime);
        }


        dxDAO.attachDirty(dx);

        //��Ϣ�޸���ɺ� ����session
        Map session=ActionContext.getContext().getSession();
        dx dxsession = (dx) session.get("user");
        if (dxsession!=null)
        {
            dx dxdatabase = dxDAO.findById(dxsession.getId());
            session.put("user", dxdatabase);
        }

        //this.setMessage("�����ɹ�");
        //return "succeed";
        return "msg";
    }//set ��̨��Ϣ�޸ķ���ʵ�ִ���....................

    //Mana ��̨��Ϣ�����б���ʵ�ִ���.............
    public String dxMana()
    {
        String sql="from dx where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(leibie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibie='"+leibie+ "' ";
        }

        if(!isEmpty(content))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and content='"+content+ "' ";
        }

        if(!isEmpty(addtime))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and addtime='"+addtime+ "' ";
        }


        System.out.println(sql);
        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);
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
        request.put("dxList", dxList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//mana ��̨��Ϣ�����б���ʵ�ִ���.............

    //ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............
    public String dxManaQian()
    {
        String sql="from dx where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(leibie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibie='"+leibie+ "' ";
        }

        if(!isEmpty(content))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and content='"+content+ "' ";
        }

        if(!isEmpty(addtime))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and addtime='"+addtime+ "' ";
        }

        sql= sql + " order by id desc";

        System.out.println(sql);
        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQian ǰ̨��Ϣ�б���ʵ�ִ���.............



    //ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� ����.............
    public String dxManaQianSort()
    {
        String sql="from dx where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(leibie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibie='"+leibie+ "' ";
        }

        if(!isEmpty(content))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and content='"+content+ "' ";
        }

        if(!isEmpty(addtime))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and addtime='"+addtime+ "' ";
        }

        sql= sql + " order by dianjicishu desc";

        System.out.println(sql);
        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
                //FatherEntitySetStr
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);


        return ActionSupport.SUCCESS;
    }//ManaQianSort ǰ̨��Ϣ�����б���ʵ�ִ��� .............

    // manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............
    public String dxManaMy()
    {
        String sql="from dx where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(leibie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibie='"+leibie+ "' ";
        }

        if(!isEmpty(content))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and content='"+content+ "' ";
        }

        if(!isEmpty(addtime))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and addtime='"+addtime+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int hsgpagesize=dxList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMy ��̨�ҵ���Ϣ�б���ʵ�ִ���.............

    //manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ���  .............
    public String dxManaMyQian()
    {
        String sql="from dx where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(leibie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibie='"+leibie+ "' ";
        }

        if(!isEmpty(content))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and content='"+content+ "' ";
        }

        if(!isEmpty(addtime))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and addtime='"+addtime+ "' ";
        }


        Map session=ActionContext.getContext().getSession();
        users userssession=(users)session.get("user");
        if (userssession != null )
        {
            String usersid = userssession.getId()+"";
            sql=sql+" and ='" + usersid + "'";
        }

        System.out.println(sql);
        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
                //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int hsgpagesize=dxList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//manaMyQian ǰ̨�ҵ���Ϣ�б���ʵ�ִ��� .............

    //ͨ�÷���
    //GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String dxGetByAll()
    {
        String sql="from dx where 1=1 ";
        
        if(!isEmpty(id))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and id='"+id+ "' ";
        }

        if(!isEmpty(leibie))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and leibie='"+leibie+ "' ";
        }

        if(!isEmpty(content))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and content='"+content+ "' ";
        }

        if(!isEmpty(addtime))
        {
                //sql=sql + "biaoti like '%"+biaoti+ "%'";
                sql=sql + " and addtime='"+addtime+ "' ";
        }


        System.out.println(sql);
        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
                /*11fatherset*/
                //FatherEntitySetStr
                /*�������ԣ�������������������*/
                
            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int hsgpagesize=dxList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//GetByAll ���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............


    //Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String dxSearch()
    {
        String sql="from dx where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(leibie))
        {
            sql=sql + " and leibie like '%"+leibie+ "%' ";
        }
        if(!isEmpty(content))
        {
            sql=sql + " and content like '%"+content+ "%' ";
        }
        if(!isEmpty(addtime))
        {
            sql=sql + " and addtime like '%"+addtime+ "%' ";
        }

        System.out.println(sql);

        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int hsgpagesize=dxList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//Search ��̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............

    //SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............
    public String dxSearchMy()
    {
        String sql="from dx where 1=1 ";

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
        if(!isEmpty(leibie))
        {
            sql=sql + " and leibie like '%"+leibie+ "%' ";
        }
        if(!isEmpty(content))
        {
            sql=sql + " and content like '%"+content+ "%' ";
        }
        if(!isEmpty(addtime))
        {
            sql=sql + " and addtime like '%"+addtime+ "%' ";
        }

        System.out.println(sql);

        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int hsgpagesize=dxList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);





        return ActionSupport.SUCCESS;
    }//SearchMy ��̨���ֶβ�ѯ�ҵ���Ϣ����ʵ�ִ��뷽�� .............





    //SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽�� .............
    public String dxSearchQian()
    {
        String sql="from dx where 1=1 ";
        if(!isEmpty(id))
        {
            sql=sql + " and id like '%"+id+ "%' ";
        }
        if(!isEmpty(leibie))
        {
            sql=sql + " and leibie like '%"+leibie+ "%' ";
        }
        if(!isEmpty(content))
        {
            sql=sql + " and content like '%"+content+ "%' ";
        }
        if(!isEmpty(addtime))
        {
            sql=sql + " and addtime like '%"+addtime+ "%' ";
        }

        System.out.println(sql);

        List dxList=dxDAO.getHibernateTemplate().find(sql);

        for(int i=0;i<dxList.size();i++)
        {
            dx dx=(dx)dxList.get(i);

            {
            //FatherEntitySetStr

            }
        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dxList", dxList);

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
        int hsgpagesize=dxList.size()+1;
        //hsgpagesize=10;
        int fromIndex = (index - 1) * hsgpagesize;
        int toIndex = Math.min(fromIndex + hsgpagesize, dxList.size());
        List dxList1 = dxList.subList(fromIndex, toIndex);

        p.setIndex(index);//����ҳ��
        p.setPageSize(hsgpagesize);
        p.setTotle(dxList.size());//�����ܹ�������
        p.setData(dxList1);//��������

        request1.setAttribute("page", p);




        return ActionSupport.SUCCESS;
    }//SearchQian ǰ̨���ֶβ�ѯ������Ϣ����ʵ�ִ��뷽��.............

    //del ��idɾ����Ϣ����.............
    public String dxDel()
    {
        dx dx=dxDAO.findById(id);
        dxDAO.delete(dx);

        this.setMessage("�����ɹ�");
        //this.setPath("dxMana.action");

        //return "succeed";
        return "msg";
    }//del ��idɾ����Ϣ���� .............

    //get ���ֶβ�ѯ��Ϣ����..........................
    public String dxGet()
    {
        dx dx=dxDAO.findById(id);



        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dx", dx);


        {
            /*12getson*/
            //SonListGet

        }



        return ActionSupport.SUCCESS;

    }//get ���ֶβ�ѯ��Ϣ���� ..........................

    //Detail ��̨������Ϣ��ȡ���� ..........................
    public String dxDetail()
    {
        dx dx=dxDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dx", dx);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//Detail ��̨������Ϣ��ȡ���� ..........................

    //DetailQian ǰ̨������Ϣ��ȡ����..........................
    public String dxDetailQian()
    {
        dx dx=dxDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dx", dx);


        {
            //SonListGet

        }

        return ActionSupport.SUCCESS;
    }//DetailQian ǰ̨������Ϣ��ȡ���� ..........................

    //Xinxi ��̨������Ϣ��ȡ���� ..........................
    public String dxXinxi()
    {
        dx dx=dxDAO.findById(id);


        {
            //FatherEntitySetStr

        }

        Map request=(Map)ServletActionContext.getContext().get("request");
        request.put("dx", dx);


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
