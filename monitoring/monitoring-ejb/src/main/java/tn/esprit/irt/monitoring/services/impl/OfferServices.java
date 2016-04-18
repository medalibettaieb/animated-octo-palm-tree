package tn.esprit.irt.monitoring.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.irt.monitoring.persistence.Offer;
import tn.esprit.irt.monitoring.persistence.Provider;
import tn.esprit.irt.monitoring.persistence.SlaLigne;
import tn.esprit.irt.monitoring.services.interfaces.OfferServicesLocal;
import tn.esprit.irt.monitoring.services.interfaces.OfferServicesRemote;

/**
 * Session Bean implementation class OfferServices
 */
@Stateless
public class OfferServices implements OfferServicesRemote, OfferServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public OfferServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addOffer(Offer offer) {
		entityManager.persist(offer);

	}

	@Override
	public void assignOfferToProvider(Integer idOffer, Integer idProvider, String slaType) {
		Provider provider = entityManager.find(Provider.class, idProvider);
		Offer offer = entityManager.find(Offer.class, idOffer);

		SlaLigne slaLigne = new SlaLigne(slaType, offer, provider);

		entityManager.persist(slaLigne);

	}

	@Override
	public List<SlaLigne> findAllOffersByProviderId(Integer idProvider) {
		return entityManager.createQuery("select s from SlaLigne s where s.provider.id=:param", SlaLigne.class)
				.setParameter("param", idProvider).getResultList();
	}

}
