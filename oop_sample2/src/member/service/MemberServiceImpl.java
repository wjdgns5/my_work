package member.service;

import member.Member;
import member.repository.MemberRepository;

public class MemberServiceImpl implements MemberService {
	
	private MemberRepository repository;
	
	public MemberServiceImpl(MemberRepository repository) {
		this.repository = repository;
	}

	@Override
	public void signUp(Member member) {
		repository.save(member);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findByIdMember(Long memberId) {
		// TODO Auto-generated method stub
		return repository.findById(memberId);
	}
	
	

}
