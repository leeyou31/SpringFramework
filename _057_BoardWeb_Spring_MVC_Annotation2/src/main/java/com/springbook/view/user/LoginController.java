package com.springbook.view.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

//SpringFramework���� �����ϴ� Controller interface�� handleRequest�޼ҵ�� ���� Ÿ�� ModelAndView
@Controller
public class LoginController {
	@RequestMapping(value="/login.do")
	public String login(UserVO vo, UserDAO userDAO) {
		System.out.println("�α��� ó��");
		
		//�α��� ���� �� �Խ��� ��� ��ȸ ȭ������ �̵�
		if(userDAO.getUser(vo) != null) {
			/*
				foward, include : RequestDispatcher�� �̿��Ͽ� �������� ������ ȭ���� ����
								   �� ���� ��û�� �������� ó���ǹǷ� �ӵ��� ������ URL ������� ����
								   ���� ���������� �ۼ��� �������� ������ ������
								  forward : �̵��� �������� ������� ���������� �Ѱ���
								  include : �̵��� �������� ó���� ������ �ٽ� ���� �������� ����� �Ѱ���
				redirect : �̵��� JSP���� �������� ����޽����� �����ְ� �ٽ� ������ ���û ���
				                   �ӵ��� forward, include�� ���ؼ� ������ URL�� �̵��� �������� ����
				                   ��û�� ���� ��ü�� ���� �����ؼ� �����ϱ� ������ ���� ���������� �ۼ��� ������ ������ �Ұ���
			*/
			//redirect : viewResolver�� �����ϰ� �ٷ� �����̷�Ʈ
			return "redirect:getBoardList.do";
		//�α��� ���� �� �ٽ� �α��� ȭ������ �̵�
		} else {
			return "login.jsp";
		}
	}
}