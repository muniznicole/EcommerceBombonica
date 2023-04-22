package br.unitins.topicos1.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ItemProdutoDTO {

    private Long id;

    @NotNull(message = "O produto é obrigatório")
    private ProdutoDTO produto;

    @NotNull(message = "A quantidade é obrigatória")
    @Positive(message = "A quantidade deve ser um número positivo")
    private Integer quantidade;

    @NotNull(message = "O preço é obrigatório")
    @Positive(message = "O preço deve ser um número positivo")
    private Double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProdutoDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoDTO produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

