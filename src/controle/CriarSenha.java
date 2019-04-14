/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import modelo.Usuario;

/**
 *
 * @author julio
 */
public class CriarSenha {
    Usuario u = new Usuario();
    public void CriarSenha() throws FileNotFoundException, IOException{
	
        PrintWriter arq = new PrintWriter("./login/"+u.getEmail()+".txt");
        arq.println(u.getSenha());
        arq.close();
            //JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos 1!"+linha);

    }
    
    public boolean CompareSenha() throws IOException{
        if(u.getSenha().equals(u.getcSenha())){
            new CriarSenha().CriarSenha();
            return true;
        }
        return false;
    }
}



