package pt.meistre.soft.i18n.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pt.meistre.soft.i18n.dao.UserJPARepository;
import pt.meistre.soft.i18n.model.User;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

	@Resource
	private UserJPARepository userRepository;

	@Transactional
	public User create(User created) {
		LOGGER.debug("Creating a new person with information: " + created);

		return userRepository.save(created);
	}

	@Transactional
	public User delete(String userId){
		LOGGER.debug("Deleting person with id: " + userId);

		User deleted = userRepository.findOne(userId);

		userRepository.delete(deleted);
		return deleted;
	}

	@Transactional
	public List<User> findAll() {
		LOGGER.debug("Finding all persons");
		return userRepository.findAll();
	}

	@Transactional
	public User findById(String id) {
		LOGGER.debug("Finding person by id: " + id);
		return userRepository.findOne(id);
	}

	@Transactional
	public User update(User updated){
		LOGGER.debug("Updating person with information: " + updated);

		User user = userRepository.findOne(updated.getId());

		BeanUtils.copyProperties(updated, user);

		return user;
	}

}

