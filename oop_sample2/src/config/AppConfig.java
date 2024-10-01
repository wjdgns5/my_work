package config;

import member.repository.MemberRepository;
import member.repository.MemoryMemberRepositoryImpl;
import member.service.MemberService;
import member.service.MemberServiceImpl;
import order.DiscountPolicy;
import order.FixDiscountPolicyImpl;
import order.OrderService;
import order.OrderServiceImpl;

public class AppConfig {
	
	public MemberRepository geMemberRepsitory() {
		return MemoryMemberRepositoryImpl.getInstance();
	}
	
	public MemberService getMemberService() {
		return new MemberServiceImpl(geMemberRepsitory());
	}
	
	public DiscountPolicy getDiscountPolicy() {
		// 할인 정책이 --> 고정할인 
		// 변경 --->정율 할인 바꾸면 된다. 
		 return new FixDiscountPolicyImpl();  // 이 부분만 변경하면 됩니다. 
		//return new PercentDiscountPolicyImpl();
	}
	
	public OrderService getOrderService() {
		return new OrderServiceImpl(geMemberRepsitory(), getDiscountPolicy());
	}

}
