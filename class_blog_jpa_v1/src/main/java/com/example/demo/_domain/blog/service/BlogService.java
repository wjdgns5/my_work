package com.example.demo._domain.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo._domain.blog.dto.ArticleDTO;
import com.example.demo._domain.blog.entity.Article;
import com.example.demo._domain.blog.repository.PostRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service // IoC (빈으로 등록) (스프링컨테이너가 생성해줌)
public class BlogService {

	@Autowired // DI <-- 개발자들이 가독성 때문에 작성을 해 준다.
	private final PostRepository postRepository;

	@Transactional // 쓰기 지연 처리 까지
	public Article save(ArticleDTO dto) {
		// 비지니스 로직이 필요하다면 작성 ...
		return postRepository.save(dto.toEntitly());
	}

	// 전체 게시글 조회 기능
	public List<Article> findAll() {
		List<Article> articles = postRepository.findAll();
		return articles;
	}
}
