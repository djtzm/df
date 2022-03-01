package com.model;

/**
 * dx entity. @author MyEclipse Persistence Tools
 */

public class dx implements java.io.Serializable
{
    /*列属性*/
	private  java.lang.Integer  id;
	private  java.lang.String  leibie;
	private  java.lang.String  content;
	private  java.lang.String  addtime;

    /*父表属性*/

    /*列方法*/
	public java.lang.Integer  getId() {
		return id;
	}
	public void  setId(java.lang.Integer id) {
		this.id = id;
	}
	public java.lang.String  getLeibie() {
		return leibie;
	}
	public void  setLeibie(java.lang.String leibie) {
		this.leibie = leibie;
	}
	public java.lang.String  getContent() {
		return content;
	}
	public void  setContent(java.lang.String content) {
		this.content = content;
	}
	public java.lang.String  getAddtime() {
		return addtime;
	}
	public void  setAddtime(java.lang.String addtime) {
		this.addtime = addtime;
	}

    /*父表方法*/


}
