package com.rajeev.hibernate.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*@Entity (name="User_Details")*/

@Entity
@Table(name="User_Details")
public class UserDetails {
	
/*	@Id
	@Column(name="USER_ID")*/
	
	@Id
	@Column(name="USER_ID")
	private int userId;
	
/*	@Column(name="USER_NAME")*/
	
/*	@Basic*/
	
	@Transient
	private String userName;
	
	private String address;
	
	@Lob// here it is String so it will consider characters large object clob other option is byte large object blob
	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

/*	@Id
	@Column(name="USER_ID")*/
	public int getUserId() {
		return userId;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/*@Column(name="USER_NAME")*/
	public String getUserName() {
		return userName+"from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", address=" + address + ", description="
				+ description + ", joinedDate=" + joinedDate + ", getAddress()=" + getAddress() + ", getDescription()="
				+ getDescription() + ", getJoinedDate()=" + getJoinedDate() + ", getUserId()=" + getUserId()
				+ ", getUserName()=" + getUserName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
