package br.unitins.topicos1.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public record CompraDTO(

    @NotBlank(message = "O campo cpf deve ser informado.")
    @Size(max = 14, message = "O cpf deve posssuir no máximo 14 caracteres.")
    String cpf,

    Integer sexo,

    @NotBlank(message = "O campo nome deve ser informado.")
    String nome
) {
  
}
