package com.hyun.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyun.controller.BoardController;
import com.hyun.domain.BoardVO;
import com.hyun.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
	@Autowired
	private BoardService service;

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	/*
	 * @Test public void testEnroll() { BoardVO vo = new BoardVO();
	 * 
	 * vo.setTitle("mapper test"); vo.setContent("mapper test");
	 * vo.setWriter("mapper test");
	 * 
	 * mapper.enroll(vo); }
	 */

	/*
	 * @Test public void testGetList() { List list = mapper.getList();
	 * 
	 * 
	 * for(int i = 0; i < list.size(); i++) { log.info("" + list.get(i)); }
	 * 
	 * 
	 * for(Object a : list) { log.info("" + a); } }
	 */

	@Test
	public void testGetList() {

		service.getList().forEach(board -> log.info("" + board));
		
	}
	
	@Test
	public void testGetPage() {
		int bno = 21;
		
		log.info("" + service.getPage(bno));
	}

 }
