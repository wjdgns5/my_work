package com.example.demo._domain.blog.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.http.MediaType;

import com.example.demo._domain.blog.dto.ArticleDTO;
import com.example.demo._domain.blog.entity.Article;
import com.example.demo._domain.blog.service.BlogService;
import com.example.demo.common.ApiUtil;

import lombok.RequiredArgsConstructor;

@Controller
@ResponseBody
@RequiredArgsConstructor
@RequestMapping("/api")
public class BlogApiController {

	private final BlogService blogService;

	// URL, 즉, 주소 설계 - http://localhost:8080/api/article
	@PostMapping("/articles")
	public ResponseEntity<Article> addArticle(@RequestBody ArticleDTO dto) {
		// 1. 인증 검사
		// 2. 유효성 검사
		Article savedArtilce = blogService.save(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedArtilce);
	}

	// URL , 즉, 주소 설계 - http://localhost:8080/api/articles
	@GetMapping(value = "/articles", produces = MediaType.APPLICATION_JSON_VALUE)
	public ApiUtil<List<Article>> getAllArticles() {
		List<Article> articles = blogService.findAll();
		if (articles.isEmpty()) {
			return new ApiUtil<>(204, "조회된 게시글이 없습니다");
		}
		return new ApiUtil<>(articles);
	}
}
