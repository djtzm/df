package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.lianjie;

/**
 * A data access object (DAO) providing persistence and search support for
 * lianjie entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.lianjie
 * @author MyEclipse Persistence Tools
 */

public class lianjieDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(lianjieDAO.class);
// property constants
    /*列属性,不包含id*/
	public static final String Name = "name";
	public static final String Url = "url";


    protected void initDao()
    {
        // do nothing
    }

    // 添加保存数据方法
    public void save(lianjie transientInstance)
    {
        log.debug("saving lianjie instance");
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
    public void delete(lianjie persistentInstance)
    {
        log.debug("deleting lianjie instance");
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



    public lianjie merge(lianjie detachedInstance)
    {
        log.debug("merging lianjie instance");
        try
        {
            lianjie result = (lianjie) getHibernateTemplate().merge(
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
    public void attachDirty(lianjie instance)
    {
        log.debug("attaching dirty lianjie instance");
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

    public void attachClean(lianjie instance)
    {
        log.debug("attaching clean lianjie instance");
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
    public lianjie findById(java.lang.Integer id)
    {
        log.debug("getting lianjie instance with id: " + id);
        try
        {
            lianjie instance = (lianjie) getHibernateTemplate().get(
                    "com.model.lianjie", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // 按实体信息查询信息列表
    public List findByExample(lianjie instance)
    {
        log.debug("finding lianjie instance by example");
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
        log.debug("finding lianjie instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from lianjie as model where model."
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
        log.debug("finding all lianjie instances");
        try
        {
            String queryString = "from lianjie";
            return getHibernateTemplate().find(queryString);
        } catch (RuntimeException re)
        {
            log.error("find all failed", re);
            throw re;
        }
    }

    /*列方法,不包含id*/
	public List findByName(Object name)
	{
		return findByProperty(Name, name);
	}
	public List findByUrl(Object url)
	{
		return findByProperty(Url, url);
	}


    // 实例化DAO对象方法
    public static lianjieDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (lianjieDAO) ctx.getBean("lianjieDAO");
    }
}
