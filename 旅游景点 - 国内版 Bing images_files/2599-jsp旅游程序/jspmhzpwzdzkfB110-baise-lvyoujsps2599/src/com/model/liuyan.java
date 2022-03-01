package com.model;

/**
 * liuyan entity. @author MyEclipse Persistence Tools
 */

public class liuyan implements java.io.Serializable
{
    /*列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  neirong;
	private  java.lang.String  liuyanshijian;
	private  java.lang.Integer  usersid;
	private  java.lang.String  huifu;

    /*父表属性*/
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
	public java.lang.String  getLiuyanshijian() {
		return liuyanshijian;
	}
	public void  setLiuyanshijian(java.lang.String liuyanshijian) {
		this.liuyanshijian = liuyanshijian;
	}
	public java.lang.Integer  getUsersid() {
		return usersid;
	}
	public void  setUsersid(java.lang.Integer usersid) {
		this.usersid = usersid;
	}
	public java.lang.String  getHuifu() {
		return huifu;
	}
	public void  setHuifu(java.lang.String huifu) {
		this.huifu = huifu;
	}

    /*父表方法*/
	public users  getUsers() {
		return users;
	}
	public void  setUsers(users users) {
		this.users = users;
	}


}
