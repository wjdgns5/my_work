package com.tenco.demo_v1.dto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
     * 주소 설계
     * http://localhost:8080/post/demo2 Post 방식
     * http://localhost:8080/post/demo2
     * @param 본문 - {"name" : "둘리", "age" : 11, "phone_number" : "010-1234-5678"}
     * @param JSON
     * [Post 요청에서 본문이 있다. RequestBody - Object 로 파싱]
     * 테스트 - post man 활용
     * DTO 방식으로 데이터 내려 보기
     * @RequestBody 생략 가능
     */

@RestController // IoC 대상 
@RequestMapping("/post")
public class UserDTO {
    
    @PostMapping("/demo2")
    public String postTest(@RequestBody Map<String, Object> reqData) {
        StringBuffer sb = new StringBuffer();
        reqData.entrySet().forEach((entry)-> {
            sb.append(entry.getKey() + " @=@ " + entry.getValue());
        });
        
        return sb.toString();
    }
    

}
