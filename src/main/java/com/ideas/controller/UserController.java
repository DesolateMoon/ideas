package com.ideas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ideas.entity.User;
import com.ideas.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@GetMapping("")
	public ModelAndView showLoginPage(ModelMap model) {
		return new ModelAndView("login");
	}
	
	@GetMapping("/ideas")
	public ModelAndView showIdeasPage(ModelMap model) {
		return new ModelAndView("ideas");
	}
	
	@GetMapping("/ideas/new")
	public ModelAndView showNewPage(ModelMap model) {
		return new ModelAndView("new");
	}
	
	/* TODO: Register and Login Buttons */
	@PostMapping("")
	public ModelAndView registerUser(ModelMap model,
									 @RequestParam("regName") String name, 
									 @RequestParam("regEmail") String email, 
									 @RequestParam("regPassword") String password, 
									 @RequestParam("regPasswordConf") String passwordConf 
										) {
		
		if(userService.verifyPassword(password, passwordConf)) {
			model.put("message", "User was registered successfully");
			userService.addUser(new User(name, email, password));
		} else {
			model.put("message", password + " " + passwordConf );
		}
		return new ModelAndView("login");
	}
	
	/*@PostMapping("")
	public ModelAndView loginUser(@RequestParam("logEmail") String email, 
			 					  @RequestParam("logPassword") String password,
			 					  HttpServletRequest request
									) {
		User user = userService.verifyUser(email, password);
		if(user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			return new ModelAndView("/ideas").addObject("user", user);
		} else {
			return new ModelAndView("error");
		}
	}*/
	
	/*@GetMapping("/ideas/{id}")
	public ModelAndView viewIdea(@PathVariable("id") int id) {
		Ideas idea = userService.getIdeasById(id);
		if (user != null) {
			return new ModelAndView("/view").addObject("idea", idea);
		}
		return new ModelAndView("error");
	}
	
	@GetMapping("/ideas/{id}/edit")
	public ModelAndView editIdea(@PathVariable("id") int id) {
		Ideas idea = userService.getIdeasById(id);
		if (user != null) {
			return new ModelAndView("/view").addObject("idea", idea);
		}
		return new ModelAndView("error");
	}
	
	@PostMapping("ideas/new")
	public ModelAndView createIdea() {
		Ideas idea = userService.createId();
		if(idea != null) {
			return new ModelAndView("/ideas").addObject("idea", idea);
		}
		return new ModelAndView("error");
	}*/
}
