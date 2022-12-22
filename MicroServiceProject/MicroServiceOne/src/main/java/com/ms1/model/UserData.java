package com.ms1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int profileId;
	private String name;
	private int depId;
//	@JsonProperty(access = Access.READ_ONLY)
//	private DepDetails depDetails;

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

//	public DepDetails getDepDetails() {
//		return depDetails;
//	}
//
//	public void setDepDetails(DepDetails depDetails) {
//		this.depDetails = depDetails;
//	}

}
