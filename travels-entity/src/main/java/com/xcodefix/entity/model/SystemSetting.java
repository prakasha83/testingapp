package com.xcodefix.entity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "system_setting")
public class SystemSetting {
	
	private long id;
	private SystemSettingProperty property;
	private String propertyValue;
	private RecordStaus recordStatus;
	
	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@OneToOne
	@JoinColumn(name = "system_settings_property_id")
	public SystemSettingProperty getProperty() {
		return property;
	}
	public void setProperty(SystemSettingProperty property) {
		this.property = property;
	}
	
	@Column(name = "property_value")
	public String getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	@OneToOne
	@JoinColumn(name = "record_status_id")
	public RecordStaus getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(RecordStaus recordStatus) {
		this.recordStatus = recordStatus;
	}

}
