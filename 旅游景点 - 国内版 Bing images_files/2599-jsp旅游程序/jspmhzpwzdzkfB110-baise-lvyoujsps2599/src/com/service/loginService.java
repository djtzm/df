package com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;

import com.dao.*;
import com.model.*;


public class loginService
{
    /*2列属性*/
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

    /*3列属性方法*/
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


    //不带验证码登录
    public String login(String loginname,String loginpw,int type)
    {
        System.out.println("type="+type);

        //获取session对象
        WebContext ctx = WebContextFactory.get();
        HttpSession session=ctx.getSession();

        String result="no";
        String sql="from users where loginname=? and loginpw=? and shenhe='yes'";
        Object[] con={loginname,loginpw};
        List usersList=usersDAO.getHibernateTemplate().find(sql,con);
        if(usersList.size()==0)
        {
            //返回登录失败
            result="no";
        }
        else
        {
            users users=(users)usersList.get(0);
            session.setAttribute("userType", users.getType());
            session.setAttribute("user", users);
            System.out.println("userType"+users.getType());
            //返回登录成功
            result="yes";
        }

        return result;
    }

    //带验证码登录
    public String login2(String loginname,String loginpw,int type,String rand)
    {
        String result="no";
        System.out.println("type="+type);
        //获取session对象
        WebContext ctx = WebContextFactory.get();
        HttpSession session=ctx.getSession();
        //获取session对象中存储的验证码
        String xitongyanzhengma=(String)session.getAttribute("rand");
        System.out.println("RAND="+rand);
        System.out.println("YZM="+xitongyanzhengma);
        if(xitongyanzhengma.equals(rand.trim())==false)
        {
            //返回验证码错误
            result="yanzhenmacuowu";
            return result;
        }

        //String result="no";
        String sql="from users where loginname=? and loginpw=? and shenhe='yes'";
        Object[] con={loginname,loginpw};
        List usersList=usersDAO.getHibernateTemplate().find(sql,con);
        if(usersList.size()==0)
        {
            //返回登录失败
            result="no";
        }
        else
        {
            users users=(users)usersList.get(0);
            session.setAttribute("userType", users.getType());
            session.setAttribute("user", users);
            System.out.println("userType"+users.getType());
            //返回登录成功
            result="yes";
        }

        return result;
    }

    //带验证码和类型登录
    public String login4(String loginname,String loginpw,int type,String rand)
    {
        String result="no";
        System.out.println("type="+type);
        //获取session对象
        WebContext ctx = WebContextFactory.get();
        HttpSession session=ctx.getSession();
        //获取session对象中存储的验证码
        String xitongyanzhengma=(String)session.getAttribute("rand");
        System.out.println("RAND="+rand);
        System.out.println("YZM="+xitongyanzhengma);
        if(xitongyanzhengma.equals(rand.trim())==false)
        {
            //返回验证码错误
            result="yanzhenmacuowu";
            return result;
        }

        //String result="no";
        String sql="from users where loginname=? and loginpw=? and shenhe='yes' and type='"+type+"'";
        Object[] con={loginname,loginpw};
        List usersList=usersDAO.getHibernateTemplate().find(sql,con);
        if(usersList.size()==0)
        {
            //返回登录失败
            result="no";
        }
        else
        {
            users users=(users)usersList.get(0);
            session.setAttribute("userType", users.getType());
            session.setAttribute("user", users);
            System.out.println("userType"+users.getType());
            //返回登录成功
            result="yes";
        }

        return result;
    }

    //用户密码修改方法
    public String PwEdit(String loginpw)
    {
        System.out.println("PwEdit");
        try
        {
            WebContext ctx = WebContextFactory.get();
            HttpSession session=ctx.getSession();

            users users=(users)session.getAttribute("user");
            users.setLoginpw(loginpw);

            usersDAO.getHibernateTemplate().update(users);
            session.setAttribute("user", users);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "yes";
    }
    //用户是否存在检测
    public String jiance(String loginname)
    {
        System.out.println("jiance");
        try
        {
            String sql="from users where loginname='"+loginname+"'";
            List usersList=usersDAO.getHibernateTemplate().find(sql);
            if(usersList.size()>0)
            {
                return "yes";
            }
            else
            {
                return "no";
            }
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "yes";

    }
    //用户退出登录
    public void logout()
    {
        WebContext ctx = WebContextFactory.get();
        HttpSession session=ctx.getSession();
        session.setAttribute("userType", null);
        session.setAttribute("user", null);
    }//用户退出登录END..................................................................................................................
    //清空session..................................................................................................................

    //用户退出登录2
    public String userLogout()
    {
        WebContext ctx = WebContextFactory.get();
        HttpSession session=ctx.getSession();

        session.setAttribute("userType", null);
        session.setAttribute("user", null);

        return "yes";
    }//用户退出登录END..................................................................................................................
    //清空session..................................................................................................................
    /*4tableselect*/
	public List chanpinSelect()
	{
		String sql="from chanpin ";
		List chanpinList=chanpinDAO.getHibernateTemplate().find(sql);
		return chanpinList;
	}

	public List chanpinSelectbyid(Integer id)
	{
		String sql="from chanpin where id='"+id+"'";
		List chanpinList=chanpinDAO.getHibernateTemplate().find(sql);
		return chanpinList;
	}
	public List dxSelect()
	{
		String sql="from dx ";
		List dxList=dxDAO.getHibernateTemplate().find(sql);
		return dxList;
	}

	public List dxSelectbyid(Integer id)
	{
		String sql="from dx where id='"+id+"'";
		List dxList=dxDAO.getHibernateTemplate().find(sql);
		return dxList;
	}
	public List gonggaoSelect()
	{
		String sql="from gonggao ";
		List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);
		return gonggaoList;
	}

	public List gonggaoSelectbyid(Integer id)
	{
		String sql="from gonggao where id='"+id+"'";
		List gonggaoList=gonggaoDAO.getHibernateTemplate().find(sql);
		return gonggaoList;
	}
	public List jingdianSelect()
	{
		String sql="from jingdian ";
		List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);
		return jingdianList;
	}

	public List jingdianSelectbyid(Integer id)
	{
		String sql="from jingdian where id='"+id+"'";
		List jingdianList=jingdianDAO.getHibernateTemplate().find(sql);
		return jingdianList;
	}
	public List jiudianSelect()
	{
		String sql="from jiudian ";
		List jiudianList=jiudianDAO.getHibernateTemplate().find(sql);
		return jiudianList;
	}

	public List jiudianSelectbyid(Integer id)
	{
		String sql="from jiudian where id='"+id+"'";
		List jiudianList=jiudianDAO.getHibernateTemplate().find(sql);
		return jiudianList;
	}
	public List leibieSelect()
	{
		String sql="from leibie ";
		List leibieList=leibieDAO.getHibernateTemplate().find(sql);
		return leibieList;
	}

	public List leibieSelectbyid(Integer id)
	{
		String sql="from leibie where id='"+id+"'";
		List leibieList=leibieDAO.getHibernateTemplate().find(sql);
		return leibieList;
	}
	public List lianjieSelect()
	{
		String sql="from lianjie ";
		List lianjieList=lianjieDAO.getHibernateTemplate().find(sql);
		return lianjieList;
	}

	public List lianjieSelectbyid(Integer id)
	{
		String sql="from lianjie where id='"+id+"'";
		List lianjieList=lianjieDAO.getHibernateTemplate().find(sql);
		return lianjieList;
	}
	public List liuyanSelect()
	{
		String sql="from liuyan ";
		List liuyanList=liuyanDAO.getHibernateTemplate().find(sql);
		return liuyanList;
	}

	public List liuyanSelectbyid(Integer id)
	{
		String sql="from liuyan where id='"+id+"'";
		List liuyanList=liuyanDAO.getHibernateTemplate().find(sql);
		return liuyanList;
	}
	public List lunboSelect()
	{
		String sql="from lunbo ";
		List lunboList=lunboDAO.getHibernateTemplate().find(sql);
		return lunboList;
	}

	public List lunboSelectbyid(Integer id)
	{
		String sql="from lunbo where id='"+id+"'";
		List lunboList=lunboDAO.getHibernateTemplate().find(sql);
		return lunboList;
	}
	public List meishiSelect()
	{
		String sql="from meishi ";
		List meishiList=meishiDAO.getHibernateTemplate().find(sql);
		return meishiList;
	}

	public List meishiSelectbyid(Integer id)
	{
		String sql="from meishi where id='"+id+"'";
		List meishiList=meishiDAO.getHibernateTemplate().find(sql);
		return meishiList;
	}
	public List pinglunSelect()
	{
		String sql="from pinglun ";
		List pinglunList=pinglunDAO.getHibernateTemplate().find(sql);
		return pinglunList;
	}

	public List pinglunSelectbyid(Integer id)
	{
		String sql="from pinglun where id='"+id+"'";
		List pinglunList=pinglunDAO.getHibernateTemplate().find(sql);
		return pinglunList;
	}
	public List shoucangSelect()
	{
		String sql="from shoucang ";
		List shoucangList=shoucangDAO.getHibernateTemplate().find(sql);
		return shoucangList;
	}

	public List shoucangSelectbyid(Integer id)
	{
		String sql="from shoucang where id='"+id+"'";
		List shoucangList=shoucangDAO.getHibernateTemplate().find(sql);
		return shoucangList;
	}
	public List usersSelect()
	{
		String sql="from users ";
		List usersList=usersDAO.getHibernateTemplate().find(sql);
		return usersList;
	}

	public List usersSelectbyid(Integer id)
	{
		String sql="from users where id='"+id+"'";
		List usersList=usersDAO.getHibernateTemplate().find(sql);
		return usersList;
	}
	public List xianluSelect()
	{
		String sql="from xianlu ";
		List xianluList=xianluDAO.getHibernateTemplate().find(sql);
		return xianluList;
	}

	public List xianluSelectbyid(Integer id)
	{
		String sql="from xianlu where id='"+id+"'";
		List xianluList=xianluDAO.getHibernateTemplate().find(sql);
		return xianluList;
	}
	public List yudingSelect()
	{
		String sql="from yuding ";
		List yudingList=yudingDAO.getHibernateTemplate().find(sql);
		return yudingList;
	}

	public List yudingSelectbyid(Integer id)
	{
		String sql="from yuding where id='"+id+"'";
		List yudingList=yudingDAO.getHibernateTemplate().find(sql);
		return yudingList;
	}
	public List yuyueSelect()
	{
		String sql="from yuyue ";
		List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);
		return yuyueList;
	}

	public List yuyueSelectbyid(Integer id)
	{
		String sql="from yuyue where id='"+id+"'";
		List yuyueList=yuyueDAO.getHibernateTemplate().find(sql);
		return yuyueList;
	}

}
