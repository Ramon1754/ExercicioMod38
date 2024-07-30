/**
 *
 */
package br.com.rpires.service;

import br.com.rpires.dao.IProdutoDAO;
import br.com.rpires.domain.Produto;
import br.com.rpires.services.generic.GenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * @author rodrigo.pires
 *
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    private IProdutoDAO produtoDao;

    @Inject
    public ProdutoService(IProdutoDAO produtoDao) {
        super(produtoDao);
        this.produtoDao = produtoDao;
    }

    @Override
    public List<Produto> filtrarProdutos(String query) {
        return produtoDao.filtrarProdutos(query);
    }

}