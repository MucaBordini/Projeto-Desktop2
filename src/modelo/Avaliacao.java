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
public class Avaliacao {
    private static String jogabilidade;
    private static String graficos;
    private static String enredo;
    private static String audio;
    private static String conteudo;
    private static String comentario;
    private static String nome;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Avaliacao.nome = nome;
    }

    public static String getConteudo() {
        return conteudo;
    }

    public static void setConteudo(String conteudo) {
        Avaliacao.conteudo = conteudo;
    }

    
    public static String getJogabilidade() {
        return jogabilidade;
    }

    public static void setJogabilidade(String jogabilidade) {
        Avaliacao.jogabilidade = jogabilidade;
    }

    public static String getGraficos() {
        return graficos;
    }

    public static void setGraficos(String graficos) {
        Avaliacao.graficos = graficos;
    }

    public static String getEnredo() {
        return enredo;
    }

    public static void setEnredo(String enredo) {
        Avaliacao.enredo = enredo;
    }

    public static String getAudio() {
        return audio;
    }

    public static void setAudio(String audio) {
        Avaliacao.audio = audio;
    }

    public static String getComentario() {
        return comentario;
    }

    public static void setComentario(String comentario) {
        Avaliacao.comentario = comentario;
    }
    
}