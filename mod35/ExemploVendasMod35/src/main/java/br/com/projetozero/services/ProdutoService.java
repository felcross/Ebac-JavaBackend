/**
 * 
 */
package br.com.projetozero.services;

import br.com.projetozero.dao.IProdutoDAO;
import br.com.projetozero.domain.Produto;
import br.com.projetozero.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
