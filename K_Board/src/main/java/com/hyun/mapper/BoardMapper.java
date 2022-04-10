package com.hyun.mapper;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardMapper {

	/* # 작가 등록 */
	public void enroll(BoardVO vo);

	public List<BoardVO> getList();
	
}
