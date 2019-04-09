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
    private Usuario usuario;
    private Jogo jogo;
    private int aJogabilidade;
    private int aGraficos;

    public Usuario getUsuario() {
        return usuario;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public int getaJogabilidade() {
        return aJogabilidade;
    }

    public int getaGraficos() {
        return aGraficos;
    }

    public int getaEnredo() {
        return aEnredo;
    }

    public int getaAudio() {
        return aAudio;
    }

    public String getaComentario() {
        return aComentario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void setaJogabilidade(int aJogabilidade) {
        this.aJogabilidade = aJogabilidade;
    }

    public void setaGraficos(int aGraficos) {
        this.aGraficos = aGraficos;
    }

    public void setaEnredo(int aEnredo) {
        this.aEnredo = aEnredo;
    }

    public void setaAudio(int aAudio) {
        this.aAudio = aAudio;
    }

    public void setaComentario(String aComentario) {
        this.aComentario = aComentario;
    }
    private int aEnredo;
    private int aAudio;
    private String aComentario;
}
