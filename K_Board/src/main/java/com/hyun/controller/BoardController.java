package com.hyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hyun.domain.BoardVO;
import com.hyun.service.BoardService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService service;
	
	/* # ��������� */
	@GetMapping("/list")
	public void boardListGET() {
		log.info("�Խ��� ��� ������");
	}
	
	/* # �Խ��� ��� ������ GET */
	//@GetMapping("/enroll")
	@RequestMapping(value = "/enroll", method = RequestMethod.GET)
	public void boardEnrollGET() {
		log.info("�Խ��� ��� ������");
	}
	
	/* # �Խ��� ��� ������ POST */
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO vo, RedirectAttributes rttr) {
		
		log.info("BoardVO : " + vo);
		
		service.enroll(vo);
		
		rttr.addFlashAttribute("result","enroll success");
		
		return "redirect:/board/list";
	}

}
