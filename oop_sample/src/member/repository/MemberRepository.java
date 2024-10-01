package member.repository;

import member.Member;

public interface MemberRepository {
	
	void save(Member member);
	Member findById(Long memberId);
}
