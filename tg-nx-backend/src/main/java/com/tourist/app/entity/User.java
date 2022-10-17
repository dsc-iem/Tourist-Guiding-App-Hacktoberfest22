package com.tourist.app.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("Personal_Users")
public class User {

	private String name;
	private String address;
	private String prefLanguage;

}
