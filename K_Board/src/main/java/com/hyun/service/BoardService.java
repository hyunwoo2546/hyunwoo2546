package com.hyun.service;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardService {

	/* # �Խ��� ��� */
	public void enroll(BoardVO vo);
	
	/* # �Խ��� ��� ������ */
	public List<BoardVO> getList();
	
	/* # �Խ��� ��ȸ */
	public BoardVO getPage(int bno);
	
	/* # �Խù� ���� */
	public int modify(BoardVO vo);
	
}
