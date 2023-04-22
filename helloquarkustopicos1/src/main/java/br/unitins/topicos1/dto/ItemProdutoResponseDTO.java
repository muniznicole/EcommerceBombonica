package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.ItemProduto;

public class ItemProdutoResponseDTO {

    private Long id;
    private Integer quantidade;
    private double preco;
    private ProdutoResponseDTO produto;

    public ItemProdutoResponseDTO(ItemProduto itemProduto) {
        this.id = itemProduto.getId();
        this.quantidade = itemProduto.getQuantidade();
        this.preco = itemProduto.getPreco();
        this.produto = new ProdutoResponseDTO(itemProduto.getProduto());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ProdutoResponseDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoResponseDTO produto) {
        this.produto = produto;
    }

}
