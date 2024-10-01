package order;

import member.Grade;
import member.Member;

public class FixDiscountPolicyIMPL implements DiscountPolicy {

	private int discountFixAmount = 1500;
	
	@Override
	public int discount(Member member, int price) {
		// VIP 회원만 할인 금액이 적용 된다.
		if(member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		}
		return 0;
	} // end of discount
}
