package br.unitins.topicos1.dto;

import java.util.Date;
import javax.validation.constraints.NotNull;

import br.unitins.topicos1.model.Compra;

public record CompraDTO (
    @NotNull(message = "O item de produto é obrigatório.") Long itemProdutoId,
    @NotNull(message = "O usuário é obrigatório.") Long usuarioId,
    @NotNull(message = "A data da compra é obrigatória.") Date date
)
{

    public static CompraDTO toDTO(Compra compra) {
        return new CompraDTO(
                compra.getItemProduto().getId(),
                compra.getUsuario().getId(),
                compra.getDate());
    }
}


