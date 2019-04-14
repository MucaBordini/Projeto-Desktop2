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
import modelo.Usuario;

/**
 *
 * @author julio
 */
public class TestLogin {
    Usuario u = new Usuario();
    public boolean TestLogin() throws FileNotFoundException, IOException{
	try{
            File arq = new File("./login/"+u.getEmail()+".txt");
            BufferedReader pass = new BufferedReader(new FileReader(arq));
            String linha =  pass.readLine();
            if(!arq.exists() || !linha.equals(u.getSenha())){
                //JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos 1!"+linha);
                return false;
            }
            pass.close();
            return true;
        } catch(Exception ex){
            return false;
        }
        
        
        
        /*if(! linha.equals(senha)){
            JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos 2!"+linha);
        }*/
       
        
    }
}
