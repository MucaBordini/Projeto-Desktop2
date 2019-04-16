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
import modelo.Avaliacao;
import modelo.Jogo;
import modelo.Usuario;

/**
 *
 * @author Aluno
 */
public class ArquivoBinario {
    
    ObjectOutputStream o;
    FileOutputStream fo;
    Jogo j = new Jogo();
    Avaliacao a = new Avaliacao();
    ArrayList<String> lista = new ArrayList();
    Usuario u = new Usuario();
    int i, aux, n;
    
    public void criaArquivoBin(String tipo){
       /* try{
            FileOutputStream fo = new FileOutputStream("./"+tipo+"/"+u.getEmail()+".dat");
            ObjectOutputStream o = new ObjectOutputStream(fo);
            lista.clear();
            lista.add(u.getNome());
            lista.add(u.getSobrenome());
            lista.add(u.getEmail());
            lista.add(u.getSenha());
            lista.add(u.getcSenha());
            lista.add(u.getGenero());
            lista.add(u.getFavorito());
            int n = lista.size();
            for(i = 0; i < n; i++){
                o.writeUTF(lista.get(i));
            }
            o.close();
        } //catch(FileNotFoundException e){
           
         catch (IOException e){
            
        }*/
       
       try {
            if (tipo == "usuarios"){
                fo = new FileOutputStream("./"+tipo+"/"+u.getEmail()+".dat");
                o = new ObjectOutputStream(fo);
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
                FileOutputStream fo = new FileOutputStream("./"+tipo+"/"+name+".dat");
                ObjectOutputStream o = new ObjectOutputStream(fo);
                lista.clear();
                lista.add(j.getNome()+";");
                lista.add(j.getDesenvolvedora()+";");
                lista.add(j.getProdutora()+";");
                lista.add(j.getData()+";");
                lista.add(j.getGenero()+";");
            } else {
                String name = j.getNome().replace(" ", "_").replace(";", "").toLowerCase();
                FileOutputStream fo = new FileOutputStream("./"+tipo+"/"+name+".dat");
                ObjectOutputStream o = new ObjectOutputStream(fo);
                lista.clear();
                lista.add(j.getNome()+";");
                lista.add(a.getEnredo()+";");
                lista.add(a.getGraficos()+";");
                lista.add(a.getJogabilidade()+";");
                lista.add(a.getAudio()+";");
                lista.add(a.getConteudo()+";");
                lista.add(a.getComentario()+";");
                lista.add(u.getEmail()+";");
            }
            
            
            n = lista.size();
            for(i = 0; i < n; i++){
                o.writeObject(lista.get(i));
            }
            o.close();
        } catch (IOException ex) {
            Logger.getLogger(ArquivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<String> lerArquivoBin(String nomeBin, String tipo){
        try{
        FileInputStream fo = new FileInputStream("./"+tipo+"/"+nomeBin+".dat");
        ObjectInputStream o = new ObjectInputStream(fo);
        String str;
            while((o.readObject()) != null){
                lista.add(str);
            }
        o.close();
        }  catch (IOException e){
            
        }  
        
        return lista;
    }
}
