package tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.irt.monitoring.persistence.Client;
import tn.esprit.irt.monitoring.services.interfaces.UserServicesRemote;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		UserServicesRemote remote = (UserServicesRemote) context.lookup(
				"monitoring-ear/monitoring-ejb/UserServices!tn.esprit.irt.monitoring.services.interfaces.UserServicesRemote");

		Client client = new Client();
		client.setId(1);
		client.setAddress("tunis");

		remote.addUser(client);

	}

}
