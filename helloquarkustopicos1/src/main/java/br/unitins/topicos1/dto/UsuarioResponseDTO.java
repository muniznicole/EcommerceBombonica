package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Usuario;

public class UsuarioResponseDTO {

    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private TelefoneResponseDTO telefone;
    private EnderecoResponseDTO endereco;
    private ListaDesejoResponseDTO listaDesejo;

    public UsuarioResponseDTO(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.cpf = usuario.getCpf();
        this.telefone = new TelefoneResponseDTO(usuario.getTelefone());
        this.endereco = new EnderecoResponseDTO(usuario.getEndereco());
        this.listaDesejo = new ListaDesejoResponseDTO(usuario.getListaDesejo());
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TelefoneResponseDTO getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneResponseDTO telefone) {
        this.telefone = telefone;
    }

    public EnderecoResponseDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponseDTO endereco) {
        this.endereco = endereco;
    }

    public ListaDesejoResponseDTO getListaDesejo() {
        return listaDesejo;
    }

    public void setListaDesejo(ListaDesejoResponseDTO listaDesejo) {
        this.listaDesejo = listaDesejo;
    }
}
