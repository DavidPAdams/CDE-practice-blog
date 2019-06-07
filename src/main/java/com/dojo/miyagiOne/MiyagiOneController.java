package com.dojo.miyagiOne;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiyagiOneController {
	
	@GetMapping(value="/")
	public String index()
	{
		System.out.println("!!!!!!!!!! ~Yo Ho Yo Ho~ !!!!!!!!!!");
		return "pages/index";
	}
	
	@GetMapping(value="/about")
	public String about()
	{
		return "pages/about";
	}
	
  @GetMapping(value="/contact")
  public String contact()
  {
    return "pages/contact";
  }	
}
