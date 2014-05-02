package pt.meistre.soft.i18n.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import pt.meistre.soft.i18n.model.User;

public class UserServiceTest extends AbstractServiceTestClass{
	
	@Autowired
	UserService userService;
	
	@Test
	public void createUser() throws Exception{
		User testUser= new User();
		testUser.setName("John Doe");
		testUser.setUsername("username");
		testUser.setPassword("password");
		User returned=userService.create(testUser);
		assertTrue("An User with Id should be returned", returned.getId()!=null);
	}
	
	@Test(expected=Exception.class)
	public void createUserWithoutPasswordFail() throws Exception{
		User testUser= new User();
		testUser.setName("John Doe");
		testUser.setUsername("username");
		userService.create(testUser);
	}
	
	@Test(expected=Exception.class)
	public void createUserWithoutUsernameFail() throws Exception{
		User testUser= new User();
		testUser.setName("John Doe");
		testUser.setPassword("password");
		userService.create(testUser);
	}
	
	@Test
	public void createUserAndGet() throws Exception{
		User testUser= new User();
		testUser.setName("John Doe");
		testUser.setUsername("username");
		testUser.setPassword("password");
		User returned=userService.create(testUser);
		
		User found = userService.findById(returned.getId());
		assertEquals("Names should be equal", returned.getName(),found.getName());
		
	}
	
	@Test
	public void createUsersAndFindAll() throws Exception{
		User testUser= new User();
		testUser.setName("John Doe");
		testUser.setUsername("username");
		testUser.setPassword("password");
		userService.create(testUser);
		
		User testUser2= new User();
		testUser2.setName("John2 Doe2");
		testUser2.setUsername("username2");
		testUser2.setPassword("password2");
		userService.create(testUser2);
		
		List<User> users=userService.findAll();
		assertEquals("Should return two users", 2,users.size());
		
	}

	@Test
	public void createUserUpdateAndGetUpdated() throws Exception{
		User testUser= new User();
		testUser.setName("John Doe");
		testUser.setUsername("username");
		testUser.setPassword("password");
		User returned=userService.create(testUser);
		
		returned.setName("updatedName");
		
		userService.update(returned);
		User found = userService.findById(returned.getId());
		assertEquals("Ids should be equal", returned.getId(),found.getId());
		assertEquals("Name should be updated", "updatedName",found.getName());
	}
	
}
