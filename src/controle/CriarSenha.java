/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author julio
 */
public class CriarSenha {
    public void CriarSenha(String email, String senha) throws FileNotFoundException, IOException{
	
        PrintWriter arq = new PrintWriter("./login/"+email+".txt");
        arq.println(senha);
        arq.close();
            //JOptionPane.showMessageDialog(null, "Email e/ou senha inválidos 1!"+linha);

    }
}



