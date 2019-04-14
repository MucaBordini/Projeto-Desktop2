/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author samue
 */
public class ArquivoTexto {
    
    /**
     *
     * @throws IOException
     */
    PrintWriter arq;
    ArrayList<String> lista = new ArrayList();
    Usuario u = new Usuario();
    Jogo j = new Jogo();
    int n, i, aux = 0;
    public void criaArquivo(String tipo){

        try {
            if (tipo == "usuarios"){
                arq = new PrintWriter("./"+tipo+"/"+u.getEmail()+".txt");
                lista.clear();
                lista.add(u.getNome());
                lista.add(u.getSobrenome());
                lista.add(u.getEmail());
                lista.add(u.getSenha());
                lista.add(u.getcSenha());
                lista.add(u.getGenero());
                lista.add(u.getFavorito());
            } else if (tipo == "jogo"){
                String name = j.getNome().replace(" ", "_").replace(";", "").toLowerCase();
                arq = new PrintWriter("./"+tipo+"/"+name+".txt");
                lista.clear();
                lista.add(j.getNome()+";");
                lista.add(j.getDesenvolvedora()+";");
                lista.add(j.getProdutora()+";");
                lista.add(j.getData()+";");
                lista.add(j.getGenero()+";");
            } else {
                arq = new PrintWriter("./"+tipo+"/"+lista.get(0)+"Avaliacao.txt");
                aux = 1;
            }
            
            
            n = lista.size();
            for(i = aux; i < n; i++){
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
            arq.close();
            lerArq.close();
            return list;
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado\n");
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void deleteTxt(String nomeArq){
        File arquivo = new File("./usuarios/"+nomeArq+".txt");
        File senha = new File("./login/"+nomeArq+".txt");
        if(arquivo.exists() || senha.exists()){
            arquivo.delete();
            senha.delete();
        } 
    }
    
    public void deleteTxt(String nomeArq, String tipo){
        File arquivo = new File("./"+tipo+"/"+nomeArq+".txt");
 
        if(arquivo.exists()){
            arquivo.delete();
        } else
        JOptionPane.showMessageDialog(null, "CAGOU");
    }
    
    
}
