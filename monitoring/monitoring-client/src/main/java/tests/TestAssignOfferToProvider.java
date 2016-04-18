package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.irt.monitoring.services.interfaces.OfferServicesRemote;

public class TestAssignOfferToProvider {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		OfferServicesRemote offerServicesRemote = (OfferServicesRemote) context.lookup(
				"monitoring-ear/monitoring-ejb/OfferServices!tn.esprit.irt.monitoring.services.interfaces.OfferServicesRemote");

		offerServicesRemote.assignOfferToProvider(1, 6, "real time");
		offerServicesRemote.assignOfferToProvider(2, 6, "data");

		offerServicesRemote.assignOfferToProvider(1, 5, "real time");

		offerServicesRemote.assignOfferToProvider(2, 4, "data");
	}

}
