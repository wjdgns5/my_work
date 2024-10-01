package order;

import member.Member;
import member.repository.MemberRepository;

public class OrderServiceIMPL implements OrderService {

	private final MemberRepository memberRepository;
	private final DiscountPolicy discountPolicy;
	
	public OrderServiceIMPL(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
		this.memberRepository = memberRepository;
		this.discountPolicy = discountPolicy;
	}
	
	
	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = (Member) memberRepository.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
	
	

}
