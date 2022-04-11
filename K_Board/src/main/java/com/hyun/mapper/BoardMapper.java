package com.hyun.mapper;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardMapper {

	/* # 작가 등록 */
	public void enroll(BoardVO vo);

	/* # 목록 페이지 */
	public List<BoardVO> getList();
	
	/* # 게시판 조회 */
	public BoardVO getPage(int bno);
	
}
