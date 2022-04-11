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
	
	/* # �Խ��� ��� */
	@Override
	public void enroll(BoardVO vo) {
		mapper.enroll(vo);
	}
	
	/* # �Խ��� ��� ������ */
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}
	
	/* # �Խ��� �Խù� ��ȸ */
	@Override
	public BoardVO getPage(int bno) {
		return mapper.getPage(bno);
	}
	
}
