package com.tenco.demo_v1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Ioc 대상 (싱글톤 패턴으로 관리)
public class DeleteApiController {

     // http://localhost:8080/delete/100?account=우리은행
    @GetMapping("/delete/{userId}")

    /**
     * DELETE 요청을 처리     * 
     * 주소 설계 (브라우저에서 직접 요청할 수 없음, 보통 Postman 등으로 테스트)
     * http://localhost:8080/delete/100?account=우리은행
     * 
     * DELETE 방식은 본문(HTTP 요청 메시지 Body)가 없다.
     * @PathVariable과 @RequestParam을 함께 사용하여 경로 변수와 쿼리 파라미터를 동시에 처리할 수 있습니다.
     * 
     * @param userId 삭제하려는 사용자의 ID (경로 변수)
     * @param account 삭제 작업과 관련된 계좌 정보 (쿼리 파라미터)
     * @return 삭제 결과를 포함하는 ResponseEntity
     * 추가 고려 사항  
     * 인증 및 권한 검사
     * 응답 처리: 삭제가 성공여부에 따라 다른 상태 내려야 함 
     * (예: 404 Not Found, 500 Internal Server Error 등)
     */

@DeleteMapping("/delete/{userId}")
public ResponseEntity<?> delete(@PathVariable(name = "userId") String userId,
                                                         @RequestParam(name =  "account") String account) {
    System.out.println("userId : " + userId);
    System.out.println("account : " + account);

    return ResponseEntity.status(200).body("정상삭제 되었습니다.");
}


}
