package br.unitins.topicos1.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UsuarioDTO {

    private Long id;

    @NotEmpty(message = "O nome não pode ser vazio")
    @Size(min = 5, max = 100, message = "O nome deve ter entre 5 e 100 caracteres")
    private String nome;

    @NotEmpty(message = "O e-mail não pode ser vazio")
    @Email(message = "E-mail inválido")
    private String email;

    @NotEmpty(message = "A senha não pode ser vazia")
    @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String senha;

    @NotEmpty(message = "O CPF não pode ser vazio")
    private String cpf;

    private Long idEndereco;
    private Long idTelefone;
    private Long idListaDesejo;

    public UsuarioDTO(Long id, String nome, String email, String senha, String cpf, Long idEndereco, Long idTelefone,
            Long idListaDesejo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.idEndereco = idEndereco;
        this.idTelefone = idTelefone;
        this.idListaDesejo = idListaDesejo;
    }

    public UsuarioDTO() {
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

    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Long getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(Long idTelefone) {
        this.idTelefone = idTelefone;
    }

    public Long getIdListaDesejo() {
        return idListaDesejo;
    }

    public void setIdListaDesejo(Long idListaDesejo) {
        this.idListaDesejo = idListaDesejo;
    }
}
