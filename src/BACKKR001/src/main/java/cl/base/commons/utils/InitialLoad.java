package cl.base.commons.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cl.base.commons.utils.load.UserLoad;
import cl.base.repository.UserRepository;

@Component
public class InitialLoad {
	@Autowired
	private UserLoad userLoad;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostConstruct  
	public void init(){ 
		
		if (userRepository.findAll().size()==0) {
			userLoad.createUser("Jeferson", "Agudelo", "jeferson.agudelo@karibu.cl", "jeferagudeloc");
			userLoad.createUser("Aiskelth", "Figueroa", "agudelocontrerasj@gmail.com", "aiskelthf");
		}
	}
	
}
