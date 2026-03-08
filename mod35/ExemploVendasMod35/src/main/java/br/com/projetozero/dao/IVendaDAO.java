/**
 * 
 */
package br.com.projetozero.dao;

import br.com.projetozero.dao.generic.IGenericDAO;
import br.com.projetozero.domain.Venda;
import br.com.projetozero.exceptions.DAOException;
import br.com.projetozero.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
