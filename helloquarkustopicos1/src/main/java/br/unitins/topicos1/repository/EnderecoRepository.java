package br.unitins.topicos1.repository;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.Endereco;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class EnderecoRepository implements PanacheRepository<Endereco> {

    public Endereco findByUsuarioId(Long usuarioId) {
        return find("usuario.id", usuarioId).firstResult();
    }

    public void deleteByUsuarioId(Long usuarioId) {
        delete("usuario.id", usuarioId);
    }

}

