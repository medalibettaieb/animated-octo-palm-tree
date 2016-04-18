package tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.irt.monitoring.persistence.Provider;
import tn.esprit.irt.monitoring.services.interfaces.UserServicesRemote;

public class TestFindAllProviders {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote userServicesRemote = (UserServicesRemote) context.lookup(
				"monitoring-ear/monitoring-ejb/UserServices!tn.esprit.irt.monitoring.services.interfaces.UserServicesRemote");

		List<Provider> providers = userServicesRemote.findAllProviders();
		for (Provider u : providers) {
			System.out.println(u.getName());
		}

	}

}
