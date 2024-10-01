package ch01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// 1. 짝수만 필터링하고 제곱하여 새로운 리스트로 반환하는 코드를 작성하세요.
		// 힌트: filter()와 map()을 사용합니다.

		List<Integer> number = numbers.stream()
				.filter(n -> n % 2 == 0) 
				.map(n -> n * n)
				.collect(Collectors.toList());
				
		System.out.println(number);
	}
}
