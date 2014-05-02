package pt.meistre.soft.i18n.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pt.meistre.soft.i18n.dto.AuthCreateUser;
import pt.meistre.soft.i18n.service.UserServiceImpl;

@RestController
@RequestMapping("/service/admin")
public class AdminRestService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminRestService.class);

	 @RequestMapping(value = "/alive", method = RequestMethod.GET)
	 public String alive() {
	  String result="I am alive";  
	  return result;
	 }
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public boolean createUser(@RequestBody AuthCreateUser userToCreate) {
		LOGGER.debug("Name:"+userToCreate.getName());
		return true;
	}
}

