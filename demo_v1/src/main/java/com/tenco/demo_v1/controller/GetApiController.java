package com.tenco.demo_v1.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@RestController // IOC 대상이 된다. --> @Controller + @ResponseBody
// @RequestMapping("/xxxx") -> 대문 달기
public class GetApiController {

    // 주소설계 : http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        // 메시지 컨버터가 동작 한다.
        // StringHttpMessageConverter 객체가 동작한다.
        return "Say Hello ~";
    }

    // 쿼리스트링 방식(@RequestParam)
    // 주소설계 http://localhost:8080/qs1?name=둘리
    @GetMapping("/qs1")
    public String gs1(@RequestParam(name = "name") String name) {
        return "name=" + name;
    }

    // 주소설계 http://localhost:8080/qs2?name=둘리&age=10
    @GetMapping("/qs2")
    public String gs2(@RequestParam(name = "name") String name, 
    @RequestParam(name = "age", required =  false, defaultValue = "1") Integer age ) {
        return "name=" + name + " : age=" + age;
    }

    // 주소설계 http://localhost:8080/qs3?name=둘리&age=10&groupId=com.tenco
    @GetMapping("/qs3")
    public String gs3(@RequestParam Map<String, String> data) {
        // Map 방식으로 동적으로 데이터 바인딩 하기
        StringBuffer sb = new StringBuffer();
        data.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
            sb.append(entry.getKey() + "=" + entry.getValue());
        });

        return sb.toString();
    }

     // 쿼리스트링 방식(@RequestParam)
     // 주소설계 http://localhost:8080/qs4?name=둘리&age=10&groupId=com.tenco
    @GetMapping("/qs4")
    public String gs4(User user) {
        return user.toString();
    }

    // @GetMapping("/qs4")
    // public String qs4(User user) {
    //     return user;
    // }

    // 클래스
    @AllArgsConstructor
    @Getter
    @ToString
    class User {
        private String name;
        private Integer age;
    }
}
