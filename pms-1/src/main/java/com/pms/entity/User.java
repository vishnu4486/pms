package com.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String userName;
	private String password;
	private String phoneNumber;
	private String fullName;
	private String address;
	private String designation;

	public User() {
		super();
	}

	public User(int id, String userName, String password, String phoneNumber, String fullName, String address,
			String designation) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.fullName = fullName;
		this.address = address;
		this.designation = designation;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", fullName=" + fullName + ", address=" + address + ", designation=" + designation
				+ "]";
	}

}
