package cl.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.base.model.User;
import cl.base.repository.UserRepository;
import cl.base.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Boolean saveUser(User user) {
		try {
			userRepository.save(user);
			return true;
		} catch (Exception e) {
			return false;	
		}
	}
}
