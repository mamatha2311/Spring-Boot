package com.example.myweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.myweb.alien.AlienRepo;
import com.example.myweb.alien.AlienRepo2;
import com.example.myweb.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@Autowired
	AlienRepo2 repo2;
	
	@RequestMapping("/")
	public String home() 
	{
		
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) 
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) 
	{
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findByLang("Java"));
		System.out.println(repo.findByAidGreaterThan(102));
		System.out.println(repo.findByLangSorted("Java"));
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/getAliens")
	@ResponseBody
	public String getAliens() 
	{
		return repo.findAll().toString();
	}
	
	@RequestMapping("/getAlienById/{aid}")
	@ResponseBody
	public String getAlienById(@PathVariable("aid") int aid) 
	{
		return repo.findById(aid).toString();
	}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> allAliens() 
	{
		return repo2.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> alien(@PathVariable("aid") int aid) 
	{
		return repo2.findById(aid);
	}

	@RequestMapping(path = "/aliensxml",produces={"application/xml"})
	@ResponseBody
	public List<Alien> allAliensXml() 
	{
		return repo2.findAll();
	}
}
