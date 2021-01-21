package exam.spring.board.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import exam.spring.board.config.ApplicationConfig;
import exam.spring.board.dto.Member;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class MembersMapperTest {
	@Autowired
	MembersMapper membersMapper;
	
	@Test
	public void getMember() throws Exception{
		Member member = membersMapper.getMember("jiyoung");
		Assert.assertNotNull(member);
	}
	@Test
	public void addMember() throws Exception{
		Member testMember = new Member();
		testMember.setId("test");
		testMember.setName("테스트");
		testMember.setPassword("test");
		testMember.setEmail("test@test.com");
		
		membersMapper.addMember(testMember);
		Assert.assertNotNull(membersMapper.getMember("test"));
	}

}
