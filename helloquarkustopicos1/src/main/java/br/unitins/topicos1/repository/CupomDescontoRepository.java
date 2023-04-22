package br.unitins.topicos1.repository;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.CupomDesconto;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CupomDescontoRepository implements PanacheRepository<CupomDesconto> {

    public CupomDesconto findByCodigo(String codigo) {
        return find("codigo", codigo).firstResult();
    }

    public Double findDescontoByCodigo(String codigo) {
        CupomDesconto cupom = find("codigo", codigo).firstResult();
        if (cupom == null) {
            return null;
        }
        return cupom.getValorDesconto();
    }
    
}

