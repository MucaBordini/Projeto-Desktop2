/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    public void criaArquivo(ArrayList<String> lista, String tipo){
        PrintWriter arq;
        int aux;
        try {
            if (tipo == "usuarios"){
                arq = new PrintWriter("./"+tipo+"/"+lista.get(2)+".txt");
                aux = 0;
            } else if (tipo == "jogo"){
                arq = new PrintWriter("./"+tipo+"/"+lista.get(0)+".txt");
                aux = 0;
            } else {
                arq = new PrintWriter("./"+tipo+"/"+lista.get(0)+"Avaliacao.txt");
                aux = 1;
            }
            int n = lista.size();
            for(int i = aux; i < n; i++){
                arq.println(lista.get(i));
            }
            arq.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }               
    } 
    
    public ArrayList<String> openTxt(String nomeArq, String tipo){
        FileReader arq;
        ArrayList<String> list = new ArrayList();
        try {
            arq = new FileReader("./"+tipo+"/"+nomeArq+".txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String str;
            while((str = lerArq.readLine()) != null){
                list.add(str);
            }
            return list;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void deleteTxt(String nomeArq, String tipo){
        File arquivo = new File("./"+tipo+"/"+nomeArq+".txt");
        if(arquivo.exists()){
            arquivo.delete();
        } else
        JOptionPane.showMessageDialog(null, "CAGOU");
    }
}
