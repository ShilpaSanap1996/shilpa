package com.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class EnquireDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryId;
	private String fullName;
	private String address;
	private String email;
	private int age;

	@Lob
	@Column(length = 999999999)
	private byte[] profileImage;
	@Lob
	@Column(length = 999999999)
	private byte[] adharCard;
	@Lob
	@Column(length = 999999999)
	private byte[] panCard;

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public byte[] getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(byte[] adharCard) {
		this.adharCard = adharCard;
	}

	public byte[] getPanCard() {
		return panCard;
	}

	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}

}
