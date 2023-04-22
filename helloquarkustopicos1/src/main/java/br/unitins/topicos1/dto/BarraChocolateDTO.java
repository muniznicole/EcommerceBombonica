package br.unitins.topicos1.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BarraChocolateDTO {

    private Long id;

    @NotNull(message = "O tipo de chocolate não pode ser nulo")
    private Long idTipoChocolate;

    @NotBlank(message = "O nome do produto não pode estar em branco")
    private String nomeProduto;

    @NotNull(message = "O preço não pode ser nulo")
    @DecimalMin(value = "0.01", message = "O preço deve ser maior que 0")
    private Double preco;

    @NotNull(message = "O estoque não pode ser nulo")
    @Min(value = 0, message = "O estoque deve ser maior ou igual a 0")
    private Integer estoque;

    @NotNull(message = "O peso não pode ser nulo")
    @DecimalMin(value = "0.01", message = "O peso deve ser maior que 0")
    
    private Double peso;
    private String ingredientes;
    private String descricaoProduto;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdTipoChocolate() {
        return idTipoChocolate;
    }
    public void setIdTipoChocolate(Long idTipoChocolate) {
        this.idTipoChocolate = idTipoChocolate;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public String getDescricaoProduto() {
        return descricaoProduto;
    }
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    


}
