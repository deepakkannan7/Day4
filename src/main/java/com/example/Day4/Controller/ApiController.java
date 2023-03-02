package com.example.Day4.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day4.Model.Student;
import com.example.Day4.Service.ApiServices;

@RestController
public class ApiController {

	@Autowired
	ApiServices stuService;
	@PostMapping("/add1Details")
	public Student addInfo(@RequestBody Student st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("show1Details")
	public List<Student> fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/update1Details")
	public Student updateInfo(@RequestBody Student st1)
	{
		return stuService.updateDetails(st1);
	}
    @DeleteMapping("/delete/{bid}")
    public String deleteInfo(@PathVariable("bid") int id)
    {
    	stuService.deleteDetails(id);
    	return "Deleted details";
    }
}
