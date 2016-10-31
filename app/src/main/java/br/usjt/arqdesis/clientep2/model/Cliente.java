package br.usjt.arqdesis.clientep2.model;

/**
 * Created by Anderson on 30/09/2016.
 */
public class Cliente {
    private int id;
    private String nome, fone, email;

    public Cliente() {}

    public Cliente(int id, String nome, String fone, String email) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto(){
        String foto = email.replace('@', '_');
        return foto.replace('.', '_');
    }
}
