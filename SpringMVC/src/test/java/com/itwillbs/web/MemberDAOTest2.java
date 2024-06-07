package com.itwillbs.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itwillbs.domain.MemberVO;
import com.itwillbs.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class MemberDAOTest2 {

	// DAO 객체를 실행 => DAO객체를 필요로함 =>> DAO객체를 의존하고있다.
	// MemberDAO dao = new MemberDAO();
	// dao.getTime();

	// DAO 객체(bean)가 있는가? yes
	@Inject
	private MemberDAO mdao;
	// private MemberDAO mdao = new MemberDAOImpl();

	@Test
	public void 테스트() {
		System.out.println(" Test : 테스트() 실행 ");

		// 임시데이터 생성 => 나중에 사용자 정보입력으로 변경(컨트롤러사용)
		MemberVO vo = new MemberVO();
		vo.setTest1(1000);
		vo.setTest2("천원");
		

		mdao.insertTest(vo);

		System.out.println(" Test : 테스트() 끝 ");
	}

	
	

}
