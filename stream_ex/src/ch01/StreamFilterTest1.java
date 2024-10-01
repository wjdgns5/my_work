package ch01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterTest1 {
	
	 public static void main(String[] args) {
	        
	        // 샘플 데이터 준비
	        List<Integer> ages = Arrays.asList(20, 11, 18, 24, 33, 40, 2);
	        
	        // 나이가 18 이상인 학생만 필터링 후 List로 수집
	        List<Integer> adultAges = ages.stream()
	                                      .filter(age -> age >= 18) // 중간 연산: 나이 18 이상 필터링
	                                      .collect(Collectors.toList()); // 최종 연산: 결과를 List로 수집
	        
	        System.out.println(adultAges); // 출력: [20, 18, 24, 33, 40]
	    }

}
