package br.unitins.topicos1.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.CupomDesconto;
import br.unitins.topicos1.model.Promocao;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class PromocaoRepository implements PanacheRepository<Promocao> {

    public List<Promocao> findAllWithCupomDesconto() {
        return find("SELECT p FROM Promocao p JOIN FETCH p.cupomDesconto c", Promocao.class).list();
    }

    public List<Promocao> findAllWithoutCupomDesconto() {
        return find("SELECT p FROM Promocao p WHERE p.cupomDesconto IS NULL", Promocao.class).list();
    }

    public Promocao findByCodigoCupom(String codigoCupom) {
        if (codigoCupom == null || codigoCupom.isBlank())
            return null;
        return find("SELECT p FROM Promocao p JOIN FETCH p.cupomDesconto c WHERE c.codigo = ?1", codigoCupom)
                .firstResult();
    }

    public List<Promocao> findByDesconto(Double desconto) {
        if (desconto == null)
            return null;
        return find("desconto = ?1", desconto).list();
    }

    public List<Promocao> findByCupomDesconto(CupomDesconto cupomDesconto) {
        if (cupomDesconto == null)
            return null;
        return find("cupomDesconto", cupomDesconto).list();
    }

}

