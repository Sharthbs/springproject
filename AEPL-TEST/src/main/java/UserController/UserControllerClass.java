package UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import UserRegestrationDto.Aepl_user_registration;
import UserRegistrationDao.Aepl_user_registrationDao;

@Controller
public class UserControllerClass {

	@Autowired
	 Aepl_user_registrationDao  userDao;
	
	
	
    @RequestMapping("/create")
    @ResponseBody
	public String insert(@ModelAttribute Aepl_user_registration dto) {
		userDao.insert(dto);
		return "data inserted succesfully"; 
	}
}
