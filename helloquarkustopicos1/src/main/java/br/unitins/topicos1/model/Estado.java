package br.unitins.topicos1.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Estado extends DefaultEntity {

    @Column(nullable = false, length = 60)
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
