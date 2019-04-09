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

/**
 *
 * @author julio
 */
public class TestLogin {
    
    public boolean TestLogin(String email, String senha) throws FileNotFoundException, IOException{
	try{
            File arq = new File("./login/"+email+".txt");
            BufferedReader pass = new BufferedReader(new FileReader(arq));
            String linha =  pass.readLine();
            if(!arq.exists() || !linha.equals(senha)){
                //JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos 1!"+linha);
                return false;
            }
            return true;
        } catch(Exception ex){
            return false;
        }
        
        
        
        /*if(! linha.equals(senha)){
            JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos 2!"+linha);
        }*/
       
        
    }
}
