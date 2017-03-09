/**
 * 
 */
package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author euro
 *
 */
@RestController
public class GraphController {
	

	@RequestMapping(value="/getGraph",method=RequestMethod.GET)
	public @ResponseBody String getAllNodes(){
		return "your graph";
	}

}
