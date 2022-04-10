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
	
	@Override
	public void enroll(BoardVO vo) {
		mapper.enroll(vo);
	}
	
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}
	
}
