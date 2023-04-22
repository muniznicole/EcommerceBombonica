package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Estado;

public class EstadoResponseDTO {

    private Long id;
    private String nome;

    public EstadoResponseDTO(Estado estado) {
        this.id = estado.getId();
        this.nome = estado.getNome();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}