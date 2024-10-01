package member.repository;

import java.util.HashMap;
import java.util.Map;

import member.Grade;
import member.Member;

public class MemoryMemberRepositoryImpl implements MemberRepository {
	
	private static MemoryMemberRepositoryImpl instance;
	private Map<Long, Member>memberStore = new HashMap<>();
	
	public MemoryMemberRepositoryImpl() {
		// TODO Auto-generated constructor stub
		initData();
	} // 생성자
	
	public static MemoryMemberRepositoryImpl getInstance() {
		
		if(instance == null) {
			instance = new 	MemoryMemberRepositoryImpl();
		}
		return instance;
	}
	
	private void initData() {
		memberStore.put(1L, new Member(1L, "홍길동", Grade.VIP));
		memberStore.put(2L, new Member(2L, "이몽룡", Grade.BASIC));
		memberStore.put(3L, new Member(3L, "성춘향", Grade.VIP));
	}

	@Override
	public void save(Member member) {
		// TODO Auto-generated method stub
		memberStore.put(member.getId(), member);
		
	}

	@Override
	public Member findById(Long memberId) {
		// TODO Auto-generated method stub
		return memberStore.get(memberId);
	}
};
