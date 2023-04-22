package br.unitins.topicos1.dto;

import javax.validation.constraints.NotBlank;

public class EstadoDTO {

    @NotBlank(message = "O campo nome deve ser informado!")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

