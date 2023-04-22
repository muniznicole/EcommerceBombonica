package br.unitins.topicos1.dto;

import java.util.HashMap;
import java.util.Map;

import br.unitins.topicos1.model.Endereco;

public class EnderecoResponseDTO {

    private Long id;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private Map<String, Object> estado;
    private Map<String, Object> municipio;

    public EnderecoResponseDTO(Endereco endereco){
        this.id = endereco.getId();
        this.cep = endereco.getCep();
        this.logradouro = endereco.getLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.estado = new HashMap<String, Object>();
        this.estado.put("estado", endereco.getEstado());
        this.municipio = new HashMap<String, Object>();
        this.municipio.put("municipio", endereco.getMunicipio());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Map<String, Object> getEstado() {
        return estado;
    }

    public void setEstado(Map<String, Object> estado) {
        this.estado = estado;
    }

    public Map<String, Object> getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Map<String, Object> municipio) {
        this.municipio = municipio;
    }

}
   

