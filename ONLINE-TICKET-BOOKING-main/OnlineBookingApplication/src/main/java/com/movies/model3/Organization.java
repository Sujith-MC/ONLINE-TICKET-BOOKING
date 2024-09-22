package com.movies.model3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Organization {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
    private	 String OrganizationName;
    private  String admin;
    private  String GSTNUMBER;
    
	public  String getOrganizationName() {
		return OrganizationName;
	}
	public  void setOrganizationName(String organizationName) {
		OrganizationName = organizationName;
	}
	public  String getAdmin() {
		return admin;
	}
	
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public  String getGSTNUMBER() {
		return GSTNUMBER;
	}
	public  void setGSTNUMBER(String gSTNUMBER) {
		GSTNUMBER = gSTNUMBER;
	}
	@Override
	public String toString() {
		return "Organization [Id=" + Id + ", OrganizationName=" + OrganizationName + ", admin=" + admin + ", GSTNUMBER="
				+ GSTNUMBER + "]";
	}
	
	
	
	
	

}
