package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	@GetMapping("/")
	public String home(Model model) {
		return "Home";
	}
	
	@GetMapping("/student")
	public String stud(Model model) {
		return "Student";
	}
	
	@GetMapping("/assignment")
	public String assignment(Model model) {
		return "Assignment";
	}
	
	@GetMapping("/quiz")
	public String quiz(Model model) {
		return "Quiz";
	}
	
	@GetMapping("/view announcements")
	public String announcements(Model model) {
		return "Announcements";
		
	}
	
	@GetMapping("/ha1")
	public String HA1(Model model) {
		return "HA-1";
		
	}
	
	@GetMapping("/alm1")
	public String ALM1(Model model) {
		return "ALM-1";
		
	}
	
	@GetMapping("/emphomepg")
	public String emphm(Model model) {
		return "EmpHome";
		
	}
	
	@GetMapping("/quizhomepg")
	public String quizhm(Model model) {
		return "QuizHMPg";
		
	}
	
	}

