package br.unitins.topicos1.repository;

import br.unitins.topicos1.model.Usuario;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository implements PanacheRepository<Usuario> {
    
    //Busca um usuário através do CPF
    public Usuario findByCpf(String cpf) {
        return find("cpf", cpf).firstResult();
    }

}

