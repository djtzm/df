package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.users;

/**
 * A data access object (DAO) providing persistence and search support for
 * users entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.users
 * @author MyEclipse Persistence Tools
 */

public class usersDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(usersDAO.class);
// property constants
    /*列属性,不包含id*/
	public static final String Loginname = "loginname";
	public static final String Loginpw = "loginpw";
	public static final String Xingming = "xingming";
	public static final String Xingbie = "xingbie";
	public static final String Nianling = "nianling";
	public static final String Address = "address";
	public static final String Dianhua = "dianhua";
	public static final String Shenhe = "shenhe";
	public static final String Type = "type";
	public static final String Typename = "typename";


    protected void initDao()
    {
        // do nothing
    }

    // 添加保存数据方法
    public void save(users transientInstance)
    {
        log.debug("saving users instance");
        try
        {
            getHibernateTemplate().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re)
        {
            log.error("save failed", re);
            throw re;
        }
    }

    // 删除数据方法
    public void delete(users persistentInstance)
    {
        log.debug("deleting users instance");
        try
        {
            getHibernateTemplate().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re)
        {
            log.error("delete failed", re);
            throw re;
        }
    }



    public users merge(users detachedInstance)
    {
        log.debug("merging users instance");
        try
        {
            users result = (users) getHibernateTemplate().merge(
                    detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re)
        {
            log.error("merge failed", re);
            throw re;
        }
    }

    // 存在则修改，不存在则保存数据方法
    public void attachDirty(users instance)
    {
        log.debug("attaching dirty users instance");
        try
        {
            getHibernateTemplate().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re)
        {
            log.error("attach failed", re);
            throw re;
        }
    }

    public void attachClean(users instance)
    {
        log.debug("attaching clean users instance");
        try
        {
            getHibernateTemplate().lock(instance, LockMode.NONE);
            log.debug("attach successful");
        } catch (RuntimeException re)
        {
            log.error("attach failed", re);
            throw re;
        }
    }

    // 按id获取实体信息方法
    public users findById(java.lang.Integer id)
    {
        log.debug("getting users instance with id: " + id);
        try
        {
            users instance = (users) getHibernateTemplate().get(
                    "com.model.users", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // 按实体信息查询信息列表
    public List findByExample(users instance)
    {
        log.debug("finding users instance by example");
        try
        {
            List results = getHibernateTemplate().findByExample(instance);
            log.debug("find by example successful, result size: "
                    + results.size());
            return results;
        } catch (RuntimeException re)
        {
            log.error("find by example failed", re);
            throw re;
        }
    }

    // 按列属性值获取信息列表方法
    public List findByProperty(String propertyName, Object value)
    {
        log.debug("finding users instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from users as model where model."
                    + propertyName + "= ?";
            return getHibernateTemplate().find(queryString, value);
        } catch (RuntimeException re)
        {
            log.error("find by property name failed", re);
            throw re;
        }
    }

    // 获取所有信息列表方法
    public List findAll()
    {
        log.debug("finding all users instances");
        try
        {
            String queryString = "from users";
            return getHibernateTemplate().find(queryString);
        } catch (RuntimeException re)
        {
            log.error("find all failed", re);
            throw re;
        }
    }

    /*列方法,不包含id*/
	public List findByLoginname(Object loginname)
	{
		return findByProperty(Loginname, loginname);
	}
	public List findByLoginpw(Object loginpw)
	{
		return findByProperty(Loginpw, loginpw);
	}
	public List findByXingming(Object xingming)
	{
		return findByProperty(Xingming, xingming);
	}
	public List findByXingbie(Object xingbie)
	{
		return findByProperty(Xingbie, xingbie);
	}
	public List findByNianling(Object nianling)
	{
		return findByProperty(Nianling, nianling);
	}
	public List findByAddress(Object address)
	{
		return findByProperty(Address, address);
	}
	public List findByDianhua(Object dianhua)
	{
		return findByProperty(Dianhua, dianhua);
	}
	public List findByShenhe(Object shenhe)
	{
		return findByProperty(Shenhe, shenhe);
	}
	public List findByType(Object type)
	{
		return findByProperty(Type, type);
	}
	public List findByTypename(Object typename)
	{
		return findByProperty(Typename, typename);
	}


    // 实例化DAO对象方法
    public static usersDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (usersDAO) ctx.getBean("usersDAO");
    }
}
