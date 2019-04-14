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
public class Jogo {
    private static String nome;
    private static String desenvolvedora;
    private static String produtora;
    private static String genero;
    private static String data;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Jogo.nome = nome;
    }

    public static String getDesenvolvedora() {
        return desenvolvedora;
    }

    public static void setDesenvolvedora(String desenvolvedora) {
        Jogo.desenvolvedora = desenvolvedora;
    }

    public static String getProdutora() {
        return produtora;
    }

    public static void setProdutora(String produtora) {
        Jogo.produtora = produtora;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Jogo.genero = genero;
    }

    public static String getData() {
        return data;
    }

    public static void setData(String data) {
        Jogo.data = data;
    }
    
    
    
}
