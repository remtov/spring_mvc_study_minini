package com.ict.erp.ex01.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 클래스를 컨트롤러로 설정
@RequestMapping("/ex01") // 특정 URL에 매칭되는 클래스나 메소드를 명시
public class SampleController1 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController1.class);

	@RequestMapping("/doA") // 클래스에도 @RequestMapping이 사용되었기에 doA( )가 처리하는 URL은 /ex01/doA 로 된다. 즉 /ex01/doA 로
							// 요청이 들어올 경우 doA( ) 메소드가 해당 요청을 처리하는 것
	public void doA() {// void 타입의 경우 리턴값이 없는 대신 @RequestMapping에 지정한 URL에 해당하는 뷰 이름을 전달
		logger.info("doA 실행..........");
	}

	@RequestMapping("/doB")
	public void doB() {
		logger.info("doB 실행..........");
	}

	// void 타입일 경우 접근하는 URL 경로에 해당하는 jsp를 찾아 실행한다.
	// 예를 들어 /ex01/doB로 접근했다면 ex01 폴더 아래 doB.jsp를 찾아 실행시킨다.

}
