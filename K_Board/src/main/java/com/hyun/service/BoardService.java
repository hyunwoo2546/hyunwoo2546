package com.hyun.service;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardService {

	/* # 게시판 등록 */
	public void enroll(BoardVO vo);
	
	public List<BoardVO> getList();
	
}
