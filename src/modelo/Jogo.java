/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import DAO.JogoDAO;
/**
 *
 * @author samue
 */
public final class Jogo extends JogoDAO {
    private static String nome;
    private static String desenvolvedora;
    private static String genero;
    
    public Jogo(String nome, String desenvolvedora, String genero){
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
        this.genero = genero;
    }
    
    public Jogo(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Jogo.nome = nome;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        Jogo.desenvolvedora = desenvolvedora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        Jogo.genero = genero;
    }

    public boolean insert(){
        return JogoDAO.insert(this);
    }
    
    public boolean update() {
        return JogoDAO.update(this);
    }

    
    
}
