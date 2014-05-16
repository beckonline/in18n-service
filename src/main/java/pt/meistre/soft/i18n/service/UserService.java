package pt.meistre.soft.i18n.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pt.meistre.soft.i18n.model.User;

public interface UserService {
	

	public User create(User created);

	public User delete(String userId);

	public List<User> findAll();

	public User findById(String id);

	public User update(User updated);
}
