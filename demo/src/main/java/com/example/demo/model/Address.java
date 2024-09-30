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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	// @Id: 이 필드는 데이터베이스 테이블의 기본 키(primary key)를 나타냅니다.
	// 이 어노테이션은 해당 필드가 엔티티의 고유 식별자임을 나타내며,
	// 데이터베이스 테이블에서 이 필드를 기준으로 레코드를 구분합니다.

	// @GeneratedValue(strategy = GenerationType.IDENTITY):
	// 이 어노테이션은 기본 키가 자동으로 생성되도록 설정합니다.
	// GenerationType.IDENTITY 전략은 데이터베이스의 "AUTO_INCREMENT" 기능을 사용하여
	// 기본 키 값을 자동으로 생성합니다.
	// 따라서, 새로운 엔티티가 데이터베이스에 삽입될 때마다
	// 고유한 ID 값이 자동으로 생성되고 할당됩니다.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String city;
	private String street;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;
}
