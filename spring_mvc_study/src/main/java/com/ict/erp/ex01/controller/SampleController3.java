package com.ict.erp.ex01.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ict.erp.ex01.vo.MemberVO;

@Controller
@RequestMapping("/ex01")
public class SampleController3 {

	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);

	@RequestMapping("/doD")
	public String doD(Model model) {// . 메소드가 실행되면 data.jsp 가 보여지게

		logger.info("doD 실행...........");

		MemberVO member = new MemberVO();// 객체를 만들고 거기에 userid와 userpw 값을 각각 세팅

		member.setUserid("userid-01");
		member.setUserpw("userpw-01");

		model.addAttribute("member", member);// addAttribute("이름", 객체) 를 사용하였기 때문에 뷰인 data.jsp 에서는 member 라는 이름으로
												// MemberVO 에 담긴 값을 사용할 수 있다.

		// model.addAttribute(member);

		logger.info("MemberVO : " + member.toString());

		return "ex01/data";
	}

	@RequestMapping("/doE")
	public String doE(Model model) {// . 메소드가 실행되면 data.jsp 가 보여지게

		logger.info("doE 실행...........");

		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", "userid-02");
		map.put("userpw", "userpw-02");

		model.addAttribute("map", map);// 차이점은 Map을 사용했다는것인데 기본적으로는 동일

		return "ex01/data";
	}

	@RequestMapping("/doF")
	private String getIp(HttpServletRequest request) {

		String ip = request.getHeader("X-Forwarded-For");

		logger.info(">>>> X-FORWARDED-FOR : " + ip);

		if (ip == null) {
			ip = request.getHeader("Proxy-Client-IP");
			logger.info(">>>> Proxy-Client-IP : " + ip);
		}
		if (ip == null) {
			ip = request.getHeader("WL-Proxy-Client-IP"); // 웹로직
			logger.info(">>>> WL-Proxy-Client-IP : " + ip);
		}
		if (ip == null) {
			ip = request.getHeader("HTTP_CLIENT_IP");
			logger.info(">>>> HTTP_CLIENT_IP : " + ip);
		}
		if (ip == null) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			logger.info(">>>> HTTP_X_FORWARDED_FOR : " + ip);
		}
		if (ip == null) {
			ip = request.getRemoteAddr();
		}

		logger.info(">>>> Result : IP Address : " + ip);

		return ip;

	}

}
