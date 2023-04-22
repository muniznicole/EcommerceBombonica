package br.unitins.topicos1.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.ItemProduto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ItemProdutoRepository implements PanacheRepository<ItemProduto> {

    public List<ItemProduto> findByCompraId(Integer compraId) {
        if (compraId == null)
            return null;
        return find("compra.id", compraId).list();
    }

}

