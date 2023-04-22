package br.unitins.topicos1.dto;

import javax.validation.constraints.NotNull;

import br.unitins.topicos1.model.Telefone;
import br.unitins.topicos1.model.Telefone.TipoTelefone;

public class TelefoneDTO {

    private Long id;

    @NotNull(message = "O campo 'código de área' não pode ser vazio")
    private String codigoArea;

    @NotNull(message = "O campo 'número' não pode ser vazio")
    private Integer numero;

    @NotNull(message = "O campo 'tipo' não pode ser vazio")
    private TipoTelefone tipo;

    public TelefoneDTO() {}

    public TelefoneDTO(Telefone telefone) {
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

