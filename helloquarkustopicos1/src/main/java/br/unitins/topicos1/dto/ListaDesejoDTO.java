package br.unitins.topicos1.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

public class ListaDesejoDTO {

    private Long id;

    @NotNull(message = "O campo usuário é obrigatório")
    private UsuarioDTO usuario;

    @NotNull(message = "O campo itemProduto é obrigatório")
    private ItemProdutoDTO itemProduto;

    @PositiveOrZero(message = "O valor total deve ser maior ou igual a zero")
    private Double valorTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public ItemProdutoDTO getItemProduto() {
        return itemProduto;
    }

    public void setItemProduto(ItemProdutoDTO itemProduto) {
        this.itemProduto = itemProduto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

