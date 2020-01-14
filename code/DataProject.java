package com.yxj.entity;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
@Alias("dataProject")
public class DataProject implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String xmbh;
	
	private String xmmc;
	
	private String xmfzr;
	
	private String jdbh;
	
	private Double jdwd;
	
	private Double jdsd;
	
	private String jdwz;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXmbh() {
		return xmbh;
	}

	public void setXmbh(String xmbh) {
		this.xmbh = xmbh;
	}

	public String getXmmc() {
		return xmmc;
	}

	public void setXmmc(String xmmc) {
		this.xmmc = xmmc;
	}

	public String getXmfzr() {
		return xmfzr;
	}

	public void setXmfzr(String xmfzr) {
		this.xmfzr = xmfzr;
	}

	public String getJdbh() {
		return jdbh;
	}

	public void setJdbh(String jdbh) {
		this.jdbh = jdbh;
	}

	public Double getJdwd() {
		return jdwd;
	}

	public void setJdwd(Double jdwd) {
		this.jdwd = jdwd;
	}

	public Double getJdsd() {
		return jdsd;
	}

	public void setJdsd(Double jdsd) {
		this.jdsd = jdsd;
	}

	public String getJdwz() {
		return jdwz;
	}

	public void setJdwz(String jdwz) {
		this.jdwz = jdwz;
	}
	
	
}
