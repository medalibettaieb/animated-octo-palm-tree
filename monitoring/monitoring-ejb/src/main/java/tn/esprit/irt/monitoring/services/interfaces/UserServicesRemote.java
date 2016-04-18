package tn.esprit.irt.monitoring.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.irt.monitoring.persistence.Provider;
import tn.esprit.irt.monitoring.persistence.User;

@Remote
public interface UserServicesRemote {
	void addUser(User user);

	List<User> findAllUsers();

	List<Provider> findAllProviders();
}
