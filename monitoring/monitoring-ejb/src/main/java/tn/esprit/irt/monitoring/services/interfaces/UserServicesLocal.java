package tn.esprit.irt.monitoring.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.irt.monitoring.persistence.Provider;
import tn.esprit.irt.monitoring.persistence.User;

@Local
public interface UserServicesLocal {
	void addUser(User user);

	List<User> findAllUsers();

	List<Provider> findAllProviders();
}
