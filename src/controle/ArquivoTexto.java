/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Avaliacao;
import modelo.Jogo;

/**
 *
 * @author samue
 */
public class ArquivoTexto {
    public Jogo jogo = new Jogo();
    /**
     *
     * @throws IOException
     */
    public void criaArquivo(String nome, String sobrenome, String email, String value, String favorito){
        PrintWriter arq;
        try {
            arq = new PrintWriter("./usuarios/"+email+".txt");
            arq.println(nome);
            arq.println(sobrenome);
            arq.println(favorito);
            arq.println(value);
            arq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }               
    } 
    
    public void criaArquivo(String jNome, String jDesenvolvedora, String jProdutora, String jData, String jGenero, String enredo, String grafico, String jogabilidade, String audio, String conteudo, String comentario){
        PrintWriter arq;
        try {
            
            arq = new PrintWriter("./jogo/"+jNome+".txt");
            arq.println(jNome);
            arq.println(jDesenvolvedora);
            arq.println(jProdutora);
            arq.println(jData);
            arq.println(jGenero);
            arq.println(enredo);
            arq.println(grafico);
            arq.println(jogabilidade);
            arq.println(audio);
            arq.println(conteudo);
            arq.println(comentario);
            arq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }               
    } 
    
}
