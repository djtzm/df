package com.model;

/**
 * pinglun entity. @author MyEclipse Persistence Tools
 */

public class pinglun implements java.io.Serializable
{
    /*列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  neirong;
	private  java.lang.String  shijian;
	private  java.lang.Integer  jingdianid;
	private  java.lang.Integer  usersid;

    /*父表属性*/
	private jingdian jingdian;
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
	public java.lang.String  getNeirong() {
		return neirong;
	}
	public void  setNeirong(java.lang.String neirong) {
		this.neirong = neirong;
	}
	public java.lang.String  getShijian() {
		return shijian;
	}
	public void  setShijian(java.lang.String shijian) {
		this.shijian = shijian;
	}
	public java.lang.Integer  getJingdianid() {
		return jingdianid;
	}
	public void  setJingdianid(java.lang.Integer jingdianid) {
		this.jingdianid = jingdianid;
	}
	public java.lang.Integer  getUsersid() {
		return usersid;
	}
	public void  setUsersid(java.lang.Integer usersid) {
		this.usersid = usersid;
	}

    /*父表方法*/
	public jingdian  getJingdian() {
		return jingdian;
	}
	public void  setJingdian(jingdian jingdian) {
		this.jingdian = jingdian;
	}
	public users  getUsers() {
		return users;
	}
	public void  setUsers(users users) {
		this.users = users;
	}


}
