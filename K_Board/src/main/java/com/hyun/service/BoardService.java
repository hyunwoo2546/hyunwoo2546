package com.hyun.service;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardService {

	/* # �Խ��� ��� */
	public void enroll(BoardVO vo);
	
	public List<BoardVO> getList();
	
}
