package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.shoucang;

/**
 * A data access object (DAO) providing persistence and search support for
 * shoucang entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.shoucang
 * @author MyEclipse Persistence Tools
 */

public class shoucangDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(shoucangDAO.class);
// property constants
    /*������,������id*/
	public static final String Shijian = "shijian";
	public static final String Jingdianid = "jingdianid";
	public static final String Usersid = "usersid";


    protected void initDao()
    {
        // do nothing
    }

    // ��ӱ������ݷ���
    public void save(shoucang transientInstance)
    {
        log.debug("saving shoucang instance");
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

    // ɾ�����ݷ���
    public void delete(shoucang persistentInstance)
    {
        log.debug("deleting shoucang instance");
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



    public shoucang merge(shoucang detachedInstance)
    {
        log.debug("merging shoucang instance");
        try
        {
            shoucang result = (shoucang) getHibernateTemplate().merge(
                    detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re)
        {
            log.error("merge failed", re);
            throw re;
        }
    }

    // �������޸ģ��������򱣴����ݷ���
    public void attachDirty(shoucang instance)
    {
        log.debug("attaching dirty shoucang instance");
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

    public void attachClean(shoucang instance)
    {
        log.debug("attaching clean shoucang instance");
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

    // ��id��ȡʵ����Ϣ����
    public shoucang findById(java.lang.Integer id)
    {
        log.debug("getting shoucang instance with id: " + id);
        try
        {
            shoucang instance = (shoucang) getHibernateTemplate().get(
                    "com.model.shoucang", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // ��ʵ����Ϣ��ѯ��Ϣ�б�
    public List findByExample(shoucang instance)
    {
        log.debug("finding shoucang instance by example");
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

    // ��������ֵ��ȡ��Ϣ�б���
    public List findByProperty(String propertyName, Object value)
    {
        log.debug("finding shoucang instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from shoucang as model where model."
                    + propertyName + "= ?";
            return getHibernateTemplate().find(queryString, value);
        } catch (RuntimeException re)
        {
            log.error("find by property name failed", re);
            throw re;
        }
    }

    // ��ȡ������Ϣ�б���
    public List findAll()
    {
        log.debug("finding all shoucang instances");
        try
        {
            String queryString = "from shoucang";
            return getHibernateTemplate().find(queryString);
        } catch (RuntimeException re)
        {
            log.error("find all failed", re);
            throw re;
        }
    }

    /*�з���,������id*/
	public List findByShijian(Object shijian)
	{
		return findByProperty(Shijian, shijian);
	}
	public List findByJingdianid(Object jingdianid)
	{
		return findByProperty(Jingdianid, jingdianid);
	}
	public List findByUsersid(Object usersid)
	{
		return findByProperty(Usersid, usersid);
	}


    // ʵ����DAO���󷽷�
    public static shoucangDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (shoucangDAO) ctx.getBean("shoucangDAO");
    }
}
