/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import DAO.AvaliacaoDAO;
import DAO.JogoDAO;

/**
 *
 * @author samue
 */
public class Avaliacao {
    
    private String comentario;
    private double nota;
    private Usuario usuario;
    private Jogo jogo;
    
    public Avaliacao(double nota, String comentario, Usuario usuario, Jogo jogo){
        this.nota = nota;
        this.comentario = comentario;
        this.usuario = usuario;
        this.jogo = jogo;
    }
    
    public Avaliacao(){
        
    }
    
    public Avaliacao(Usuario usuario, Jogo jogo){
        this.usuario = usuario;
        this.jogo = jogo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    

    public double getNota() {
        return nota;
    }

    public  void setNota(double nota) {
        this.nota = nota;
    }

   

    public  String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public boolean insert(){
        return AvaliacaoDAO.insert(this);
    }
    
    public boolean delete(){
        return AvaliacaoDAO.delete(this.getUsuario().getEmail(), this.getJogo().getNome());
    }
    
    public boolean update(){
        return AvaliacaoDAO.update(this);
    }
    
}