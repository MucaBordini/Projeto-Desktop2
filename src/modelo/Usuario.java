/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author samue
 */
public class Usuario {
    private int uId;
    private String uNome;
    private String uSobrenome;
    private String uEmail;
    private String uSenha;
    private String uGeneroFavorito;
    private String uJogoFavorito;

    // <editor-fold defaultstate="collapsed" desc=" GETTERS & SETTERS ">
    public void setuId(int uId) {
        this.uId = uId;
    }

    public void setuNome(String uNome) {
        this.uNome = uNome;
    }

    public void setuSobrenome(String uSobrenome) {
        this.uSobrenome = uSobrenome;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public void setuSenha(String uSenha) {
        this.uSenha = uSenha;
    }

    public void setuGeneroFavorito(String uGeneroFavorito) {
        this.uGeneroFavorito = uGeneroFavorito;
    }

    public void setuJogoFavorito(String uJogoFavorito) {
        this.uJogoFavorito = uJogoFavorito;
    }

    public int getuId() {
        return uId;
    }

    public String getuNome() {
        return uNome;
    }

    public String getuSobrenome() {
        return uSobrenome;
    }

    public String getuEmail() {
        return uEmail;
    }

    public String getuSenha() {
        return uSenha;
    }

    public String getuGeneroFavorito() {
        return uGeneroFavorito;
    }

    public String getuJogoFavorito() {
        return uJogoFavorito;
    }
    
}
