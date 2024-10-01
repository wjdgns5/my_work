package member.service;

import member.Member;

public interface MemberService {
	
	void signUp(Member member);
	Member findByIdMember(Long memberId);

}
