package com.example.demo._domain.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo._domain.blog.entity.Article;

// C R U D
// @Repository <-- 생략 가능 왜? 상속한 녀석에게 어노테이션이 존재 한다.
public interface PostRepository extends JpaRepository<Article, Integer> {
	
	// 기본적인 CRUD 기능을 자동을 제공 한다.
	
	// 필요하다면 우리가 만들어 놓은 곳에 추가적인 쿼리나 메서드 정의 가능하다.
}
