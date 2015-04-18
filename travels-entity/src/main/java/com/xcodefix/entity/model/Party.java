package com.xcodefix.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.xcodefix.entity.model.type.EntityType;
import com.xcodefix.entity.model.type.PartyType;

@Entity
@Table(name = "party")
public class Party {
	
	private long id;
	private String partyName;
	private PartyType partyType;
	private EntityType entityType;
	private PostalAddress postalAddress;
	private VoiceAddress voiceAddress;
	private WebAddress webAddress;
	private RecordStaus recordStatus;
	private Documents documents;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "party_name")
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	
	@Column(name = "party_type")
	@Enumerated(EnumType.STRING)
	public PartyType getPartyType() {
		return partyType;
	}
	public void setPartyType(PartyType partyType) {
		this.partyType = partyType;
	}
	
	@Column(name = "entity_type")
	@Enumerated(EnumType.STRING)
	public EntityType getEntityType() {
		return entityType;
	}
	public void setEntityType(EntityType entityType) {
		this.entityType = entityType;
	}
	
	@OneToOne
	@JoinColumn(name = "post_address_id")
	public PostalAddress getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	@OneToOne
	@JoinColumn(name =  "voice_address_id")
	public VoiceAddress getVoiceAddress() {
		return voiceAddress;
	}
	public void setVoiceAddress(VoiceAddress voiceAddress) {
		this.voiceAddress = voiceAddress;
	}
	
	@OneToOne
	@JoinColumn(name = "web_address_id")
	public WebAddress getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(WebAddress webAddress) {
		this.webAddress = webAddress;
	}
	
	@OneToOne
	@JoinColumn(name = "record_status_id")
	public RecordStaus getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(RecordStaus recordStatus) {
		this.recordStatus = recordStatus;
	}
	
	@OneToOne
	@JoinColumn(name = "document_id")
	public Documents getDocuments() {
		return documents;
	}
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}
	
}
