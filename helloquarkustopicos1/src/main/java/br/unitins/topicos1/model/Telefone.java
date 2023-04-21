package br.unitins.topicos1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Telefone extends DefaultEntity {

    public enum TipoTelefone {
        CELULAR, WHATSAPP
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10)
    private int codigoArea;
    private Integer numero;
    private TipoTelefone tipo;

    public Telefone(int codigoArea, Integer numero, TipoTelefone tipo) {
        this.codigoArea = codigoArea;
        this.numero = numero;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCodigoArea() {
        return codigoArea;
    }
    
    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }
    
    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

}
