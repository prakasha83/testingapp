package com.xcodefix.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "voice_address")
public class VoiceAddress {
	
	private long id;
	private long phone1;
	private long phone2;
	private long phone3;
	private long fax;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name  = "phone1")
	public long getPhone1() {
		return phone1;
	}
	public void setPhone1(long phone1) {
		this.phone1 = phone1;
	}
	
	@Column(name = "phone2")
	public long getPhone2() {
		return phone2;
	}
	public void setPhone2(long phone2) {
		this.phone2 = phone2;
	}
	
	@Column(name = "phone3")
	public long getPhone3() {
		return phone3;
	}
	public void setPhone3(long phone3) {
		this.phone3 = phone3;
	}
	
	@Column(name = "fax")
	public long getFax() {
		return fax;
	}
	public void setFax(long fax) {
		this.fax = fax;
	}
	
}
