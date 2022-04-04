package com.hyun.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyun.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testEnroll() {
		BoardVO vo = new BoardVO();
		
		vo.setTitle("mapper test");
		vo.setContent("mapper test");
		vo.setWriter("mapper test");
		
		mapper.enroll(vo);
		
	}
	
}
