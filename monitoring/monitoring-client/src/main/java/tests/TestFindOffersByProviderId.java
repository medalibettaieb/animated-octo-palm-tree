package tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.irt.monitoring.persistence.SlaLigne;
import tn.esprit.irt.monitoring.services.interfaces.OfferServicesRemote;

public class TestFindOffersByProviderId {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		OfferServicesRemote offerServicesRemote = (OfferServicesRemote) context.lookup(
				"monitoring-ear/monitoring-ejb/OfferServices!tn.esprit.irt.monitoring.services.interfaces.OfferServicesRemote");

		List<SlaLigne> lignes = offerServicesRemote.findAllOffersByProviderId(6);

		for (SlaLigne s : lignes) {
			String newLigne = System.getProperty("line.separator");
			System.out.println("the offer is : " + s.getOffer().getName() + newLigne + " type: " + s.getTypeOfSla());
		}
	}

}
