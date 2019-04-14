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
    private static String email;
    private static String nome;
    private static String sobrenome;
    private static String senha;
    private static String cSenha;
    private static String genero;
    private static String favorito;

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Usuario.senha = senha;
    }

    public static String getcSenha() {
        return cSenha;
    }

    public static void setcSenha(String cSenha) {
        Usuario.cSenha = cSenha;
    }
    

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Usuario.nome = nome;
    }

    public static String getSobrenome() {
        return sobrenome;
    }

    public static void setSobrenome(String sobrenome) {
        Usuario.sobrenome = sobrenome;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Usuario.genero = genero;
    }

    public static String getFavorito() {
        return favorito;
    }

    public static void setFavorito(String favorito) {
        Usuario.favorito = favorito;
    }
}