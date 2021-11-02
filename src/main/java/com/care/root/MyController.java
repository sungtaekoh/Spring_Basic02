package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="index")
//	url경로
	public String memberIndex() {
		return "member/index";
		//파일경로
	}
	@RequestMapping("logout")
	public String memberLogout(Model model) {
		model.addAttribute("key", "로그아웃 되었습니다");
		//값을 전달한다
		return "member/logout";
	}
	
	//위의 코드와 비슷하다
	@RequestMapping("/login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login","로그인 성공하였다!!!");
		//값을 전달한다
		
		mv.setViewName("member/login");
		return mv;
	}
}
