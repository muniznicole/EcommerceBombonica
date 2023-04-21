package br.unitins.topicos1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BarraChocolate extends DefaultEntity {

    @Column(length = 100)
    private TipoChocolate tipoChocolate;
    private double peso;
    @Column(length = 200)
    private String ingredientes;
    
    public TipoChocolate getTipoChocolate() {
        return tipoChocolate;
    }
    public void setTipoChocolate(TipoChocolate tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
