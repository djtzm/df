package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.liuyan;

/**
 * A data access object (DAO) providing persistence and search support for
 * liuyan entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.liuyan
 * @author MyEclipse Persistence Tools
 */

public class liuyanDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(liuyanDAO.class);
// property constants
    /*列属性,不包含id*/
	public static final String Biaoti = "biaoti";
	public static final String Neirong = "neirong";
	public static final String Liuyanshijian = "liuyanshijian";
	public static final String Usersid = "usersid";
	public static final String Huifu = "huifu";


    protected void initDao()
    {
        // do nothing
    }

    // 添加保存数据方法
    public void save(liuyan transientInstance)
    {
        log.debug("saving liuyan instance");
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
    public void delete(liuyan persistentInstance)
    {
        log.debug("deleting liuyan instance");
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



    public liuyan merge(liuyan detachedInstance)
    {
        log.debug("merging liuyan instance");
        try
        {
            liuyan result = (liuyan) getHibernateTemplate().merge(
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
    public void attachDirty(liuyan instance)
    {
        log.debug("attaching dirty liuyan instance");
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

    public void attachClean(liuyan instance)
    {
        log.debug("attaching clean liuyan instance");
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
    public liuyan findById(java.lang.Integer id)
    {
        log.debug("getting liuyan instance with id: " + id);
        try
        {
            liuyan instance = (liuyan) getHibernateTemplate().get(
                    "com.model.liuyan", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // 按实体信息查询信息列表
    public List findByExample(liuyan instance)
    {
        log.debug("finding liuyan instance by example");
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
        log.debug("finding liuyan instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from liuyan as model where model."
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
        log.debug("finding all liuyan instances");
        try
        {
            String queryString = "from liuyan";
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
	public List findByNeirong(Object neirong)
	{
		return findByProperty(Neirong, neirong);
	}
	public List findByLiuyanshijian(Object liuyanshijian)
	{
		return findByProperty(Liuyanshijian, liuyanshijian);
	}
	public List findByUsersid(Object usersid)
	{
		return findByProperty(Usersid, usersid);
	}
	public List findByHuifu(Object huifu)
	{
		return findByProperty(Huifu, huifu);
	}


    // 实例化DAO对象方法
    public static liuyanDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (liuyanDAO) ctx.getBean("liuyanDAO");
    }
}
