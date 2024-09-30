package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 게시글 테이블

@Entity(name = "tb_post") // 테이블 이름 tb_post로 변경
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	
	@Id // PK 지정
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 코드 --> db 위임
	private Long id;
	private String title;
	private String content;
	
	// 댓글은 여러개 이므로 list로 받아온다.
	// 하나의 게시글에는 여러개의 댓글을 바라본다.
	
	// mappedBy : post - 연관 관계의 주인이 Comment 엔티티에 post(속성) 필드 임을 나타낸다.
	// 객체 필드 기준으로 생각해야 합니다.
	// mappedBy 영어 단어 : 매핑기준
	
	// CascadeType.ALL 제약을 설정하게 되면 Post 엔티티에 대한 모든 상태 변경 (저장, 삭제 등)이
	// 관련된 Comment 엔티티에 전파 된다.
	@OneToMany(mappedBy = "post" , cascade = CascadeType.ALL)
	private List<Comment> comments;
	
}
