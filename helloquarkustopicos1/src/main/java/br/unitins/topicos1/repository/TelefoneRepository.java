package br.unitins.topicos1.repository;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.Telefone;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TelefoneRepository implements PanacheRepository<Telefone> {

    public Telefone findByUsuarioId(Long usuarioId) {
        return find("usuario.id", usuarioId).firstResult();
    }

    public void deleteByUsuarioId(Long usuarioId) {
        delete("usuario.id", usuarioId);
    }

}

