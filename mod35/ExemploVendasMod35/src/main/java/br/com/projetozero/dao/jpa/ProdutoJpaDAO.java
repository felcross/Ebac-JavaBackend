/**
 * 
 */
package br.com.projetozero.dao.jpa;

import br.com.projetozero.dao.generic.jpa.GenericJpaDAO;
import br.com.projetozero.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
