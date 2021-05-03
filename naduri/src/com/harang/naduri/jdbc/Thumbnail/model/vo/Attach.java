package com.harang.naduri.jdbc.Thumbnail.model.vo;

import java.io.Serializable;

public class Attach implements Serializable {

	private static final long serialVersionUID = 1001L;
	
	private int attach_no;
	private String attach_name;
	private String a_status;
	private int rno;
	private int m_no;
	private int spot_id;
	private int n_no;
	private int l_no;

	public Attach() { }


	public Attach(int attach_no, String attach_name, String a_status, int rno, int m_no, int spot_id, int n_no,
			int l_no) {
		super();
		this.attach_no = attach_no;
		this.attach_name = attach_name;
		this.a_status = a_status;
		this.rno = rno;
		this.m_no = m_no;
		this.spot_id = spot_id;
		this.n_no = n_no;
		this.l_no = l_no;
	}


	public Attach(String attach_name) {
		this.attach_name = attach_name;
	}


	@Override
	public String toString() {
		return "Attach [attach_no=" + attach_no + ", attach_name=" + attach_name + ", a_status=" + a_status + ", rno="
				+ rno + ", m_no=" + m_no + ", spot_id=" + spot_id + ", n_no=" + n_no + ", l_no=" + l_no + "]";
	}


	public int getAttach_no() {
		return attach_no;
	}


	public void setAttach_no(int attach_no) {
		this.attach_no = attach_no;
	}


	public String getAttach_name() {
		return attach_name;
	}


	public void setAttach_name(String attach_name) {
		this.attach_name = attach_name;
	}


	public String getA_status() {
		return a_status;
	}


	public void setA_status(String a_status) {
		this.a_status = a_status;
	}


	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public int getM_no() {
		return m_no;
	}


	public void setM_no(int m_no) {
		this.m_no = m_no;
	}


	public int getSpot_id() {
		return spot_id;
	}


	public void setSpot_id(int spot_id) {
		this.spot_id = spot_id;
	}


	public int getN_no() {
		return n_no;
	}


	public void setN_no(int n_no) {
		this.n_no = n_no;
	}


	public int getL_no() {
		return l_no;
	}


	public void setL_no(int l_no) {
		this.l_no = l_no;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}