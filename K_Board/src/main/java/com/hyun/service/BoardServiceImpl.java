package com.hyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyun.domain.BoardVO;
import com.hyun.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper mapper;
	
	/* # 게시판 등록 */
	@Override
	public void enroll(BoardVO vo) {
		mapper.enroll(vo);
	}
	
	/* # 게시판 목록 페이지 */
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}
	
	/* # 게시판 게시물 조회 */
	@Override
	public BoardVO getPage(int bno) {
		return mapper.getPage(bno);
	}
	
}
