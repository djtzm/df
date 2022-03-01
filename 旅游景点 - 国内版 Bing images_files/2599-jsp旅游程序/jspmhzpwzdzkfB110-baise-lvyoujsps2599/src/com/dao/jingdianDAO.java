package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.jingdian;

/**
 * A data access object (DAO) providing persistence and search support for
 * jingdian entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.jingdian
 * @author MyEclipse Persistence Tools
 */

public class jingdianDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(jingdianDAO.class);
// property constants
    /*列属性,不包含id*/
	public static final String Biaoti = "biaoti";
	public static final String Neirong = "neirong";
	public static final String Leibieid = "leibieid";
	public static final String Image = "image";
	public static final String Jiage = "jiage";
	public static final String Shijian = "shijian";


    protected void initDao()
    {
        // do nothing
    }

    // 添加保存数据方法
    public void save(jingdian transientInstance)
    {
        log.debug("saving jingdian instance");
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
    public void delete(jingdian persistentInstance)
    {
        log.debug("deleting jingdian instance");
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



    public jingdian merge(jingdian detachedInstance)
    {
        log.debug("merging jingdian instance");
        try
        {
            jingdian result = (jingdian) getHibernateTemplate().merge(
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
    public void attachDirty(jingdian instance)
    {
        log.debug("attaching dirty jingdian instance");
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

    public void attachClean(jingdian instance)
    {
        log.debug("attaching clean jingdian instance");
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
    public jingdian findById(java.lang.Integer id)
    {
        log.debug("getting jingdian instance with id: " + id);
        try
        {
            jingdian instance = (jingdian) getHibernateTemplate().get(
                    "com.model.jingdian", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // 按实体信息查询信息列表
    public List findByExample(jingdian instance)
    {
        log.debug("finding jingdian instance by example");
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
        log.debug("finding jingdian instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from jingdian as model where model."
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
        log.debug("finding all jingdian instances");
        try
        {
            String queryString = "from jingdian";
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
	public List findByLeibieid(Object leibieid)
	{
		return findByProperty(Leibieid, leibieid);
	}
	public List findByImage(Object image)
	{
		return findByProperty(Image, image);
	}
	public List findByJiage(Object jiage)
	{
		return findByProperty(Jiage, jiage);
	}
	public List findByShijian(Object shijian)
	{
		return findByProperty(Shijian, shijian);
	}


    // 实例化DAO对象方法
    public static jingdianDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (jingdianDAO) ctx.getBean("jingdianDAO");
    }
}
