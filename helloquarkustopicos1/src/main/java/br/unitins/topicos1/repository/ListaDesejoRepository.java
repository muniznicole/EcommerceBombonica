package br.unitins.topicos1.repository;

import javax.enterprise.context.ApplicationScoped;

import br.unitins.topicos1.model.ListaDesejo;
import br.unitins.topicos1.model.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ListaDesejoRepository implements PanacheRepository<ListaDesejo> {

    public ListaDesejo findByUsuario(Usuario usuario) {
        return find("usuario", usuario).firstResult();
    }
}
