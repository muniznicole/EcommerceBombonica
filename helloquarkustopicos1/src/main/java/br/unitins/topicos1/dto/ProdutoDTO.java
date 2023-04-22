package br.unitins.topicos1.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class ProdutoDTO {

    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório.")
    @Size(max = 100, message = "O nome do produto deve conter no máximo 100 caracteres.")
    private String nomeProduto;

    @NotBlank(message = "A descrição do produto é obrigatória.")
    private String descricaoProduto;

    @NotNull(message = "O preço do produto é obrigatório.")
    @PositiveOrZero(message = "O preço do produto deve ser maior ou igual a zero.")
    private double preco;

    @NotNull(message = "O estoque do produto é obrigatório.")
    @PositiveOrZero(message = "O estoque do produto deve ser maior ou igual a zero.")
    private Integer estoque;

    private Long idPromocao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Long getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(Long idPromocao) {
        this.idPromocao = idPromocao;
    }

}

