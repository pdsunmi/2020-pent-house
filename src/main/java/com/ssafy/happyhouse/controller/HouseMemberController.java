//package com.ssafy.happyhouse.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.ssafy.happyhouse.model.MemberDto;
//import com.ssafy.happyhouse.model.service.MemberService;
//
//import io.swagger.annotations.ApiOperation;
//
//
//
//@Controller
//@RequestMapping("/user")
//public class HouseMemberController {
//	
//	@Autowired
//	private MemberService service;
//	
//
//	//모든 에러는 여기에 모아주세요
//	@ExceptionHandler
//	//ExceptionHandler 메서드는 Model을 받을 수가 없어요, 어떤 정보를 담아서 주고싶어서.
//	public ModelAndView exHandler(Exception e) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("error", e.getMessage());
//		mv.setViewName("error/error");
//		return mv;
//	}
//	
//	
//	//회원가입
//	@PostMapping("/regist")
//	public String doRegist(@ModelAttribute MemberDto user) throws SQLException {
//		int result = service.join(user);
//		System.out.println("회원가입 완료.");
//		return "index";
//	}
//	
//
//	//로그인
//	@PostMapping("/login")
//	public String doLogin(@ModelAttribute MemberDto user, HttpSession session, Model model) throws SQLException {
//		boolean result = service.login(user.getId(), user.getPassword());
//		
//		System.out.println(user.getId() );
//		if(result) {
//			session.setAttribute("loginUser", user);
//			System.out.println("로그인 성공!");
//			return "redirect:/index";
//		}else {
//			System.out.println("로그인 실패.");
//			model.addAttribute("msg", "로그인 실패! 다시 시도해주세요");
//			return "redirect:/index";
//		}
//	}
//	
//	//로그아웃
//	@GetMapping("/logout")
//	public String list(HttpSession session) {
//		session.invalidate();
//		return "redirect:/index";
//	}
//	
//	//회원조회
//	@GetMapping("/lookup")
//	public String lookup(HttpSession session, Model model) throws SQLException {
//		MemberDto member = (MemberDto)session.getAttribute("loginUser");
//		MemberDto result = service.lookup(member.getId());
//		System.out.println(result);
//		model.addAttribute("member", result);
//		return "/member";
//	}
//
//	//회원수정 페이지로가.
//	@GetMapping("/update")
//	public String updateForm() {
//		return "/memberUpdate";
//	}
//	
//	//회원정보 수정하기.
//	@PostMapping("/update")
//	public String update(@ModelAttribute MemberDto user, HttpSession session, Model model) throws SQLException {
//		MemberDto loginUser = (MemberDto) session.getAttribute("loginUser");
//		if(loginUser != null) {
//			user.setId(loginUser.getId());
//			loginUser = service.lookup(loginUser.getId());
//			
//			if(user.getName() == "") {
//				user.setName(loginUser.getName());
//			}if(user.getAddress() == "") {
//				user.setAddress(loginUser.getAddress());
//			}if(user.getPassword() == "") {
//				user.setPassword(loginUser.getPassword());
//			}if(user.getEmail() == "") {
//				user.setEmail(loginUser.getEmail());
//			}if(user.getPhone() == "") {
//				user.setPhone(loginUser.getPhone());
//			}if(user.getRole() == "") {
//				user.setRole(loginUser.getRole());
//			}
//
//			
//			boolean result = service.update(user);
//			System.out.println("이름은"+user.getId());
//			if(result) {
//				session.setAttribute("member", service.lookup(user.getId()));
//				return "redirect:/user/lookup";
//			}else {
//				model.addAttribute("error", "회원정보 수정 오류입니다.");
//				return "error/error";
//			}
//			
//		}else {
//			System.out.println("로그인부터해주세여.");
//			return "index";
//		}
//	}
//	
//	//회원정보 삭제
//	@GetMapping("/delete")
//	public String delete(HttpSession session) throws SQLException {
//		MemberDto user = (MemberDto) session.getAttribute("loginUser");
//		service.delete(user.getId());
//		//다 성공하면 세션 삭제.
//		session.invalidate();
//		return "index";
//	}
//	
//}
