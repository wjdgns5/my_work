package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity (name = "address_test11")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address_test {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String city;
	private String street;
	
	// 주소여러개는 한명의 유저에게 포함될 수 있다.
	@ManyToOne
	@JoinColumn(name = "user@")
	private User_test user;
	
}
