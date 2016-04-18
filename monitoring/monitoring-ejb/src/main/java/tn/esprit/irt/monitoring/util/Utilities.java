package tn.esprit.irt.monitoring.util;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.irt.monitoring.persistence.Client;
import tn.esprit.irt.monitoring.persistence.Offer;
import tn.esprit.irt.monitoring.persistence.Provider;
import tn.esprit.irt.monitoring.services.interfaces.OfferServicesLocal;
import tn.esprit.irt.monitoring.services.interfaces.UserServicesLocal;

/**
 * Session Bean implementation class Utilities
 */
@Singleton
@LocalBean
@Startup
public class Utilities {
	@EJB
	private UserServicesLocal userServicesLocal;
	@EJB
	private OfferServicesLocal offerServicesLocal;

	/**
	 * Default constructor.
	 */
	public Utilities() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void initDb() {
		Client client = new Client("ahmed", "gabes");
		Client client2 = new Client("saiida", "kairouan");
		Client client3 = new Client("nabil", "tunis");

		Provider provider = new Provider("orange", "orange");
		Provider provider2 = new Provider("tt", "blue");
		Provider provider3 = new Provider("ooredoo", "rouge");

		Offer offer = new Offer("voip");
		Offer offer2 = new Offer("mail");

		userServicesLocal.addUser(client);
		userServicesLocal.addUser(client2);
		userServicesLocal.addUser(client3);

		userServicesLocal.addUser(provider);
		userServicesLocal.addUser(provider2);
		userServicesLocal.addUser(provider3);

		offerServicesLocal.addOffer(offer);
		offerServicesLocal.addOffer(offer2);
	}
}
