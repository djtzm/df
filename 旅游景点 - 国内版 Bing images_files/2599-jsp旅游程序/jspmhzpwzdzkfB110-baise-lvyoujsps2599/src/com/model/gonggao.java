package com.model;

/**
 * gonggao entity. @author MyEclipse Persistence Tools
 */

public class gonggao implements java.io.Serializable
{
    /*列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  biaoti;
	private  java.lang.String  neirong;
	private  java.lang.String  tupian;
	private  java.lang.String  shijian;

    /*父表属性*/

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
	public java.lang.String  getTupian() {
		return tupian;
	}
	public void  setTupian(java.lang.String tupian) {
		this.tupian = tupian;
	}
	public java.lang.String  getShijian() {
		return shijian;
	}
	public void  setShijian(java.lang.String shijian) {
		this.shijian = shijian;
	}

    /*父表方法*/


}
