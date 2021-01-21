package exam.spring.board.dao;

import org.apache.ibatis.annotations.Mapper;

import exam.spring.board.dto.Member;

//interface

@Mapper
public interface MembersMapper {
	public Member getMember(String id);
	public void addMember(Member member);
}
