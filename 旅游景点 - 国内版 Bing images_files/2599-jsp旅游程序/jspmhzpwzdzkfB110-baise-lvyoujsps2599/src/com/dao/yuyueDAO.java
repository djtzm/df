package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.yuyue;

/**
 * A data access object (DAO) providing persistence and search support for
 * yuyue entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.yuyue
 * @author MyEclipse Persistence Tools
 */

public class yuyueDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(yuyueDAO.class);
// property constants
    /*列属性,不包含id*/
	public static final String Biaoti = "biaoti";
	public static final String Xianluid = "xianluid";
	public static final String Usersid = "usersid";
	public static final String Riqi = "riqi";
	public static final String Xingming = "xingming";
	public static final String Dianhua = "dianhua";
	public static final String Beizhu = "beizhu";


    protected void initDao()
    {
        // do nothing
    }

    // 添加保存数据方法
    public void save(yuyue transientInstance)
    {
        log.debug("saving yuyue instance");
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
    public void delete(yuyue persistentInstance)
    {
        log.debug("deleting yuyue instance");
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



    public yuyue merge(yuyue detachedInstance)
    {
        log.debug("merging yuyue instance");
        try
        {
            yuyue result = (yuyue) getHibernateTemplate().merge(
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
    public void attachDirty(yuyue instance)
    {
        log.debug("attaching dirty yuyue instance");
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

    public void attachClean(yuyue instance)
    {
        log.debug("attaching clean yuyue instance");
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
    public yuyue findById(java.lang.Integer id)
    {
        log.debug("getting yuyue instance with id: " + id);
        try
        {
            yuyue instance = (yuyue) getHibernateTemplate().get(
                    "com.model.yuyue", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // 按实体信息查询信息列表
    public List findByExample(yuyue instance)
    {
        log.debug("finding yuyue instance by example");
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
        log.debug("finding yuyue instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from yuyue as model where model."
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
        log.debug("finding all yuyue instances");
        try
        {
            String queryString = "from yuyue";
            return getHibernateTemplate().find(queryString);
        } catch (RuntimeException re)
        {
            log.error("find all failed", re);
            throw re;
        }
    }

    /*列方法,不包含id*/
	public List findByBiaoti(Object biaoti)
	{
		return findByProperty(Biaoti, biaoti);
	}
	public List findByXianluid(Object xianluid)
	{
		return findByProperty(Xianluid, xianluid);
	}
	public List findByUsersid(Object usersid)
	{
		return findByProperty(Usersid, usersid);
	}
	public List findByRiqi(Object riqi)
	{
		return findByProperty(Riqi, riqi);
	}
	public List findByXingming(Object xingming)
	{
		return findByProperty(Xingming, xingming);
	}
	public List findByDianhua(Object dianhua)
	{
		return findByProperty(Dianhua, dianhua);
	}
	public List findByBeizhu(Object beizhu)
	{
		return findByProperty(Beizhu, beizhu);
	}


    // 实例化DAO对象方法
    public static yuyueDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (yuyueDAO) ctx.getBean("yuyueDAO");
    }
}
