package UserRegistrationDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import UserRegestrationDto.Aepl_user_registration;

@Component
public class Aepl_user_registrationDao {

	

	EntityManager manager=Persistence.createEntityManagerFactory("dev").createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	public void insert(Aepl_user_registration dto)
	{
		transaction.begin();
	   manager.persist(dto);
	   transaction.commit();
	
	}
}
