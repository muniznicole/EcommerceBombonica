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
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends DefaultEntity {

    @OneToOne
    @JoinColumn(name = "id_listaDesejo")
    private ListaDesejo listaDesejo;

    @OneToOne
    @JoinColumn(name = "id_telefone")
    private Telefone telefone;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nome;
    private String email;
    private String senha; //pode ter letra e numero
    @Pattern(regexp = "\\d{3}.\\d{3}.\\d{3}-\\d{2}", message = "CPF inválido")
    private String cpf;

    public ListaDesejo getListaDesejo() {
        return listaDesejo;
    }

    public void setListaDesejo(ListaDesejo listaDesejo) {
        this.listaDesejo = listaDesejo;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
