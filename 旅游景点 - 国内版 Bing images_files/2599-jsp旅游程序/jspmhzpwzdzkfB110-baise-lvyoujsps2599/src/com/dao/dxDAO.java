package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.dx;

/**
 * A data access object (DAO) providing persistence and search support for
 * dx entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.dx
 * @author MyEclipse Persistence Tools
 */

public class dxDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(dxDAO.class);
// property constants
    /*列属性,不包含id*/
	public static final String Leibie = "leibie";
	public static final String Content = "content";
	public static final String Addtime = "addtime";


    protected void initDao()
    {
        // do nothing
    }

    // 添加保存数据方法
    public void save(dx transientInstance)
    {
        log.debug("saving dx instance");
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
    public void delete(dx persistentInstance)
    {
        log.debug("deleting dx instance");
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



    public dx merge(dx detachedInstance)
    {
        log.debug("merging dx instance");
        try
        {
            dx result = (dx) getHibernateTemplate().merge(
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
    public void attachDirty(dx instance)
    {
        log.debug("attaching dirty dx instance");
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

    public void attachClean(dx instance)
    {
        log.debug("attaching clean dx instance");
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
    public dx findById(java.lang.Integer id)
    {
        log.debug("getting dx instance with id: " + id);
        try
        {
            dx instance = (dx) getHibernateTemplate().get(
                    "com.model.dx", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // 按实体信息查询信息列表
    public List findByExample(dx instance)
    {
        log.debug("finding dx instance by example");
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
        log.debug("finding dx instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from dx as model where model."
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
        log.debug("finding all dx instances");
        try
        {
            String queryString = "from dx";
            return getHibernateTemplate().find(queryString);
        } catch (RuntimeException re)
        {
            log.error("find all failed", re);
            throw re;
        }
    }

    /*列方法,不包含id*/
	public List findByLeibie(Object leibie)
	{
		return findByProperty(Leibie, leibie);
	}
	public List findByContent(Object content)
	{
		return findByProperty(Content, content);
	}
	public List findByAddtime(Object addtime)
	{
		return findByProperty(Addtime, addtime);
	}


    // 实例化DAO对象方法
    public static dxDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (dxDAO) ctx.getBean("dxDAO");
    }
}
