package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Viewers;
import com.example.demo.repository.ViewersRepo;

@RestController
@RequestMapping("/viewer")
public class ViewersController {
	
	@Autowired
	private ViewersRepo viewersrepo;
	
	@PostMapping("/addviewer")
	public ResponseEntity<?> addviewers(@RequestBody Viewers viewers) {
		Viewers save=this.viewersrepo.save(viewers);
		return ResponseEntity.ok(save);
	}
	
	@GetMapping("/getviewer")
	public ResponseEntity<?> getViewer(){
		return ResponseEntity.ok(this.viewersrepo.findAll());
	}

}
