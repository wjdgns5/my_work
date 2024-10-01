package member.service;

import member.Member;

public interface MemberService {
	
	// 회원가입 서비스
	void signUp(Member member);
	
	// 유저번호 찾기 서비스
	Member findByIdMember(Long memberId);

}
