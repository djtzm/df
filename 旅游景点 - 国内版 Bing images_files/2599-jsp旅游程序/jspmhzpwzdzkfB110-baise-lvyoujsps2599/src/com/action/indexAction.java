package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import javax.servlet.http.HttpServletRequest;

import com.dao.*;
import com.model.*;
import com.util.*;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class indexAction extends ActionSupport
{
    /*2������*/
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

    /*3�����Է���*/
	public chanpinDAO getChanpinDAO() {
		return chanpinDAO;
	}
	public void setChanpinDAO(chanpinDAO chanpinDAO) {
		this.chanpinDAO = chanpinDAO;
	}
	public dxDAO getDxDAO() {
		return dxDAO;
	}
	public void setDxDAO(dxDAO dxDAO) {
		this.dxDAO = dxDAO;
	}
	public gonggaoDAO getGonggaoDAO() {
		return gonggaoDAO;
	}
	public void setGonggaoDAO(gonggaoDAO gonggaoDAO) {
		this.gonggaoDAO = gonggaoDAO;
	}
	public jingdianDAO getJingdianDAO() {
		return jingdianDAO;
	}
	public void setJingdianDAO(jingdianDAO jingdianDAO) {
		this.jingdianDAO = jingdianDAO;
	}
	public jiudianDAO getJiudianDAO() {
		return jiudianDAO;
	}
	public void setJiudianDAO(jiudianDAO jiudianDAO) {
		this.jiudianDAO = jiudianDAO;
	}
	public leibieDAO getLeibieDAO() {
		return leibieDAO;
	}
	public void setLeibieDAO(leibieDAO leibieDAO) {
		this.leibieDAO = leibieDAO;
	}
	public lianjieDAO getLianjieDAO() {
		return lianjieDAO;
	}
	public void setLianjieDAO(lianjieDAO lianjieDAO) {
		this.lianjieDAO = lianjieDAO;
	}
	public liuyanDAO getLiuyanDAO() {
		return liuyanDAO;
	}
	public void setLiuyanDAO(liuyanDAO liuyanDAO) {
		this.liuyanDAO = liuyanDAO;
	}
	public lunboDAO getLunboDAO() {
		return lunboDAO;
	}
	public void setLunboDAO(lunboDAO lunboDAO) {
		this.lunboDAO = lunboDAO;
	}
	public meishiDAO getMeishiDAO() {
		return meishiDAO;
	}
	public void setMeishiDAO(meishiDAO meishiDAO) {
		this.meishiDAO = meishiDAO;
	}
	public pinglunDAO getPinglunDAO() {
		return pinglunDAO;
	}
	public void setPinglunDAO(pinglunDAO pinglunDAO) {
		this.pinglunDAO = pinglunDAO;
	}
	public shoucangDAO getShoucangDAO() {
		return shoucangDAO;
	}
	public void setShoucangDAO(shoucangDAO shoucangDAO) {
		this.shoucangDAO = shoucangDAO;
	}
	public usersDAO getUsersDAO() {
		return usersDAO;
	}
	public void setUsersDAO(usersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	public xianluDAO getXianluDAO() {
		return xianluDAO;
	}
	public void setXianluDAO(xianluDAO xianluDAO) {
		this.xianluDAO = xianluDAO;
	}
	public yudingDAO getYudingDAO() {
		return yudingDAO;
	}
	public void setYudingDAO(yudingDAO yudingDAO) {
		this.yudingDAO = yudingDAO;
	}
	public yuyueDAO getYuyueDAO() {
		return yuyueDAO;
	}
	public void setYuyueDAO(yuyueDAO yuyueDAO) {
		this.yuyueDAO = yuyueDAO;
	}

    public String index()
    {
        Map request=(Map)ServletActionContext.getContext().get("request");
        Map session=ActionContext.getContext().getSession();
        //HttpServletRequest request1=ServletActionContext.getRequest();
        //request��session get end.........

        /*4indexbody����*/

		//��ȡchanpin��Ϣstart............................................................................
		int chanpinidindex = 1;
		String chanpinsql1="from chanpin where id="+chanpinidindex+"";
		List chanpinList1=chanpinDAO.getHibernateTemplate().find(chanpinsql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(chanpinList1.size() > 0)
		{
			request.put("chanpin", chanpinList1.get(0));
			session.put("chanpin", chanpinList1.get(0));
		}
		else
		{
			//request.put("chanpin", null);
			//session.put("chanpin", null);
		}

		String chanpinsql2="from chanpin ";
		List chanpinList2 =chanpinDAO.getHibernateTemplate().find(chanpinsql2);
		request.put("chanpinList", chanpinList2);
		session.put("chanpinList", chanpinList2);
		request.put("chanpinListSize", chanpinList2.size());
		session.put("chanpinListSize", chanpinList2.size());
		//��ȡchanpinidindex��chanpinList��chanpinListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, chanpinList2.size());
			List chanpinList3 = chanpinList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(chanpinList2.size());//�����ܹ�������
			p.setData(chanpinList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡdx��Ϣstart............................................................................
		int dxidindex = 1;
		String dxsql1="from dx where id="+dxidindex+"";
		List dxList1=dxDAO.getHibernateTemplate().find(dxsql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(dxList1.size() > 0)
		{
			request.put("dx", dxList1.get(0));
			session.put("dx", dxList1.get(0));
		}
		else
		{
			//request.put("dx", null);
			//session.put("dx", null);
		}

		String dxsql2="from dx ";
		List dxList2 =dxDAO.getHibernateTemplate().find(dxsql2);
		request.put("dxList", dxList2);
		session.put("dxList", dxList2);
		request.put("dxListSize", dxList2.size());
		session.put("dxListSize", dxList2.size());
		//��ȡdxidindex��dxList��dxListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, dxList2.size());
			List dxList3 = dxList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(dxList2.size());//�����ܹ�������
			p.setData(dxList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡgonggao��Ϣstart............................................................................
		int gonggaoidindex = 1;
		String gonggaosql1="from gonggao where id="+gonggaoidindex+"";
		List gonggaoList1=gonggaoDAO.getHibernateTemplate().find(gonggaosql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(gonggaoList1.size() > 0)
		{
			request.put("gonggao", gonggaoList1.get(0));
			session.put("gonggao", gonggaoList1.get(0));
		}
		else
		{
			//request.put("gonggao", null);
			//session.put("gonggao", null);
		}

		String gonggaosql2="from gonggao ";
		List gonggaoList2 =gonggaoDAO.getHibernateTemplate().find(gonggaosql2);
		request.put("gonggaoList", gonggaoList2);
		session.put("gonggaoList", gonggaoList2);
		request.put("gonggaoListSize", gonggaoList2.size());
		session.put("gonggaoListSize", gonggaoList2.size());
		//��ȡgonggaoidindex��gonggaoList��gonggaoListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, gonggaoList2.size());
			List gonggaoList3 = gonggaoList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(gonggaoList2.size());//�����ܹ�������
			p.setData(gonggaoList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡjingdian��Ϣstart............................................................................
		int jingdianidindex = 1;
		String jingdiansql1="from jingdian where id="+jingdianidindex+"";
		List jingdianList1=jingdianDAO.getHibernateTemplate().find(jingdiansql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(jingdianList1.size() > 0)
		{
			request.put("jingdian", jingdianList1.get(0));
			session.put("jingdian", jingdianList1.get(0));
		}
		else
		{
			//request.put("jingdian", null);
			//session.put("jingdian", null);
		}

		String jingdiansql2="from jingdian ";
		List jingdianList2 =jingdianDAO.getHibernateTemplate().find(jingdiansql2);
		request.put("jingdianList", jingdianList2);
		session.put("jingdianList", jingdianList2);
		request.put("jingdianListSize", jingdianList2.size());
		session.put("jingdianListSize", jingdianList2.size());
		//��ȡjingdianidindex��jingdianList��jingdianListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, jingdianList2.size());
			List jingdianList3 = jingdianList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(jingdianList2.size());//�����ܹ�������
			p.setData(jingdianList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡjiudian��Ϣstart............................................................................
		int jiudianidindex = 1;
		String jiudiansql1="from jiudian where id="+jiudianidindex+"";
		List jiudianList1=jiudianDAO.getHibernateTemplate().find(jiudiansql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(jiudianList1.size() > 0)
		{
			request.put("jiudian", jiudianList1.get(0));
			session.put("jiudian", jiudianList1.get(0));
		}
		else
		{
			//request.put("jiudian", null);
			//session.put("jiudian", null);
		}

		String jiudiansql2="from jiudian ";
		List jiudianList2 =jiudianDAO.getHibernateTemplate().find(jiudiansql2);
		request.put("jiudianList", jiudianList2);
		session.put("jiudianList", jiudianList2);
		request.put("jiudianListSize", jiudianList2.size());
		session.put("jiudianListSize", jiudianList2.size());
		//��ȡjiudianidindex��jiudianList��jiudianListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, jiudianList2.size());
			List jiudianList3 = jiudianList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(jiudianList2.size());//�����ܹ�������
			p.setData(jiudianList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡleibie��Ϣstart............................................................................
		int leibieidindex = 1;
		String leibiesql1="from leibie where id="+leibieidindex+"";
		List leibieList1=leibieDAO.getHibernateTemplate().find(leibiesql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(leibieList1.size() > 0)
		{
			request.put("leibie", leibieList1.get(0));
			session.put("leibie", leibieList1.get(0));
		}
		else
		{
			//request.put("leibie", null);
			//session.put("leibie", null);
		}

		String leibiesql2="from leibie ";
		List leibieList2 =leibieDAO.getHibernateTemplate().find(leibiesql2);
		request.put("leibieList", leibieList2);
		session.put("leibieList", leibieList2);
		request.put("leibieListSize", leibieList2.size());
		session.put("leibieListSize", leibieList2.size());
		//��ȡleibieidindex��leibieList��leibieListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, leibieList2.size());
			List leibieList3 = leibieList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(leibieList2.size());//�����ܹ�������
			p.setData(leibieList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡlianjie��Ϣstart............................................................................
		int lianjieidindex = 1;
		String lianjiesql1="from lianjie where id="+lianjieidindex+"";
		List lianjieList1=lianjieDAO.getHibernateTemplate().find(lianjiesql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(lianjieList1.size() > 0)
		{
			request.put("lianjie", lianjieList1.get(0));
			session.put("lianjie", lianjieList1.get(0));
		}
		else
		{
			//request.put("lianjie", null);
			//session.put("lianjie", null);
		}

		String lianjiesql2="from lianjie ";
		List lianjieList2 =lianjieDAO.getHibernateTemplate().find(lianjiesql2);
		request.put("lianjieList", lianjieList2);
		session.put("lianjieList", lianjieList2);
		request.put("lianjieListSize", lianjieList2.size());
		session.put("lianjieListSize", lianjieList2.size());
		//��ȡlianjieidindex��lianjieList��lianjieListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, lianjieList2.size());
			List lianjieList3 = lianjieList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(lianjieList2.size());//�����ܹ�������
			p.setData(lianjieList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡliuyan��Ϣstart............................................................................
		int liuyanidindex = 1;
		String liuyansql1="from liuyan where id="+liuyanidindex+"";
		List liuyanList1=liuyanDAO.getHibernateTemplate().find(liuyansql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(liuyanList1.size() > 0)
		{
			request.put("liuyan", liuyanList1.get(0));
			session.put("liuyan", liuyanList1.get(0));
		}
		else
		{
			//request.put("liuyan", null);
			//session.put("liuyan", null);
		}

		String liuyansql2="from liuyan ";
		List liuyanList2 =liuyanDAO.getHibernateTemplate().find(liuyansql2);
		request.put("liuyanList", liuyanList2);
		session.put("liuyanList", liuyanList2);
		request.put("liuyanListSize", liuyanList2.size());
		session.put("liuyanListSize", liuyanList2.size());
		//��ȡliuyanidindex��liuyanList��liuyanListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, liuyanList2.size());
			List liuyanList3 = liuyanList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(liuyanList2.size());//�����ܹ�������
			p.setData(liuyanList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡlunbo��Ϣstart............................................................................
		int lunboidindex = 1;
		String lunbosql1="from lunbo where id="+lunboidindex+"";
		List lunboList1=lunboDAO.getHibernateTemplate().find(lunbosql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(lunboList1.size() > 0)
		{
			request.put("lunbo", lunboList1.get(0));
			session.put("lunbo", lunboList1.get(0));
		}
		else
		{
			//request.put("lunbo", null);
			//session.put("lunbo", null);
		}

		String lunbosql2="from lunbo ";
		List lunboList2 =lunboDAO.getHibernateTemplate().find(lunbosql2);
		request.put("lunboList", lunboList2);
		session.put("lunboList", lunboList2);
		request.put("lunboListSize", lunboList2.size());
		session.put("lunboListSize", lunboList2.size());
		//��ȡlunboidindex��lunboList��lunboListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, lunboList2.size());
			List lunboList3 = lunboList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(lunboList2.size());//�����ܹ�������
			p.setData(lunboList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡmeishi��Ϣstart............................................................................
		int meishiidindex = 1;
		String meishisql1="from meishi where id="+meishiidindex+"";
		List meishiList1=meishiDAO.getHibernateTemplate().find(meishisql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(meishiList1.size() > 0)
		{
			request.put("meishi", meishiList1.get(0));
			session.put("meishi", meishiList1.get(0));
		}
		else
		{
			//request.put("meishi", null);
			//session.put("meishi", null);
		}

		String meishisql2="from meishi ";
		List meishiList2 =meishiDAO.getHibernateTemplate().find(meishisql2);
		request.put("meishiList", meishiList2);
		session.put("meishiList", meishiList2);
		request.put("meishiListSize", meishiList2.size());
		session.put("meishiListSize", meishiList2.size());
		//��ȡmeishiidindex��meishiList��meishiListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, meishiList2.size());
			List meishiList3 = meishiList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(meishiList2.size());//�����ܹ�������
			p.setData(meishiList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡpinglun��Ϣstart............................................................................
		int pinglunidindex = 1;
		String pinglunsql1="from pinglun where id="+pinglunidindex+"";
		List pinglunList1=pinglunDAO.getHibernateTemplate().find(pinglunsql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(pinglunList1.size() > 0)
		{
			request.put("pinglun", pinglunList1.get(0));
			session.put("pinglun", pinglunList1.get(0));
		}
		else
		{
			//request.put("pinglun", null);
			//session.put("pinglun", null);
		}

		String pinglunsql2="from pinglun ";
		List pinglunList2 =pinglunDAO.getHibernateTemplate().find(pinglunsql2);
		request.put("pinglunList", pinglunList2);
		session.put("pinglunList", pinglunList2);
		request.put("pinglunListSize", pinglunList2.size());
		session.put("pinglunListSize", pinglunList2.size());
		//��ȡpinglunidindex��pinglunList��pinglunListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, pinglunList2.size());
			List pinglunList3 = pinglunList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(pinglunList2.size());//�����ܹ�������
			p.setData(pinglunList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡshoucang��Ϣstart............................................................................
		int shoucangidindex = 1;
		String shoucangsql1="from shoucang where id="+shoucangidindex+"";
		List shoucangList1=shoucangDAO.getHibernateTemplate().find(shoucangsql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(shoucangList1.size() > 0)
		{
			request.put("shoucang", shoucangList1.get(0));
			session.put("shoucang", shoucangList1.get(0));
		}
		else
		{
			//request.put("shoucang", null);
			//session.put("shoucang", null);
		}

		String shoucangsql2="from shoucang ";
		List shoucangList2 =shoucangDAO.getHibernateTemplate().find(shoucangsql2);
		request.put("shoucangList", shoucangList2);
		session.put("shoucangList", shoucangList2);
		request.put("shoucangListSize", shoucangList2.size());
		session.put("shoucangListSize", shoucangList2.size());
		//��ȡshoucangidindex��shoucangList��shoucangListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, shoucangList2.size());
			List shoucangList3 = shoucangList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(shoucangList2.size());//�����ܹ�������
			p.setData(shoucangList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡusers��Ϣstart............................................................................
		int usersidindex = 1;
		String userssql1="from users where id="+usersidindex+"";
		List usersList1=usersDAO.getHibernateTemplate().find(userssql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(usersList1.size() > 0)
		{
			request.put("users", usersList1.get(0));
			//session.put("users", usersList1.get(0));
		}
		else
		{
			//request.put("users", null);
			//session.put("users", null);
		}

		String userssql2="from users ";
		List usersList2 =usersDAO.getHibernateTemplate().find(userssql2);
		request.put("usersList", usersList2);
		session.put("usersList", usersList2);
		request.put("usersListSize", usersList2.size());
		session.put("usersListSize", usersList2.size());
		//��ȡusersidindex��usersList��usersListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, usersList2.size());
			List usersList3 = usersList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(usersList2.size());//�����ܹ�������
			p.setData(usersList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡxianlu��Ϣstart............................................................................
		int xianluidindex = 1;
		String xianlusql1="from xianlu where id="+xianluidindex+"";
		List xianluList1=xianluDAO.getHibernateTemplate().find(xianlusql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(xianluList1.size() > 0)
		{
			request.put("xianlu", xianluList1.get(0));
			session.put("xianlu", xianluList1.get(0));
		}
		else
		{
			//request.put("xianlu", null);
			//session.put("xianlu", null);
		}

		String xianlusql2="from xianlu ";
		List xianluList2 =xianluDAO.getHibernateTemplate().find(xianlusql2);
		request.put("xianluList", xianluList2);
		session.put("xianluList", xianluList2);
		request.put("xianluListSize", xianluList2.size());
		session.put("xianluListSize", xianluList2.size());
		//��ȡxianluidindex��xianluList��xianluListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, xianluList2.size());
			List xianluList3 = xianluList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(xianluList2.size());//�����ܹ�������
			p.setData(xianluList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡyuding��Ϣstart............................................................................
		int yudingidindex = 1;
		String yudingsql1="from yuding where id="+yudingidindex+"";
		List yudingList1=yudingDAO.getHibernateTemplate().find(yudingsql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(yudingList1.size() > 0)
		{
			request.put("yuding", yudingList1.get(0));
			session.put("yuding", yudingList1.get(0));
		}
		else
		{
			//request.put("yuding", null);
			//session.put("yuding", null);
		}

		String yudingsql2="from yuding ";
		List yudingList2 =yudingDAO.getHibernateTemplate().find(yudingsql2);
		request.put("yudingList", yudingList2);
		session.put("yudingList", yudingList2);
		request.put("yudingListSize", yudingList2.size());
		session.put("yudingListSize", yudingList2.size());
		//��ȡyudingidindex��yudingList��yudingListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, yudingList2.size());
			List yudingList3 = yudingList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(yudingList2.size());//�����ܹ�������
			p.setData(yudingList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���

		//��ȡyuyue��Ϣstart............................................................................
		int yuyueidindex = 1;
		String yuyuesql1="from yuyue where id="+yuyueidindex+"";
		List yuyueList1=yuyueDAO.getHibernateTemplate().find(yuyuesql1);
				//ʾ��
		/*if(banjiList1.size() > 0)
		{
		request.put("banji", banjiList1.get(0));
		session.put("banji", banjiList1.get(0));
		}
		else
		{
		//request.put("banji", null);
		//session.put("banji", null);
		}*/
		if(yuyueList1.size() > 0)
		{
			request.put("yuyue", yuyueList1.get(0));
			session.put("yuyue", yuyueList1.get(0));
		}
		else
		{
			//request.put("yuyue", null);
			//session.put("yuyue", null);
		}

		String yuyuesql2="from yuyue ";
		List yuyueList2 =yuyueDAO.getHibernateTemplate().find(yuyuesql2);
		request.put("yuyueList", yuyueList2);
		session.put("yuyueList", yuyueList2);
		request.put("yuyueListSize", yuyueList2.size());
		session.put("yuyueListSize", yuyueList2.size());
		//��ȡyuyueidindex��yuyueList��yuyueListSize��Ϣend...........................................
		//request��session put end...............................................................................................

		//��ҳ���ִ���ʵ�ֿ�ʼ
		{
			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���

			//��ҳ���ִ���ʵ��
			//�������ԣ�����

			//��ʵ�ַ�ҳ���������룬��Ҫ�ĸ���ҳ�ٵ����ó���
			/*HttpServletRequest request1=ServletActionContext.getRequest();
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
			int toIndex = Math.min(fromIndex + hsgpagesize, yuyueList2.size());
			List yuyueList3 = yuyueList2.subList(fromIndex, toIndex);

			p.setIndex(index);//����ҳ��
			p.setPageSize(hsgpagesize);
			p.setTotle(yuyueList2.size());//�����ܹ�������
			p.setData(yuyueList3);//��������

			session.put("page", p);
			request1.setAttribute("page", p);*/



		}
		//��ҳ���ִ���ʵ�ֽ���


        //indexAction end ���سɹ�...............................................................................................
		return ActionSupport.SUCCESS;
    }
}//indexAction end......
