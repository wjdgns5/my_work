package member.service;

import member.Member;
import member.repository.MemberRepository;

public class MemberServiceImpl implements MemberService {

	private MemberRepository repository; // 필드 이름 수정

	// 생성자 의존 주입 DI 
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.repository = memberRepository;  // 필드 이름 수정
	}
	
	@Override
	public void signUp(Member member) {
		repository.save(member);  // 필드 이름 수정
	}

	@Override
	public Member findByIdMember(Long memberId) {
		return repository.findById(memberId);  // 필드 이름 수정
	}
}
