package com.example.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.common.errors.Exception400;

// RuntimeException 터지면 해당 파일로 오류가 모인다.
@RestControllerAdvice // 전역에서 발생할 수 있는 예외를 캐치해 처리해주는 Annotation
// C.A --> 뷰 에러페이, R.C.A 데이터 반환 (에러)
public class MyExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);
	
	@ExceptionHandler(Exception400.class)
	public ResponseEntity<ApiUtil<Object>> ex400(Exception400 e) {
		
		logger.error("400 Error: {}", e.getMessage());
		ApiUtil<Object> apiUtil = new ApiUtil<Object>(400, e.getMessage());
		return new ResponseEntity<ApiUtil<Object>> (apiUtil, HttpStatus.BAD_REQUEST);
	}
	
	

}
