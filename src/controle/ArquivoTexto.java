/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void criaArquivo(ArrayList<String> usu){
        PrintWriter arq;
        try {
            arq = new PrintWriter("./usuarios/"+usu.get(2)+".txt");
            int n = usu.size();
            for(int i = 0; i < n; i++){
                arq.println(usu.get(i));
            }
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
    
    public ArrayList<String> openTxt(String email){
        FileReader arq;
        ArrayList<String> usu = new ArrayList();
        try {
            arq = new FileReader("./usuarios/"+email+".txt");
            BufferedReader lerArq = new BufferedReader(arq);
            int i;
            String str;
            while((str = lerArq.readLine()) != null){
                usu.add(str);
            }
            return usu;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
