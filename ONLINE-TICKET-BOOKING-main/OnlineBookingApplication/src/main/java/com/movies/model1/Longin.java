package com.movies.model1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Longin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String Name;
	private String UId;
	private String AId;
	private String Password;
	private String EmloyeeId;
	
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}


	
	

	public String getUId() {
		return UId;
	}
	public void setUId(String uId) {
		UId = uId;
	}
	public String getAId() {
		return AId;
	}


	public void setAId(String aId) {
		AId = aId;
	}


	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getEmloyeeId() {
		return EmloyeeId;
	}


	public void setEmloyeeId(String emloyeeId) {
		EmloyeeId = emloyeeId;
	}
	


	@Override
	public String toString() {
		return "User [Id=" +  ", UId=" + UId + ", Password=" + Password + "]";
	}

}
