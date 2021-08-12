package com.Rss.RssParsing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rss.RssParsing.Service.rssService;


import Models.Feed;



@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class rssController {
	
	@Autowired
	rssService service; 
	
	@GetMapping("/test")
	public ResponseEntity<String> test(String test) { 
		return ResponseEntity.ok().body(test); 
	}
	
	@PostMapping("/parse")
	public ResponseEntity<Feed> readFeed(@RequestBody String url) { 
		Feed feed = service.readFeed(url); 
		return ResponseEntity.ok().body(feed); 
		
	}
	

}

