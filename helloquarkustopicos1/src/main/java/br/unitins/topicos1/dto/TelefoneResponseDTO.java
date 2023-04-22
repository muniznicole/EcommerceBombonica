package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Telefone;
import br.unitins.topicos1.model.Telefone.TipoTelefone;

public class TelefoneResponseDTO {

    private Long id;
    private String codigoArea;
    private Integer numero;
    private TipoTelefone tipo;

    public TelefoneResponseDTO() {}

    public TelefoneResponseDTO(Telefone telefone) {
        this.id = telefone.getId();
        this.codigoArea = telefone.getCodigoArea();
        this.numero = telefone.getNumero();
        this.tipo = telefone.getTipo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
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

