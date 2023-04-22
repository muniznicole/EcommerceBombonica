package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.BarraChocolate;

public class BarraChocolateResponseDTO extends ProdutoResponseDTO {

    private String tipoChocolate;
    private Double peso;
    private String ingredientes;

    public BarraChocolateResponseDTO(BarraChocolate barraChocolate) {
        super(barraChocolate);
        this.tipoChocolate = barraChocolate.getTipoChocolate().getTipoChocolate();
        this.peso = barraChocolate.getPeso();
        this.ingredientes = barraChocolate.getIngredientes();
    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
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
}

