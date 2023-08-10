package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hellocontroller {
	
	@RequestMapping("/hello")
	public String hello() {
		 return "demo";

	}
}
	
//	   @RequestMapping("/demos") 
//	   public List<Course> demo() {
//	      return Arrays.asList(
//	    		  new Course(1,"java","kaja"),
//	    		  new Course(2,"python","kaja")
//	    		  );
//	   }
//	
//	@RequestMapping("/welcome1")
//	public String welcome() {
//		return "welcome guys";
//	}
//    
//	
//
//}
