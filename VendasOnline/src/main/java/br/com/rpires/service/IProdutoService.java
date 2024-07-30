/**
 *
 */
package br.com.rpires.service;

import br.com.rpires.domain.Produto;
import br.com.rpires.services.generic.IGenericService;

import java.util.List;

/**
 * @author rodrigo.pires
 *
 */
public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}