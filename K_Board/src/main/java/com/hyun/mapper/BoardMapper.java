package com.hyun.mapper;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardMapper {

	/* # �۰� ��� */
	public void enroll(BoardVO vo);

	public List<BoardVO> getList();
	
}
