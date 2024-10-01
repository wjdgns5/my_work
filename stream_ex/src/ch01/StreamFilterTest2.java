package ch01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterTest2 {

	public static void main(String[] args) {

		List<Double> prices = Arrays.asList(100.0, 200.0, 300.0);

		// 10% 세일 적용된 가격으로 변환하고 List로 수집
		List<Double> discountedPrices = prices.stream().map(price -> price * 0.9) // 모든 가격에 10% 할인
				.collect(Collectors.toList());

		// 할인된 가격 출력 (자료구조의 스트림을 사용한 최종연산 사용 코드)
		discountedPrices.forEach(e -> System.out.println("할인 가격 : " + e)); // 출력: 90.0, 180.0, 270.0
	}

}
