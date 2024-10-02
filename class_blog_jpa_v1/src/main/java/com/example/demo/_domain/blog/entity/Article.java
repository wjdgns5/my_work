package com.example.demo._domain.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// 반드시 기본 생성자가 있어야 된다.
@Entity(name = "tb_article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {
	
	// 특정 생성자에만 빌더 패턴을 추가할 수 있다.
	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	@Id // PK 명시
	// 연결되어있는 PK DB로 위임
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 자동을 1씩 올라갈수 있도록 지정
	@Column(name = "id", updatable = false) // 추적을 못하도록 제약을 건다.
	private Long id;
	
	@Column(name = "title", nullable = false) // not null --> null 가능하니 = 아니
	private String title;
	
	@Column(name =  "content", nullable = false) // not null
	private String content;

}
