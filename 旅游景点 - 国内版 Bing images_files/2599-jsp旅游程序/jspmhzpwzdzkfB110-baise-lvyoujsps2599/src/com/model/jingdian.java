package com.model;

/**
 * jingdian entity. @author MyEclipse Persistence Tools
 */

public class jingdian implements java.io.Serializable
{
    /*������*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  neirong;
	private  java.lang.Integer  leibieid;
	private  java.lang.String  image;
	private  java.lang.Integer  jiage;
	private  java.lang.String  shijian;

    /*��������*/
	private leibie leibie;

    /*�з���*/
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
	public java.lang.Integer  getLeibieid() {
		return leibieid;
	}
	public void  setLeibieid(java.lang.Integer leibieid) {
		this.leibieid = leibieid;
	}
	public java.lang.String  getImage() {
		return image;
	}
	public void  setImage(java.lang.String image) {
		this.image = image;
	}
	public java.lang.Integer  getJiage() {
		return jiage;
	}
	public void  setJiage(java.lang.Integer jiage) {
		this.jiage = jiage;
	}
	public java.lang.String  getShijian() {
		return shijian;
	}
	public void  setShijian(java.lang.String shijian) {
		this.shijian = shijian;
	}

    /*������*/
	public leibie  getLeibie() {
		return leibie;
	}
	public void  setLeibie(leibie leibie) {
		this.leibie = leibie;
	}


}
