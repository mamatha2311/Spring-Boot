package com.example.myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myweb.alien.AlienRepo2;
import com.example.myweb.model.Alien;

@RestController
public class AlienController2 {
	
	
	@Autowired
	AlienRepo2 repo2;
	
	@PostMapping(path = "/addAlien",consumes={"application/json"})
	public Alien addAlien(@RequestBody Alien alien) //@RequestBody to accept raw data or json from postman instead of just form
	{
		repo2.save(alien);
		return alien;
	}
	
	@GetMapping("/aliens2")
	public List<Alien> allAliens() 
	{
		return repo2.findAll();
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable("aid") int aid) 
	{
		Alien a = repo2.getById(aid);
		repo2.delete(a);
		return "deleted";
	}
	
	@PutMapping(path = "/alien",consumes={"application/json"})
	public Alien saveOrUpdateAlien(@RequestBody Alien alien)
	{
		repo2.save(alien);
		return alien;
	}
}
