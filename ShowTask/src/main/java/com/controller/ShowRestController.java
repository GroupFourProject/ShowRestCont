package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.dao.ShowService;
import com.model.Show;


@RestController
public class ShowRestController {
	
	@Autowired
	ShowService service;
	
	@GetMapping("/getshow")
	public List<Show> getAllShow(Show show)
	{
		 Show s1=service.findShow(show.getShowId());
		 if(s1!=null)
			{
				throw new FindAllException();
			}
		return service.findAllShows();
	}
	
	@GetMapping("/getshow/{id}")
	public ResponseEntity<?> getShow(@PathVariable int id) 
	
	{
		Show show=service.findShow(id);
		if(show==null)
		{
			throw new GetShowException();
		}
		service.findShow(id);
		return  ResponseEntity.ok(" Show Displayed Successfully");
	}
	@PostMapping("/addshow")
	public String addShow(@RequestBody Show show)
	{
		
		
		
		if(show.getHallID()>5 || show.getHallID()<0)
		{
			
			throw new AddShowException();
		}
		else if(show.getHallID()>0 && show.getHallID()<=5)
		{
		
			service.add(show);
		}
		
		service.add(show);
		return "Show Added Succesfully";
	}
	
	@DeleteMapping("/deleteshow/{id}")
	public ResponseEntity<?> deleteShow(@PathVariable int id)
	{
		Show show=service.findShow(id);
		if(show==null)
		{
			throw new DeleteShowException(id);
			
		}
		service.delete(id);
		
		return ResponseEntity.ok("Element deleted Successfully");
	}
	
	@PatchMapping("/editshow")
	public ResponseEntity<?> editShow(@RequestBody Show show)
	{
		 Show s1=service.findShow(show.getShowId());
		 
		if(s1==null)
		{
			throw new UpdateShowException();
		}
		
		 service.update(show);
		return ResponseEntity.ok("Show Updated Sucessfully");
	}
	
}
