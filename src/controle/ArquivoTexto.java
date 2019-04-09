/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samue
 */
public class ArquivoTexto {
    
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
            
            /*
            arq.println(textEmail.getText());
            arq.println(textSenha.getPassword());
            arq.println(textCSenha.getPassword());
            */

            arq.println(favorito);
            arq.println(value);
            arq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }               
    } 
}
