package ch01;

import java.util.Arrays;
import java.util.List;

public class StreamFilterTest3 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// 리스트의 숫자들을 모두 더함
		int sum = numbers.stream().reduce(0, (a, b) -> a + b); // 스트림의 요소들을 하나로 결합
		System.out.println(sum); // 출력: 15
	}

}
