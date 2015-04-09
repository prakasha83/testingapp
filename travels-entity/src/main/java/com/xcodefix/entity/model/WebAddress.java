package com.xcodefix.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "web_address")
public class WebAddress {
	
	private long id;
	private String emailAddress1;
	private String emaailAddress2;
	private String webSiteUrl;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name =  "email_address1")
	public String getEmailAddress1() {
		return emailAddress1;
	}
	public void setEmailAddress1(String emailAddress1) {
		this.emailAddress1 = emailAddress1;
	}
	
	@Column(name = "email_address2")
	public String getEmaailAddress2() {
		return emaailAddress2;
	}
	public void setEmaailAddress2(String emaailAddress2) {
		this.emaailAddress2 = emaailAddress2;
	}
	
	@Column(name = "web_site_url")
	public String getWebSiteUrl() {
		return webSiteUrl;
	}
	public void setWebSiteUrl(String webSiteUrl) {
		this.webSiteUrl = webSiteUrl;
	}
	
}
