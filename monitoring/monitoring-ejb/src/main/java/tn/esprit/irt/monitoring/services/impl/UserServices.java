package tn.esprit.irt.monitoring.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.irt.monitoring.persistence.Provider;
import tn.esprit.irt.monitoring.persistence.User;
import tn.esprit.irt.monitoring.services.interfaces.UserServicesLocal;
import tn.esprit.irt.monitoring.services.interfaces.UserServicesRemote;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserServices() {
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

	@Override
	public List<User> findAllUsers() {
		return entityManager.createQuery("select u from User u", User.class).getResultList();
	}

	@Override
	public List<Provider> findAllProviders() {
		List<Provider> providers = new ArrayList<>();
		List<User> users = findAllUsers();
		for (User u : users) {
			if (u instanceof Provider) {
				providers.add((Provider) u);
			}
		}
		return providers;
	}

}
