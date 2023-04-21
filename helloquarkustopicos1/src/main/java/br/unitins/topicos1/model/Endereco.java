package br.unitins.topicos1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Endereco extends DefaultEntity {

    @OneToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;
    
    @OneToOne
    @JoinColumn(name = "id_municipio")
    private Municipio municipio;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, length = 100)
    private Boolean principal;
    private String logradouro;
    private String bairro;
    private Integer numero;
    private String complemento;
    private String cep;
    
    public Estado getEstado() {
        return estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Municipio getMunicipio() {
        return municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Boolean getPrincipal() {
        return principal;
    }
    
    public void setPrincipal(Boolean principal) {
        this.principal = principal;
    }
    
    public String getLogradouro() {
        return logradouro;
    }
    
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    
    public String getBairro() {
        return bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
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
    
    public String getCep() {
        return cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

}
