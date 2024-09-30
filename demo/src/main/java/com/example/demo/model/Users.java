package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	// @OneToOne(fetch = FetchType.LAZY)
	// OneToOne - Users, Address 엔티티 간의 1:1 관계를 매핑합니다.
	// FetchType.LAZY : 지연로딩 전략을 사용합니다. getAddress() 
	
	@OneToOne(fetch = FetchType.LAZY) 
	
	// @JoinColumn : 외래키 (FK)를 설정하는 어노테이션 이다.
	// address_id 라는 이름이 외래키 컬럼 Users 테이블에 추가 됩니다. 
	@JoinColumn(name = "address_id")
	private Address address;

}
