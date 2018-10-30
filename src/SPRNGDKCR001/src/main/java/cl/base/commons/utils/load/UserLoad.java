package cl.base.commons.utils.load;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.base.repository.UserRepository;

/**
 * @author jeferson
 *
 */

@Service
public class UserLoad {
	@Autowired
	private UserRepository userRepository;
	
	public void createUser(String firstName, String lastName,String email,String username){
	
		
		
	};
}
