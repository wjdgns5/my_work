package com.tenco.demo_v1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tenco.demo_v1.dto.userdto1;

@RestController // IoC (싱글톤 패턴으로 관리 됨 )
public class PutApiController {

     /**
     * 주소설계 
     * http://localhost:8080/put/demo1/100
     * 
     * @return JSON 
     */

     @PutMapping("/put/demo1/{id}")
     public userdto1 putMethodName(@PathVariable(name = "id") String id, 
                                                            @RequestBody userdto1 userdto1) {
         System.out.println("id : " + id);
         System.out.println("userdto1  " + userdto1.toString());
         // 메세지 컨버터 동작  (UserDTO) ->> JSON 반환을 해서 ---> 클라이언트에 응답처리 한다. 
         return userdto1;
     }

    //  @PutMapping("/put/demo1/{id}")
    //  public userdto1 putMethodName(@PathVariable(name = "id") String id) {
    //      System.out.println("id : " + id);
    //      // System.out.println("userDTO  " + userDTO.toString());
    //      // 메세지 컨버터 동작  (UserDTO) ->> JSON 반환을 해서 ---> 클라이언트에 응답처리 한다. 
    //      return null;
    //  }

}
