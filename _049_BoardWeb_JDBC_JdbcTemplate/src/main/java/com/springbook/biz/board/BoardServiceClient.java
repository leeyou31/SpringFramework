package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		//1. Spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 BoardServiceImpl 객체를 Lookup한다.
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. 글 등록 테스트
		BoardVO vo = new BoardVO();
		vo.setTitle("49th");
		vo.setWriter("49ers");
		vo.setContent("shizzle mah nizzle");
		boardService.insertBoard(vo);
		
		//4. 글 목록 조회 테스트
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		//5. Spring 컨테이너 종료
		container.close();
	}
}
