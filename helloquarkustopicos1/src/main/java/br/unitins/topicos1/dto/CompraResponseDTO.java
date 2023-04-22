package br.unitins.topicos1.dto;

import java.util.Date;
import br.unitins.topicos1.model.Compra;

public record CompraResponseDTO(
    Long id,
    Date data,
    ProdutoResponseDTO produto,
    UsuarioResponseDTO usuario
) {
    public CompraResponseDTO(Compra compra) {
        this(
            compra.getId(),
            compra.getDate(),
            new ProdutoResponseDTO(compra.getItemProduto().getProduto()),
            new UsuarioResponseDTO(compra.getUsuario())
        );
    }
}

