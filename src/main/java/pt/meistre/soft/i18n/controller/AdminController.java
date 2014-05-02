package pt.meistre.soft.i18n.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pt.meistre.soft.i18n.dto.AuthCreateUser;
import pt.meistre.soft.i18n.model.User;
import pt.meistre.soft.i18n.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private UserService userService;
	
	public boolean createUser(AuthCreateUser user){
		
		User toAdd = new User();
		toAdd.setName(user.getName());
		toAdd.setPassword(user.getPassword());
		toAdd.setUsername(user.getUserName());

		userService.create(toAdd);
		
		return true;
		
	}
}
