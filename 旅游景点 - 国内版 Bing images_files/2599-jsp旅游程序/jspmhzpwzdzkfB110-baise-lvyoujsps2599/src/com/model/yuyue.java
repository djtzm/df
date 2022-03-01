package com.model;

/**
 * yuyue entity. @author MyEclipse Persistence Tools
 */

public class yuyue implements java.io.Serializable
{
    /*列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.Integer  xianluid;
	private  java.lang.Integer  usersid;
	private  java.lang.String  riqi;
	private  java.lang.String  xingming;
	private  java.lang.String  dianhua;
	private  java.lang.String  beizhu;

    /*父表属性*/
	private xianlu xianlu;
	private users users;

    /*列方法*/
	public java.lang.Integer  getId() {
		return id;
	}
	public void  setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String  getBiaoti() {
		return biaoti;
	}
	public void  setBiaoti(java.lang.String biaoti) {
		this.biaoti = biaoti;
	}
	public java.lang.Integer  getXianluid() {
		return xianluid;
	}
	public void  setXianluid(java.lang.Integer xianluid) {
		this.xianluid = xianluid;
	}
	public java.lang.Integer  getUsersid() {
		return usersid;
	}
	public void  setUsersid(java.lang.Integer usersid) {
		this.usersid = usersid;
	}
	public java.lang.String  getRiqi() {
		return riqi;
	}
	public void  setRiqi(java.lang.String riqi) {
		this.riqi = riqi;
	}
	public java.lang.String  getXingming() {
		return xingming;
	}
	public void  setXingming(java.lang.String xingming) {
		this.xingming = xingming;
	}
	public java.lang.String  getDianhua() {
		return dianhua;
	}
	public void  setDianhua(java.lang.String dianhua) {
		this.dianhua = dianhua;
	}
	public java.lang.String  getBeizhu() {
		return beizhu;
	}
	public void  setBeizhu(java.lang.String beizhu) {
		this.beizhu = beizhu;
	}

    /*父表方法*/
	public xianlu  getXianlu() {
		return xianlu;
	}
	public void  setXianlu(xianlu xianlu) {
		this.xianlu = xianlu;
	}
	public users  getUsers() {
		return users;
	}
	public void  setUsers(users users) {
		this.users = users;
	}


}
