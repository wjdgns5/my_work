package com.example.demo.common;

// 클래스가 특정 타입 T에 대한 작업을 수행할 수 있음을 의미
public class ApiUtil<T> {
	
	private Integer status;  // 응답 상태 코드 저장 (200, 400, 500)
	private String msg; // 응답 메시지 저장(성공, 실패 문자열)
	private T body;  // 응답의 실제 데이터 저장(제네릭 활용) 
		
	// 성공적인 응답을 반환 할 때 사용하는 생성자 
	public ApiUtil(T body) {
		this.body = body;
	}

	// 커스텀 상태코드와 메시지를 반환 시킬 때 사용하는 생성자 (예 : 에러 응답) 
	public ApiUtil(Integer status, String msg) {
		this.status = status;
		this.msg = msg;
	}
}
