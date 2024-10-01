package ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterTest4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);

		// 리스트의 숫자들을 오름차순으로 정렬
		List<Integer> sortedNumbers1 = numbers.stream().sorted() // 오름차순 정렬
				.collect(Collectors.toList());

		// 내림차순 정렬
		List<Integer> sortedNumbers2 = numbers.stream().sorted(Comparator.reverseOrder()) // 내림차순 정렬
				.collect(Collectors.toList());

		System.out.println(sortedNumbers1); // 출력: [1, 2, 3, 4, 5]
		System.out.println("------------");
		System.out.println(sortedNumbers2); // 출력: [5, 4, 3, 2, 1]

	}

}
