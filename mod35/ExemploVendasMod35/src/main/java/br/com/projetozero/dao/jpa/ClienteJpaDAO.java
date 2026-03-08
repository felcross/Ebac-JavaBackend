
package br.com.projetozero.dao.jpa;

import br.com.projetozero.dao.generic.jpa.GenericJpaDAO;
import br.com.projetozero.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
