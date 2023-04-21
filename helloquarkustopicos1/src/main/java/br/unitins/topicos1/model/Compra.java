package br.unitins.topicos1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compra extends DefaultEntity {

    @ManyToOne
    @JoinColumn(name = "id_itemProduto")
    private ItemProduto itemProduto;

    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;

    public ItemProduto getItemProduto() {
        return itemProduto;
    }

    public void setItemProduto(ItemProduto itemProduto) {
        this.itemProduto = itemProduto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
