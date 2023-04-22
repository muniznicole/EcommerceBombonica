package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.ListaDesejo;

public record ListaDesejoResponseDTO(
    Long id,
    UsuarioDTO usuario,
    ItemProdutoDTO itemProduto,
    Double valorTotal
){

    public ListaDesejoResponseDTO(ListaDesejo listaDesejo) {
        this (
            listaDesejo.getId(),
            new UsuarioDTO(),
            new ItemProdutoDTO(),
            listaDesejo.getValorTotal()
        );
    }

}
