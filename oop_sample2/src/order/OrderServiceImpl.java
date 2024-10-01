package order;

import member.Member;
import member.repository.MemberRepository;

public class OrderServiceImpl implements OrderService {

	private final MemberRepository memberRepsitory;
	private final DiscountPolicy discountPolicy;

	public OrderServiceImpl(MemberRepository memberRepsitory, DiscountPolicy discountPolicy) {
		this.memberRepsitory = memberRepsitory;
		this.discountPolicy = discountPolicy;
	}

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepsitory.findById(memberId);
		int discountPrice = discountPolicy.discount(member, itemPrice);
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}

}
