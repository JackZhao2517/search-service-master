package com.smc.sba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.text.DateFormat;
;

@Entity
@Table(name = "ipodetails")

public class IpoDetlsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ipoid;

	@Column(name = "companyname")
	private String companyName;
	
	@Column(name = "stockexchange")
	private String stockExchange;
	
	@Column(name = "pricepershare")
	private BigDecimal pricePerShare;
	
	@Column(name = "totalnumber")
	private Integer totalNumber;
	
	@Column(name = "opendatetime")
	private DateFormat openDatetime;
	@Column(name = "iporemarks")
	private String ipoRemarks;
	public Integer getIpoid() {
		return ipoid;
	}
	public void setIpoid(Integer ipoid) {
		this.ipoid = ipoid;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public BigDecimal getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(BigDecimal pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public Integer getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}
	public DateFormat getOpenDatetime() {
		return openDatetime;
	}
	public void setOpenDatetime(DateFormat openDatetime) {
		this.openDatetime = openDatetime;
	}
	public String getIpoRemarks() {
		return ipoRemarks;
	}
	public void setIpoRemarks(String ipoRemarks) {
		this.ipoRemarks = ipoRemarks;
	}
	
	

}
