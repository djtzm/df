package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.yuding;

/**
 * A data access object (DAO) providing persistence and search support for
 * yuding entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 *
 * @see com.model.yuding
 * @author MyEclipse Persistence Tools
 */

public class yudingDAO extends HibernateDaoSupport
{
    private static final Log log = LogFactory.getLog(yudingDAO.class);
// property constants
    /*������,������id*/
	public static final String Biaoti = "biaoti";
	public static final String Jiudianid = "jiudianid";
	public static final String Usersid = "usersid";
	public static final String Riqi = "riqi";
	public static final String Xingming = "xingming";
	public static final String Dianhua = "dianhua";
	public static final String Beizhu = "beizhu";


    protected void initDao()
    {
        // do nothing
    }

    // ��ӱ������ݷ���
    public void save(yuding transientInstance)
    {
        log.debug("saving yuding instance");
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
    public void delete(yuding persistentInstance)
    {
        log.debug("deleting yuding instance");
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



    public yuding merge(yuding detachedInstance)
    {
        log.debug("merging yuding instance");
        try
        {
            yuding result = (yuding) getHibernateTemplate().merge(
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
    public void attachDirty(yuding instance)
    {
        log.debug("attaching dirty yuding instance");
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

    public void attachClean(yuding instance)
    {
        log.debug("attaching clean yuding instance");
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
    public yuding findById(java.lang.Integer id)
    {
        log.debug("getting yuding instance with id: " + id);
        try
        {
            yuding instance = (yuding) getHibernateTemplate().get(
                    "com.model.yuding", id);
            return instance;
        } catch (RuntimeException re)
        {
            log.error("get failed", re);
            throw re;
        }
    }

    // ��ʵ����Ϣ��ѯ��Ϣ�б�
    public List findByExample(yuding instance)
    {
        log.debug("finding yuding instance by example");
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
        log.debug("finding yuding instance with property: " + propertyName
                + ", value: " + value);
        try
        {
            String queryString = "from yuding as model where model."
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
        log.debug("finding all yuding instances");
        try
        {
            String queryString = "from yuding";
            return getHibernateTemplate().find(queryString);
        } catch (RuntimeException re)
        {
            log.error("find all failed", re);
            throw re;
        }
    }

    /*�з���,������id*/
	public List findByBiaoti(Object biaoti)
	{
		return findByProperty(Biaoti, biaoti);
	}
	public List findByJiudianid(Object jiudianid)
	{
		return findByProperty(Jiudianid, jiudianid);
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


    // ʵ����DAO���󷽷�
    public static yudingDAO getFromApplicationContext(ApplicationContext ctx)
    {
        return (yudingDAO) ctx.getBean("yudingDAO");
    }
}
