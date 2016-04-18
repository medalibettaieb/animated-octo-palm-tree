package tn.esprit.irt.monitoring.services.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.irt.monitoring.persistence.Offer;
import tn.esprit.irt.monitoring.persistence.SlaLigne;

@Local
public interface OfferServicesLocal {
	void addOffer(Offer offer);

	void assignOfferToProvider(Integer idOffer, Integer idProvider, String slaType);

	List<SlaLigne> findAllOffersByProviderId(Integer idProvider);

}
