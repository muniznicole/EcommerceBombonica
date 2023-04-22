package br.unitins.topicos1.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.BarraChocolate;
import br.unitins.topicos1.model.TipoChocolate;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class BarraChocolateRepository implements PanacheRepository<BarraChocolate> {

    public List<BarraChocolate> findByTipoChocolate(TipoChocolate tipoChocolate) {
        if (tipoChocolate == null)
            return null;
        return find("tipoChocolate", tipoChocolate).list();
    }
}

