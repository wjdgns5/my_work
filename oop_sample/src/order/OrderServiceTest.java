package order;

import member.Grade;
import member.Member;
import member.repository.MemberRepository;
import member.repository.MemoryMemberRepositoryIMPL;

public class OrderServiceTest {

	public static void main(String[] args) {
		MemberRepository memberRepository = new MemoryMemberRepositoryIMPL().getInstance();
		Member member = new Member(1L, "홍길동", Grade.VIP);

		// 고정 할인 정책 테스트
		DiscountPolicy fiDiscountPolicy = new FixDiscountPolicyIMPL();
		OrderService orderService = new OrderServiceIMPL(memberRepository, fiDiscountPolicy);
		Order order1 = orderService.createOrder(1L, "맥북", 10000);

		System.out.println(order1);
		System.out.println(order1.caculateDiscount());

		
		DiscountPolicy percentDiscountPolicy = new FixDiscountPolicyIMPL();
		OrderService orderService1 = new OrderServiceIMPL(memberRepository, percentDiscountPolicy);
		Order order2 = orderService1.createOrder(1L, "맥북", 10000);

		System.out.println(order2);
		System.out.println(order2.caculateDiscount());

	}

}
