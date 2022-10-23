package com.tourist.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TG-Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	@Column(name = "First-Name", length = 20)
	private String firstName;
	@Column(name = "Middle-Name", length = 20)
	private String middleName;
	@Column(name = "Last-Name", length = 20)
	private String lastName;
	@Column(name = "Phone-Number", length = 15)
	private String phnNo;
	@Column(name = "Email", length = 50)
	private String email;
	@Column(name = "address", length = 100)
	private String address;
	@Column(name = "City", length = 10)
	private String city;
	@Column(name = "State", length = 20)
	private String state;
	@Column(name = "Country", length = 20)
	private String country;
	@Column(name = "Preferred ", length = 20)
	private String prefLanguage;
}
