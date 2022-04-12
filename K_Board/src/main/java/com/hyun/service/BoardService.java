package com.hyun.service;

import java.util.List;

import com.hyun.domain.BoardVO;

public interface BoardService {

	/* # 게시판 등록 */
	public void enroll(BoardVO vo);
	
	/* # 게시판 목록 페이지 */
	public List<BoardVO> getList();
	
	/* # 게시판 조회 */
	public BoardVO getPage(int bno);
	
	/* # 게시물 수정 */
	public int modify(BoardVO vo);
	
}
