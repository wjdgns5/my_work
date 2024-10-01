package config;

import member.repository.MemberRepository;
import member.repository.MemoryMemberRepositoryIMPL;
import member.service.MemberService;
import member.service.MemberServiceImpl;
import order.DiscountPolicy;
import order.OrderService;
import order.OrderServiceIMPL;
import order.PercentDiscountPolicyIMPL;

public class AppConfig {
	
	public MemberRepository getMemberRepository() {
		return MemoryMemberRepositoryIMPL.getInstance();
	}
	
	public MemberService getMemberService() {
		return new MemberServiceImpl(getMemberRepository());
	}
	
	public DiscountPolicy getDiscountPolicy() {
		// 할인 정책이 --> 고정할인
		// 변경 ---> 정율 할인 바꾸면 된다.
//		return new FixDiscountPolicyIMPL();
		return new PercentDiscountPolicyIMPL();
	}
	
	public OrderService getOrderService() {
		return new OrderServiceIMPL(getMemberRepository(), getDiscountPolicy());
	}
}
