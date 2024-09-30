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

// 댓글 테이블

@Entity(name = "tb_Comment") // 테이블 이름 tb_Comment로 변경
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	
	@Id // PK 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 코드 --> db 위임
	private Long id;
	private String text;
	
	
	// 여러개의 댓글은 하나의 게시글을 바라본다.
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
}
