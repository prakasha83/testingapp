package com.xcodefix.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "documents")
public class Documents {
	
	private long id;
	private byte[] externalDoc;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Lob
	@Column(name = "external_doc")
	public byte[] getExternalDoc() {
		return externalDoc;
	}
	public void setExternalDoc(byte[] externalDoc) {
		this.externalDoc = externalDoc;
	}
	
	

}
