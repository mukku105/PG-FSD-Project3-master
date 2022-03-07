package com.sportyShoes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String password;
	private String firstName;
	private String email;
	private Boolean isAdmin;
	@OneToMany
	private List<Purchase> listOfPurchases;
	public int getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getEmail() {
		return email;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public List<Purchase> getListOfPurchases() {
		return listOfPurchases;
	}
	

}
