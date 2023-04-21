package br.unitins.topicos1.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.unitins.topicos1.model.Compra;
import br.unitins.topicos1.model.Endereco;

public record CompraResponseDTO(
    Long id,
    String cpf,
    String nome,
    @JsonInclude(JsonInclude.Include.NON_NULL)
    Endereco sexo
) {
    public CompraResponseDTO(Compra pf) {
        this(pf.getId(), pf.getCpf(), pf.getNome(), pf.getSexo()); 
    }


}
