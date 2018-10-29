package cl.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.base.model.User;
import cl.base.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	 
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/saveUser", method= RequestMethod.POST)
	public Boolean saveUser(@RequestBody User u){
		return userService.saveUser(u);
	}
}
