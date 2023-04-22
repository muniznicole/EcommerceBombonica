package br.unitins.topicos1.repository;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.Compra;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class CompraRepository implements PanacheRepository<Compra> {

    public List<Compra> findByData(Date data) {
        if (data == null)
            return null;
        return find("data", data).list();
    }

}
