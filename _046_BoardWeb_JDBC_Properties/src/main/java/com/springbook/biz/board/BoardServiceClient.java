package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		//1. Spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Lookup�Ѵ�.
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		//3. �� ��� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setTitle("46th");
		vo.setWriter("thomas");
		vo.setContent("its 7:21pm");
		boardService.insertBoard(vo);
		
		//4. �� ��� ��ȸ �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
		
		//5. Spring �����̳� ����
		container.close();
	}
}